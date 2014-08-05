package comp361assig1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class LePanel extends JPanel {
	private ArrayList<Triple> input;

	public LePanel(ArrayList<Triple> input) {
		this.input = input;
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D gg = (Graphics2D) g;

		int xoff = 20;
		int yoff = 100;
		int ysize = 200;
		int mf = 40;

		gg.drawLine(xoff, yoff, xoff, yoff+200);
		gg.drawLine(xoff, yoff+ysize, xoff+yoff+ysize, yoff+ysize);
		// new Triple(5,6,2)
		// LEFT, RIGHT, HEIGHT
		for(Triple t : input) {
			Rectangle2D r = new Rectangle2D.Float(xoff+(t.l*mf), yoff+ysize-(t.h*mf), (t.r-t.l)*mf, (t.h)*mf);
			gg.draw(r);
		}

		xoff = xoff+400;

		gg.drawLine(xoff, yoff, xoff, yoff+200);
		gg.drawLine(xoff, yoff+ysize, xoff+yoff+ysize, yoff+ysize);



	}

}
