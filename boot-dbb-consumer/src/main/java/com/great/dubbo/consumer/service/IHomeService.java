package com.great.dubbo.consumer.service;

import java.util.List;

import com.great.dubbo.common.po.UserInfo;

public interface IHomeService {

	List<UserInfo> getManyUserInfo(String uid);
}
