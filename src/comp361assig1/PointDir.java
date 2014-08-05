package comp361assig1;

import java.awt.geom.Point2D;

public class PointDir {
	private Point2D.Float p;
	private LeftRight d;

	public enum LeftRight {
		LEFT,
		RIGHT
	};

	public PointDir(float x, float y, LeftRight d) {
		this.p = new Point2D.Float(x,y);
		this.d = d;
	}

	public float x() {
		return (float) p.getX();
	}

	public float y() {
		return (float) p.getY();
	}

	public LeftRight d() {
		return d;
	}
}
