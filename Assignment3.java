package com.myjava.constructors;
/*
 * Create a program to demonstrate Constructor Chaining. Between the same class

and between the child and parent class.
 */
	 
	public class Assignment3 {//proper naming conventions is used 
	     
	    public Assignment3(){
	        System.out.println("In default constructor...");
	    }
	    public Assignment3(int i){
	        this();
	        System.out.println("In single parameter constructor...");
	    }
	    public Assignment3(int i,int j){
	        this(j);
	        System.out.println("In double parameter constructor...");
	    }
	     
	    public static void main(String a[]){// Main methods starts
	    	Assignment3 ch = new Assignment3(10,20);
	    }
	}// class closed

