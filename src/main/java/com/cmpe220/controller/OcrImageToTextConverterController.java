package com.cmpe220.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cmpe220.service.OcrImageToTextConverterService;

@RestController
public class OcrImageToTextConverterController {

	@Autowired
	private OcrImageToTextConverterService getTextFromReceiptService;
	
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
