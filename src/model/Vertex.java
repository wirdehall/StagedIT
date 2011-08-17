package model;

class Vertex {
	public float x, y, z;
	public float u, v;
	public float r, g, b;
	
	public boolean hasColor = false;
	
	public Vertex() {
		this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
	}
	
	public Vertex(float x, float y, float z, float u, float v) {
		this.x = x; this.y = y; this.z = z;
		this.u = u; this.v = v;
	}
	
	public Vertex(float x, float y, float z, float u, float v, float r, float g, float b) {
		this.x = x; this.y = y; this.z = z;
		this.u = u; this.v = v;
		this.r = r; this.g = g; this.b = b;
		hasColor = true;
	}
	
}