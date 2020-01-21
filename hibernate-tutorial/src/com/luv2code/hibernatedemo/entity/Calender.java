package com.luv2code.hibernatedemo.entity;

import java.util.Calendar;
import java.util.Locale;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calender = Calendar.getInstance(Locale.US);
		int currentMonth = calender.get(Calendar.MONTH);		
		System.out.println(currentMonth+1);
	}

}
