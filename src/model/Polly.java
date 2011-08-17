package model;

import model.*;
import java.util.ArrayList;

public class Polly {
	int numVertices;
	public ArrayList<Vertex> vertices;
	
	public Polly(ArrayList<Vertex> vertices) {
		this.numVertices = vertices.size();
		this.vertices = vertices;
	}
	
	public int getLenght() {
		return numVertices;
	}
}