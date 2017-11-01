package com.csv.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationServices {

	@RequestMapping(value = "/value", method = RequestMethod.GET)
	public String getValue() {
		return "get method executed!!!";
	}

	// @Autowired
	// JobLauncher jobLauncher;
	//
	// @Autowired
	// Job processJob;
	//
	// @RequestMapping(path = "/startJob", method = RequestMethod.GET, headers =
	// "Accept=application/json", produces = "application/json")
	// public String startJob() throws Exception {
	//
	// JobParameters jobParameters = new JobParametersBuilder().addLong(
	// "time", System.currentTimeMillis()).toJobParameters();
	// jobLauncher.run(processJob, jobParameters);
	//
	// return "Batch job has been invoked";
	// }
}
