package main;

import java.io.PrintStream;
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

	}
	
	public void afterLogin(){
		count++;
		Date date = new Date();
		dates.add(date);

	}
	
	public void afterLogout(){
		Date date = new Date();
		dates.add(date);

		}
	
	public void display(PrintStream out){
		out.printf("%d:", count);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH'_'mm'_'ss.SSSZ");
		for(Date date:dates){
			out.printf("%s:",dateFormat.format(date));
		}		
		out.println();
	}
	
	
	

}
