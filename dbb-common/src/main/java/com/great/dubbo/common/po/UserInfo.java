package com.great.dubbo.common.po;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6856270722322756139L;

	private String uid;
	private String userName;
	private String address;
	private String phone;
}
