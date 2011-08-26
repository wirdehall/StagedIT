package model;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;
import org.newdawn.slick.Color;
import model.*;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

public class Surface {
	private String textureName;
//	private Texture texture;
	private String comment;
	private LinkedList<Vertex> vertices;
	private String type;
	private final static Map<String, Integer> OPEN_GL_TYPES;
	static {
	        HashMap<String, Integer> aMap = new HashMap<String, Integer>();
	        aMap.put("QUADS", GL_QUADS);
	        aMap.put("TRIANGLES", GL_TRIANGLES);
	        OPEN_GL_TYPES = Collections.unmodifiableMap(aMap);
	    }
	
	
	public Surface(String textureName, String comment, String type, LinkedList<Vertex> vertices) {
		this.comment = comment;
		this.vertices = vertices;
		this.textureName = textureName;
		this.type = type;
	}
	
	public void render() {
		render(new Point(), new Point(), new Point(1f, 1f, 1f));
	}
	
	public void render(Point position, Point rotation, Point scale) {
		glEnable(GL_TEXTURE_2D); // Enable Texture Mapping
		glLoadIdentity();
		glTranslatef(position.x, position.y, position.z);
		gluLookAt(0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
		glRotatef(rotation.x, 1.0f, 0.0f, 0.0f);
		glRotatef(rotation.y, 0.0f, 1.0f, 0.0f);
		glRotatef(rotation.z, 0.0f, 0.0f, 1.0f);
		glScalef(scale.x, scale.y, scale.z);
		TextureHandler.getInstance().getTexture(textureName).bind();
		glBegin(OPEN_GL_TYPES.get(type));
		for(Vertex vertex : vertices) {
				glColor4f(vertex.r, vertex.g, vertex.b, vertex.a);
				glTexCoord2f(vertex.u, vertex.v);
				glVertex3f( vertex.x, vertex.y, vertex.z);
		}
		glEnd();
	}
	
}