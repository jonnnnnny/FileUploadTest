package com.jonny.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
*
*@author created by jonny
*@date 2017��3��13��--����9:21:50
*
**/
@Controller
public class FileUploadController
{
	@RequestMapping("/uploadForm")
	public String uploadForm()
	{
		System.out.println("uploadForm");
		return "uploadForm";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(HttpServletRequest request,
			@RequestParam("description") String description,
			@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException
	{
		System.out.println(description);
		if (! file.isEmpty())
		{
			String path = request.getServletContext().getRealPath("/images/");
			String filename = file.getOriginalFilename();
			File filepath = new File(path, filename);
			if (! filepath.getParentFile().exists())
			{
				filepath.getParentFile().mkdirs();
			}
			file.transferTo(new File(path+File.separator+filename));
			return "success";
		}else{
			return "error";
		}
	}
	
	@RequestMapping("/registerForm")
	public String registerForm()
	{
		System.out.println("register");
		return "registerForm";
	}
	
	@RequestMapping("register")
	public String register(HttpServletRequest request,
			@ModelAttribute User user, Model model) throws IllegalStateException, IOException
	{
		System.out.println(user.getUsername());
		if (!user.getImage().isEmpty())
		{
			String path = request.getServletContext().getRealPath("/images/");
			String filename = user.getImage().getOriginalFilename();
			File filepath = new File(path, filename);
			if (! filepath.getParentFile().exists())
			{
				filepath.getParentFile().mkdirs();
			}
			user.getImage().transferTo(new File(path+File.separator+filename));
			model.addAttribute("user", user);
			return "userInfo";
		}
		return "error";
	}
}
