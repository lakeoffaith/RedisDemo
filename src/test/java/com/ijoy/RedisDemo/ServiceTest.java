package com.ijoy.RedisDemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class ServiceTest {
	@Autowired
	public serviceImpl service;

	@Test
	public void demo() {
		String s = service.get();
		Assert.assertTrue(s.length() > 0);
		System.out.println(s);
	}
}
