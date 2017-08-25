package cn.hnedu.zxjy.module.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.hnedu.zxjy.module.account.service.UserService;

@Controller("/account")
public class AccountController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Boolean login(String username, String password) {
		return false;
	}

}
