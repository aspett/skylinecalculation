package comp361assig1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		Triple[] triples = new Triple[]{
				new Triple(0,2,1),
				new Triple(1,4,2),
				new Triple(2,3,3),
				new Triple(5,6,2)
		};
		ArrayList<Triple> a = new ArrayList<Triple>();
		for(Triple t : triples) a.add(t);

		JFrame f = new JFrame();
		f.add(new LePanel(a));
		f.setSize(800,800);
		f.setVisible(true);

	}

	public List<PointDir> runAlgorithm(List<Triple> input) {
		List<PointDir> result = new ArrayList<>();
		//Direct
		if(input.size() == 1) {
			Triple t = input.get(0);
			result.add(new PointDir(t.l, t.h, PointDir.LeftRight.LEFT));
			result.add(new PointDir(t.r, 0, PointDir.LeftRight.RIGHT));
		}

		//Divide
		List<PointDir> firstHalf;
		List<PointDir> secondHalf;
		if(input.size() % 2 == 0) {

		}

		//Conquerrrrrrrrrrrrrrrrrrrrrrrrrrrroooney
		//Combine firstHalf and secondHalf

		return result;
	}



}
