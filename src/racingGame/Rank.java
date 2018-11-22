package racingGame;

import java.util.ArrayList;

public class Rank {
		static ArrayList<String> list = new ArrayList<>();
		int rank;
		
		public int getRank() {
			return rank;
		}
		public void setRank(int new_rank) {
			rank = new_rank;
		}
		
		public void finish(String name) {
			rank = Race.count++;
			System.out.println(name+"번 말이"+rank+"등으로 도착하였습니다.");
			list.add(name);
		}
		
		public void printall(int num) {
			System.out.println("##경기결과##");
			for(int i = 0; i < list.size(); i++) {
				System.out.print("["+(i+1)+"등]");
				System.out.print(list.get(i)+"번 말");
				
				if(Integer.parseInt(list.get(i)) == num) {
					System.out.print("<- 당신이 고른 말");
				}
				
				System.out.println("");
			}
		}
	
}
