package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		for(int i = 1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("for dongusu bitti");
		
		//while
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while loop finished");
		
		//do while
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j<10);
		System.out.println("do while dongusu bitti");

	}

}
