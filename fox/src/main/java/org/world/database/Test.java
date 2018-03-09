package org.world.database;

import org.world.service.UserService;

public class Test {
	public static void main(String[] args) {
		UserService us=new UserService();
		us.queryAll(1, 6);
	}
}
