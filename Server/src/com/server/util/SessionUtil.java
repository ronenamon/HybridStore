package com.server.util;

import java.util.HashMap;
import java.util.Map;

import com.server.model.Users;

public class SessionUtil {
	public static Map<String, Users> sessions = new HashMap<String, Users>();// store all users sessions
}
