import java.util.Scanner;

public class ScoresTied {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int hankees;
		int socks;
		
		System.out.print("What did the Hankees score? ");
		hankees = keyboard.nextInt();
		
		System.out.print("What did the Socks score? ");
		socks = keyboard.nextInt();
		
		System.out.println();
		
		if (hankees >= socks){
			if (hankees == socks){
				System.out.println("It's a tie!");
			}
			
			System.out.print("Hankees: ");
			System.out.println(hankees);
			System.out.print("Socks: ");
			System.out.println(socks);
		}
		else{
			System.out.print("Socks: ");
			System.out.println(socks);
			System.out.print("Hankees: ");
			System.out.println(hankees);
		}
		
		keyboard.close();
	}
}
