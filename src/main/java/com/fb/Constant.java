package com.fb;

public class Constant {

	private Constant() {
	}

	public static final String SERVER_URL = "fb.url";

	public static final String RESOURCE = "fb.resource";

	public static String resourcePath = "";
	
	/**
	 * 登陆cookie的有效期，单位：秒
	 */
	public static int LOGIN_COOKIE_MAX_AGE = 86400;
	
	/**
	 * 登陆cookie名称
	 */
	public static String LOGIN_COOKIE_NAME = "loginflag";
	
}
