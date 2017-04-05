package com.cmpe220.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmpe220.object.JsonRequestWrapper;
import com.cmpe220.service.OcrImageToTextConverterService;

@RestController
public class OcrImageToTextConverterController {

	@Autowired
	private OcrImageToTextConverterService getTextFromReceiptService;
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/getReceiptDetails")
	public JsonRequestWrapper getReceiptDetails(){
		JsonRequestWrapper obj = new JsonRequestWrapper();
		obj = getTextFromReceiptService.getReceiptDetails();
		return obj;
	}
	
	@RequestMapping("/getItemsFromReceipt")
	public List<Integer> getItemsFromReceipt(){
		List<Integer> itm = getTextFromReceiptService.getItemsFromReceipt();
		return itm;
	}
	
	@RequestMapping("/getTotalFromReceipt")
	public String getTotalFromReceipt(){
		String total = null;
		total = getTextFromReceiptService.getTotalFromReceipt();
		return total;
	}
	@RequestMapping("/getTaxFromReceipt")
	public String getTaxFromReceipt(){
		String total = null;
		total = getTextFromReceiptService.getTaxFromReceipt();
		return total;
	}
}
