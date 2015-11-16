package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UserInfo {
	Integer count = 0;
	ArrayList<Date> dates;
	
	public UserInfo() {
		super();
		count = 1;
		dates = new ArrayList<>();
		Date date = new Date();
		dates.add(date);
		System.out.println(date);
	}
	
	public void afterLogin(){
		count++;
		Date date = new Date();
		dates.add(date);
		System.out.println(date);
	}
	
	public void afterLogout(){
		Date date = new Date();
		dates.add(date);
		System.out.println(date);
		}
	
	public void display(){
		System.out.printf("%d:", count);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH'_'mm'_'ss.SSSZ");
		for(Date date:dates){
			System.out.printf("%s:",dateFormat.format(date));
		}		
		System.out.println();
	}
	
	
	

}
