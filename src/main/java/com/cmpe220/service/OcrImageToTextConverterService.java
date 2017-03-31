package com.cmpe220.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@Service
public class OcrImageToTextConverterService {
	
	private final static String DEFAULT_TESSDATA_PATH = "/usr/local/share";
    private final static String DEFAULT_PAGE_SEG_MODE = "3";
    private final static String DEFAULT_LANG = "eng";
	
	public String convertReceiptToText() {
		String textFromReceipt = null;
		File imageFile = new File("/Users/poojaprakashchand/Downloads/bill2.jpeg");
		Tesseract instance = new Tesseract();
		instance.setLanguage(DEFAULT_LANG);
        instance.setDatapath(DEFAULT_TESSDATA_PATH);
        instance.setPageSegMode(Integer.parseInt(DEFAULT_PAGE_SEG_MODE));
        try{
        	textFromReceipt = instance.doOCR(imageFile); 
        	//System.out.println(textFromReceipt);
        } catch(TesseractException e){
        	System.err.println(e.getMessage());
        }		
        return textFromReceipt;
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
		String patternString = "((" + StringUtils.join(tokens, "|") + ")(?=(:*[\\s]*[$]*[0-9])))+(:*[\\s]*[$]*[0-9]+)";
		//String patternString = "((" + tokens + "))";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			totalResult = matcher.group();
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
		String patternString = "((" + StringUtils.join(tokens, "|") + ")(?=(:*[\\s]*[$]*[0-9]+.[0-9]*)))+(:*[\\s]*[$]*[0-9]+.[0-9]*)";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		
		while (matcher.find()) {
			tax = matcher.group();
		}
		//System.out.println(text);
		return tax;
	}

}
