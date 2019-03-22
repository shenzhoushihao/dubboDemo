package com.great.dubbo.consumer.service.impl;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.great.dubbo.common.api.IUserService;
import com.great.dubbo.common.po.UserInfo;
import com.great.dubbo.consumer.service.IHomeService;

@Service
public class HomeService implements IHomeService {

	@Reference(version = "1.0.0")
	private IUserService userService;

	@Override
	public List<UserInfo> getManyUserInfo(String uid) {
		System.out.println("“正在获取......”");
		return userService.getUserInfo(uid);
	}

}
