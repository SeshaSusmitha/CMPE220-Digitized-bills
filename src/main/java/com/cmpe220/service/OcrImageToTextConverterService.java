package com.cmpe220.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmpe220.object.Item;
import com.cmpe220.object.JsonRequestWrapper;
import com.cmpe220.object.SplitFriendsDetails;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@Service
public class OcrImageToTextConverterService {
	
	private final static String DEFAULT_TESSDATA_PATH = "/usr/local/share";
    private final static String DEFAULT_PAGE_SEG_MODE = "3";
    private final static String DEFAULT_LANG = "eng";
	
	public String convertReceiptToText() {
		String textFromReceipt = null;
		File imageFile = new File("./src/main/resources/receiptImage/bill1.png");
		Tesseract instance = new Tesseract();
		instance.setLanguage(DEFAULT_LANG);
        instance.setDatapath(DEFAULT_TESSDATA_PATH);
        instance.setPageSegMode(Integer.parseInt(DEFAULT_PAGE_SEG_MODE));
        try{
        	textFromReceipt = instance.doOCR(imageFile); 
        	System.out.println(textFromReceipt);
        } catch(TesseractException e){
        	System.err.println(e.getMessage());
        }		
        return textFromReceipt;
	}
	
	@ResponseBody
	public JsonRequestWrapper getReceiptDetails(){
		OcrImageToTextConverterService serviceObj = new OcrImageToTextConverterService();
		
		JsonRequestWrapper obj = new JsonRequestWrapper();
		obj.setBillPath("./src/main/resources/receiptImage/bill1.png");
		obj.setUserID(0);
		obj.setTax(serviceObj.getTaxFromReceipt());
		obj.setTotal(serviceObj.getTotalFromReceipt());
		obj.setBillName("costco");
		obj.setItems(serviceObj.getItemDetails());
		return obj;
	}
	
	public List<Item> getItemDetails(){
		
		List<Item> items = Arrays.asList(
			new Item("1","biscuit","10", 
					Arrays.asList(new SplitFriendsDetails(1,5.0), 
								  new SplitFriendsDetails(2,5.0))
					),
			new Item("2", "coke", "20",
					//Arrays.asList(new SplitFriendsDetails(1,10.0), 
						//	  	  new SplitFriendsDetails(2,10.0))
					Arrays.asList(null, 
						  	  null)
					),
			new Item("3","pepsi","10", 
					null
					)
			);
		return items;
	}
	
	@ResponseBody
	 public List<Integer> getItemsFromReceipt() {
		  String text = convertReceiptToText();
		  List<Integer> rates = new ArrayList<Integer>();
		  Scanner scanner = new Scanner(text);
		  while (scanner.hasNextLine()) {
		   String line = scanner.nextLine();
		   try {
		    if (line.length() > 0) {
		     if (Character.isDigit(line.charAt(0))) {
		      String num = extract(line);
		      if (null != num && num.length() > 0) {
		       if (Character.isDigit(num.charAt(0))) {
		        rates.add(Integer.parseInt(num));
		       }
		      }
		     }
		    }
		   } catch (Exception e) {

		   }
		  }
		  scanner.close();
		  System.out.println(rates);

		  return rates;
		 }

		 public static String extract(String string) {
		  assert string != null;
		  int i = string.lastIndexOf(' ');
		  if (i == -1)
		   return null;
		  String last = string.substring(i + 1);
		  return last;
		 }

	@ResponseBody
	public String getTotalFromReceipt(){
		String text = convertReceiptToText();
        String totalResult = null;
		List<String> tokens = new ArrayList<String>();
		tokens.add("Total Due");
		tokens.add("ATC");
		//((SEQ|Card)(?=(:[\s]*[0-9])))+(:[\s]*[0-9]+)
		
		//((INVOICE|ATC)(?=(:*[\s]*[$]*[0-9])))+(:*[\s]*[$]*[0-9]+)
		//String patternString = "\\b(" + StringUtils.join(tokens, "|") + ")\\b";
		String patternString = "((" + StringUtils.join(tokens, "|") + ")(?=(:*[\\s]*[$]*[0-9]+.[0-9]*)))+(:*[\\s]*[$]*([0-9]+.[0-9]*))";
		//String patternString = "((" + tokens + "))";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			totalResult = matcher.group(5);
		}
		return totalResult;
		
	}
	
	@ResponseBody
	public String getTaxFromReceipt(){
		String text = convertReceiptToText();
        String tax = null;
        List<String> tokens = new ArrayList<String>();
		tokens.add("Tax");
		tokens.add("Card");
		String patternString = "((" + StringUtils.join(tokens, "|") + ")(?=(:*[\\s]*[$]*[0-9]+.[0-9]*)))+(:*[\\s]*[$]*([0-9]+.[0-9]*))";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		
		while (matcher.find()) {
			tax = matcher.group(5);
		}
		//System.out.println(text);
		return tax;
	}
	
}
