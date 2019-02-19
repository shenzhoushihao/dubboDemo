package com.great.dubbo.common.api;

import java.util.List;

import com.great.dubbo.common.po.UserInfo;

public interface IUserService {

	List<UserInfo> getUserInfo(String uid);

}
