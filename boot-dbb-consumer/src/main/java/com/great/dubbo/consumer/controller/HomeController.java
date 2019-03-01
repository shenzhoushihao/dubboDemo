package com.great.dubbo.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.great.dubbo.common.po.UserInfo;
import com.great.dubbo.consumer.service.IHomeService;

@RestController
@RequestMapping("/v1")
public class HomeController {

	@Autowired
	private IHomeService homeService;

	@GetMapping("/index")
	public List<UserInfo> getUserInfoList(@RequestParam(name = "uid", required = false) String uid) {
		return homeService.getManyUserInfo(uid);
	}

}
