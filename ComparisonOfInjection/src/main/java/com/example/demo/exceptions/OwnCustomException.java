package com.example.demo.exceptions;

public class OwnCustomException extends RuntimeException
{
	public OwnCustomException(String str){
		super(str);
	}
}
