package racingGame;

import java.util.Random;
import java.util.Scanner;

public class Race extends Thread {
	Rank rank;
	String name;
	int distance = 0;
	static int count=1;
	static int num ;	
	
	public Race(String a, Rank b, int Num) {
		name = a;
		rank = b;
		num = Num;
	}
	
	
	public int race() {
		if(new Random().nextInt(10) < 1 ) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
		int temp_dis = new Random().nextInt(10);
		distance += temp_dis;
			
		return distance;
	}
	
	
	public void run() {
		
		
		
		while(distance < 100) {
			System.out.println(name + "번 말은 지금 "+ race() +"m에 있습니다.");
		}
		rank.finish(name);
		

		while(Thread.activeCount() == 2) {
			rank.printall(num);
			break;
		}
		
		
	}
	
	
	


}










