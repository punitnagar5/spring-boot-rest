package com.qait.spring_boot_rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qait.spring_boot_rest.beans.StudentRegistration;
import com.qait.spring_boot_rest.beans.StudentRegistrationReply;

@Controller
public class StudentRegisterController {

	@RequestMapping(method = RequestMethod.POST, value = "/register/student")
	@ResponseBody
	StudentRegistrationReply registerStudent(@RequestBody StudentRegistration studentregd) {
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		stdregreply.setName(studentregd.getName());
		stdregreply.setAge(studentregd.getAge());
		stdregreply.setRegistrationNumber("123456");
		stdregreply.setRegistrationStatus("Successful");
		return stdregreply;
	}
	
	
	}

