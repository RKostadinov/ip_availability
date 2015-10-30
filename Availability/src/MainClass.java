import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		System.out.println("Въведете команда: ");
		
		Scanner in = new Scanner(System.in);
		
		
		while(true){
			
			commandsHandler.execute(in.next());
		}
		
		
	}

}
