package com.csv.batch.step;

import org.springframework.batch.item.ItemProcessor;

public class BatchItemProcessor implements ItemProcessor<String, String>{

	@Override
	public String process(String value) throws Exception {
		// TODO Auto-generated method stub
		return value.toUpperCase();
	}

}
