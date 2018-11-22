package racingGame;


import java.util.ArrayList;
import java.util.Scanner;

public class RacingMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	

		System.out.println("5마리 말이 100m 경주를 합니다.");
		System.out.print("말 번호를 고르세요 (1~5) : ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(num+"번 말을 고르셨습니다.");
		System.out.println("## 경주를 시작합니다. ##");
		
		Thread race = new Race("1",new Rank(),num);
		Thread race2 = new Race("2",new Rank(),num);
		Thread race3 = new Race("3",new Rank(),num);
		Thread race4 = new Race("4",new Rank(),num);
		Thread race5 = new Race("5",new Rank(),num);
		
		race.start();
		race2.start();
		race3.start();
		race4.start();
		race5.start();
		
		
	}

}
