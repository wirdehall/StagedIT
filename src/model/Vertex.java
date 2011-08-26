package model;

class Vertex {
	public float x, y, z;
	public float u, v;
	public float r, g, b, a;
	
	public Vertex() {
		this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
	}
	
	public Vertex(float x, float y, float z, float u, float v) {
		this(x, y, z, u, v, 1.0f, 1.0f, 1.0f, 1.0f);
	}
	
	public Vertex(float x, float y, float z, float u, float v, float r, float g, float b, float a) {
		this.x = x; this.y = y; this.z = z;
		this.u = u; this.v = v;
		this.r = r; this.g = g; this.b = b; this.a = a;
	}
	
}