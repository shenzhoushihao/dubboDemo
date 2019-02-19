package com.great.dubbo.comsumer.service;

import java.util.List;

import com.great.dubbo.common.po.UserInfo;

public interface IHomeService {

	List<UserInfo> getMoreUserInfo(String uid);

}
