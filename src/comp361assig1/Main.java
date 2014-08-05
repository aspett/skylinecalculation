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

		runAlgorithm(a);

	}

	public static List<PointDir> runAlgorithm(List<Triple> input) {
		List<PointDir> result = new ArrayList<>();
		//Direct
		if(input.size() == 1) {
			Triple t = input.get(0);
			result.add(new PointDir(t.l, t.h, PointDir.LeftRight.LEFT));
			result.add(new PointDir(t.r, 0, PointDir.LeftRight.RIGHT));
			System.out.printf("Base case: %s\n", t);
			return result;
		}

		//Divide
		List<PointDir> firstHalf;
		List<PointDir> secondHalf;

		List<Triple> firstHalfInput = new ArrayList<>();
		List<Triple> secondHalfInput = new ArrayList<>();
		int half;
		if(input.size() % 2 == 0)
			half = input.size() / 2;
		else
			half = (int) Math.ceil(input.size() / 2);

		for(int i = 0; i < half; i++)
			firstHalfInput.add(input.get(i));
		for(int i = half; i < input.size(); i++)
			secondHalfInput.add(input.get(i));

		System.out.printf("First: %s\n", firstHalfInput);
		System.out.printf("Second: %s\n", secondHalfInput);

		firstHalf = runAlgorithm(firstHalfInput);
		secondHalf = runAlgorithm(secondHalfInput);

		System.out.println("RESULTZ?");

		//Conquerrrrrrrrrrrrrrrrrrrrrrrrrrrroooney
		//Combine firstHalf and secondHalf

		return result;
	}



}
