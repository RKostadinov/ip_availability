package user;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Interval {
	
	private Date from;
	private Date to;
	
	public Interval(Date from) {
		this.from = from;
		to = null;
	}
	
	public void setTo(Date to) {
		this.to = to;
		}
	
	private String formatDate(Date date) {
		return new SimpleDateFormat("yyyy-­MM-dd'T'HH'_'mm'_'ss.SSSZ").format(date);
	}
	
	public String from() {
		return formatDate(from);
		}
	public String to() {
		if(to != null){
			return formatDate(to); 
		}else{
			return "";	
			 }
		}

}