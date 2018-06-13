package com.example.eureka;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private final Logger logger = Logger.getLogger(getClass());

	@Autowired
	private DiscoveryClient client;

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		//return "hello " + name + "，this is first messge";
		 return "hello "+name+"，this is producer 2  send second messge";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		ServiceInstance instance = client.getLocalServiceInstance();
		logger.info("serviceId " + instance.getServiceId() + "  host:post="
				+ instance.getHost() + ":" + instance.getPort());
		return "hello spring";
	}

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String info() {
		return "i am info";
	}

}
