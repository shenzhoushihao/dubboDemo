package com.great.dubbo.comsumer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.great.dubbo.common.api.IUserService;
import com.great.dubbo.common.po.UserInfo;
import com.great.dubbo.comsumer.service.IHomeService;

@Service
public class HomServiceImpl implements IHomeService {

	@Autowired
	private IUserService userService;

	@Override
	public List<UserInfo> getMoreUserInfo(String uid) {
		List<UserInfo> list = userService.getUserInfo(uid);
		list.forEach((UserInfo u) -> {
			System.out.println("==>" + u.getUid());
			System.out.println("==>" + u.getUserName());
			System.out.println("==>" + u.getPhone());
			System.out.println("==>" + u.getAddress());
		});
		return list;
	}

}
