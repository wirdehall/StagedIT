package model;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class TextureHandler {
	
	private static TextureHandler instance = null;
	private HashMap<String, Texture> textures = new HashMap<String, Texture>();
	
	private TextureHandler() {
		
	}
	
	public Texture getTexture(String textureName) {
		if (!textures.containsKey(textureName)) {
			try {
				textures.put(textureName,TextureLoader.getTexture(textureName.substring(textureName.lastIndexOf('.')), new FileInputStream("data/textures/" + textureName)));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return textures.get(textureName);
	}
	
	
	public static TextureHandler getInstance() {
		if (instance == null) {
			instance = new TextureHandler();
		}
		return instance;
	}
	
	
}