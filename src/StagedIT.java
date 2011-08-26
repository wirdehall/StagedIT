import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import controller.*;

public class StagedIT {

	Stage stage;

	public StagedIT() {
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		stage = new Stage();
	}

	public void run() {
		stage.run();
	}
	//TODO: Läs av argumenten och skicka in dem till stage i form av vilken fil du vill editera.
	public static void main(String[] argv) {
		StagedIT stagedIT = new StagedIT();
		stagedIT.run();
	}
}