package com.yanghj.demo.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DingoService {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Scheduled(fixedDelay = 5000)
	public void dateTask() {
		LOG.info("SchedulerTask1 : " + new Date().toString());
		//业务逻辑
	}
}
