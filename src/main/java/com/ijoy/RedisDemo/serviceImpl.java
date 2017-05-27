package com.ijoy.RedisDemo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class serviceImpl {
	public String key="nihao";
	@Cacheable(value="common",key="#root.target.key")
	public String get() {
		return "nihao";
	}

}
