package com.great.dubbo.provider.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.great.dubbo.common.api.IUserService;
import com.great.dubbo.common.po.UserInfo;

@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements IUserService {

	@Override
	public List<UserInfo> getUserInfo(String uid) {
		List<UserInfo> list = new ArrayList<>();
		UserInfo u1 = new UserInfo();
		u1.setUid("1");
		u1.setUserName("GreatRoc");
		u1.setPhone("030-4589-9876");
		u1.setAddress("加拿大");
		UserInfo u2 = new UserInfo();
		u2.setUid("2");
		u2.setUserName("DearJenny");
		u2.setPhone("090-2345-4325");
		u2.setAddress("美利坚");
		UserInfo u3 = new UserInfo();
		u3.setUid("3");
		u3.setUserName("FallDanny");
		u3.setPhone("020-5678-4563");
		u3.setAddress("英吉利");

		list.add(u1);
		list.add(u2);
		list.add(u3);
		System.out.println("===================>正在返回.....");
		if (StringUtils.isNotBlank(uid)) {
			return list.stream().filter((UserInfo u) -> u.getUid().equalsIgnoreCase(uid)).collect(Collectors.toList());
		} else {
			return list;
		}
	}

}
