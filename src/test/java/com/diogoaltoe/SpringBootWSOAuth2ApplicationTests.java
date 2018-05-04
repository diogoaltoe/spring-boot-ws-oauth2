package com.diogoaltoe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.diogoaltoe.SpringBootWSOAuth2Application;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootWSOAuth2Application.class)
@WebAppConfiguration
public class SpringBootWSOAuth2ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
