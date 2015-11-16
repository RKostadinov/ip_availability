package main;
import java.util.Scanner;

public class MainClass {
	public static boolean run = true;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (run) {
			System.out.println("Въведете команда: ");

			CommandsHandler.execute(in.next());
		}
		in.close();

	}

}
