package model;

public class Point {
	
	public float x, y, z;
	
	public Point() {
		this(0.0f, 0.0f, 0.0f);
	}
	
	public Point(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean isEqual(Point p) {
		if (x == p.x && y == p.y && z == p.z) {
			return true;
		} else {
			return false;
		}
	}
	
}