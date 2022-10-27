package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tự nhiên n ");
		int n = sc.nextInt();
		int i =1 ;
		int sum = 0;
		while(i < n) {
			if(i % 3==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("Tổng của số chia hết cho 3 bé hơn n :"+ sum);

	}

}
