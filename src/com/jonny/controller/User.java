package com.jonny.controller;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

/**
*
*@author created by jonny
*@date 2017年3月14日--上午10:06:19
*
**/
public class User implements Serializable
{

	private String username;
	private MultipartFile image;
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public MultipartFile getImage()
	{
		return image;
	}
	public void setImage(MultipartFile image)
	{
		this.image = image;
	}
	
}
