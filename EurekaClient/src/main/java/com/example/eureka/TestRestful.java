package com.example.eureka;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestful {

	private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String home() {
		ServiceInstance instance = client.getLocalServiceInstance();
		logger.info("serviceId " + instance.getServiceId() + "  host:post="
				+ instance.getHost() + ":" + instance.getPort());
		return "hello info 2";
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String info() {
		return "i am info 2";
	}

}
