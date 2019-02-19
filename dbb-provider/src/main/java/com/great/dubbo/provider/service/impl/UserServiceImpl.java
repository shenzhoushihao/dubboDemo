package com.great.dubbo.provider.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.great.dubbo.common.api.IUserService;
import com.great.dubbo.common.po.UserInfo;

public class UserServiceImpl implements IUserService {

	@Override
	public List<UserInfo> getUserInfo(String uid) {

		List<UserInfo> list = new ArrayList<>();
		UserInfo u1 = new UserInfo();
		u1.setUid("1");
		u1.setUserName("roc");
		u1.setPhone("010-4589-9876");
		u1.setAddress("天津市");
		UserInfo u2 = new UserInfo();
		u2.setUid("2");
		u2.setUserName("Jenny");
		u2.setPhone("010-2345-4325");
		u2.setAddress("北京市");
		UserInfo u3 = new UserInfo();
		u3.setUid("3");
		u3.setUserName("Danny");
		u3.setPhone("010-5678-4563");
		u3.setAddress("上海市");

		list.add(u1);
		list.add(u2);
		list.add(u3);

		if (StringUtils.isNotBlank(uid)) {
			return list.stream().filter((UserInfo u) -> u.getUid().equalsIgnoreCase(uid)).collect(Collectors.toList());
		} else {
			return list;
		}
	}

}
