package com.tts.TestingWebApplication.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tts.TestingWebApplication.HomeController;

@SpringBootTest
public class SmokeTest {
	
	@Autowired
	private HomeController controller;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
		
	}
	
	
}
