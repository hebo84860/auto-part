package service;

import com.hefeng.part.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestUserService extends BaseTest{
	
	@Autowired
	private IUserService userService;
	
	@Test
	public void testGetUser(){
		System.out.println(userService.getUser("asddsa"));
	}

}
