package racingGame;

import javax.swing.JOptionPane;

public class Rank {
	
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
			
			if(rank == 1) {
			JOptionPane.showMessageDialog(null, "1등말은 "+name+"입니다.");
			}
		}
		
		
	
}
