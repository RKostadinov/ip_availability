package user;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

import main.DataHolder;

public class User {
	String user;
	boolean loggedIn;
	Integer count = 0;
	ArrayList<Interval> dates;
	Socket socket;
	
	public User(String user, Socket socket) {
		this.user = user;
		this.socket = socket;
		
		count = 1;
		dates = new ArrayList<>();
		Date date = new Date();
		dates.add(new Interval(date));

	}
	
	public void afterLogin(){
		count++;
		Date date = new Date();
		dates.add(new Interval(date));
		loggedIn = true;

	}
	
	public void afterLogout(){
		Date date = new Date();
		dates.get(dates.size()-1).setTo(date);
		loggedIn = false;
		}
	
	public void display(PrintStream out){
		out.printf("%d:", count);
		for(Interval interval:dates){
			out.printf("%s:",interval.from());
			out.printf("%s:",interval.to());
		}		
		out.println();
	}

	public void disconnect() throws IOException {
		socket.close();
		DataHolder dataHolder = DataHolder.getInstance();
		if (dataHolder.currentlyLoggedUsers.contains(user)) {
			dataHolder.currentlyLoggedUsers.remove(user);
			dataHolder.usersToLoginCount.get(user).afterLogout();
		}
			
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
	

}
