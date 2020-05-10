package com.junit.demo;


public class Calculator {
		  
		 public double multiply(double a, double b) {
		  return a * b;
		 }
		  
		 public double divide(double a, double b) { 
		  if(b == 0) {
		   throw new ArithmeticException();
		  }
		  return a / b;
		 } 
		 public double sum(double a, double b) {
			 return a + b;
		 }
		 public double resta(double a, double b) { 
			 if(a < b) {
			   throw new NoEsPotRestarException();
			  }
			  return a - b;
			} 
		 public int factorial(int a) {
			 if(a < 0) throw new EsNegatiuException();
			 else if(a > 0) {
				 int result = 1;
				 while(a > 1) {
					 result *= a;
					 --a;
				 }
				 return result;
			 }
			 else return 1;
		 }
		}
