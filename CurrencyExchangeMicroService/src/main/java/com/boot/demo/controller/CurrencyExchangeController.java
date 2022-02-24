package com.boot.demo.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.boot.demo.model.ConversionBean;


@RestController
public class CurrencyExchangeController {

	@Autowired
	private RestTemplate template;
	
	@RequestMapping("/exchange/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean calculateAmount(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity)
	{
		
		String url = "http://FOREX-SERVICE/currency-exchange/from/{from}/to/{to}";
		
		Map<String , String> map = new HashMap<String, String>();
		map.put("from", from);
		map.put("to", to);
		ConversionBean bean = template.getForObject(url, ConversionBean.class, map);
		bean.setQuantity(quantity);
		bean.setTotalCalculatedAmount(bean.getQuantity().multiply(bean.getConversionMultiple()));
		return bean;
	}
	
	
}
