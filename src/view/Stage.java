package view;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;
import org.newdawn.slick.*;

import java.util.LinkedList;
import model.*;

public class Stage {

	float rotate=0.0f;
	UnicodeFont uFont;	
	
	public Stage() {
		
		DisplayMode dm = Display.getDisplayMode();
		// init OpenGL here
		glClearColor(0,0,0,0);
		glViewport(0,0,800,600);
		glEnable(GL_DEPTH_TEST); // Enables Depth Testing
		glDepthFunc(GL_LEQUAL); // The Type Of Depth Testing To Do
		glEnable(GL_BLEND);									// Enables Transparancy
		glBlendFunc (GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);	// Enables Transparancy
		glShadeModel(GL_SMOOTH); // Enable Smooth Shading
		glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST); // Really Nice Perspective Calculations
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		gluPerspective(45.0f, 800.0f / 600.0f, 1.0f, 500.0f);
		glMatrixMode(GL_MODELVIEW);
		/*
		java.awt.Font font = new java.awt.Font("Arial", 0, 11);
		uFont = new UnicodeFont(font);
		uFont.addGlyphs("0123456789:FAILW!N.");
		uFont.getEffects().add(new org.newdawn.slick.font.effects.ColorEffect(java.awt.Color.WHITE));
		try {
			uFont.loadGlyphs();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

	public void render(LinkedList<StageObject> stageObjects) {
		// render OpenGL here
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

		glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
		glLoadIdentity(); // Reset current matrix (Modelview)
		
		for(model.StageObject stageObject : stageObjects) {
			stageObject.render();
		}
		
/*		stage.render();
		
		for(model.Drawable drawable : drawableThings) {
			drawable.render();
		}
		glLoadIdentity();
		gluLookAt(0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
		glPushMatrix();
		glOrtho(0, 800, 600, 0, 0.1f, 0);
		elapsedTime = Long.toString((controller.World.getTime()-startGameTime)/10);
		uFont.drawString(400, 180, elapsedTime.substring(0, elapsedTime.length()-2) + ":" + elapsedTime.substring(elapsedTime.length()-2), new Color(0.1f, 1.0f, 1.0f));
		//uFont.drawString(400, 180, Long.toString(elapsedTime/100) + ":" + Long.toString(elapsedTime%100), new Color(0.1f, 1.0f, 1.0f));
		glPopMatrix();
		*/
		
		Display.sync(60); // cap fps to 60fps
		Display.update();
	}
	 
}