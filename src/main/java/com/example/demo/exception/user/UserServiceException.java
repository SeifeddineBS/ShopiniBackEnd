package com.example.demo.exception.user;

public class UserServiceException  extends RuntimeException{

	private static final long serialVersionUID=134877109171435607L;
	public UserServiceException(String message)
	{
		
		super(message);
		
	}
}
