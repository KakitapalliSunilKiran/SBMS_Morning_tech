package com.example.demo.exceptions;

public class Errormess {
	
	int statusCode;
	String reason;

	 public Errormess() {
	    }

	    public Errormess(int statusCode, String reason) {
	        this.statusCode = statusCode;
	        this.reason = reason;
	    }

	    public int getStatusCode() {
	        return statusCode;
	    }

	    public void setStatusCode(int statusCode) {
	        this.statusCode = statusCode;
	    }

	    public String getReason() {
	        return reason;
	    }

	    public void setReason(String reason) {
	        this.reason = reason;
	    }
}
