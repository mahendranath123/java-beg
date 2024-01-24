package BasicJava;


import java.io.*;

public class ArmstrongSecondWay {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no for checking wheather strong no or not!");
		int no = Integer.parseInt(br.readLine());
		int result = no, rem, sum = 0;
		while (no > 0) {
			rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;
		}
		if (sum == result) {
			System.out.println(result + " is armstrong no");
		} else {
			System.out.println(result + "is not armstrong no");
		}
	}

}
