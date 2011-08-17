package controller;

import org.lwjgl.opengl.Display;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.Sys;
import model.*;

public class Stage {
	
	view.Stage stageView;
	model.Stage stageModel;
	
	public Stage() {
		this.stageView = new view.Stage();
		this.stageModel = new model.Stage();
	}
	
	public boolean run() {
		boolean endGame = false;
		boolean movingCamera = false;
		float lastMouseX = 0.0f;
		float lastMouseY = 0.0f;
		float tempX = 0.0f;
		float tempY = 0.0f;
		while (!Display.isCloseRequested() && !endGame) {
			// Rotera kameran
			if (Keyboard.isKeyDown(Keyboard.KEY_UP)) {
				//worldModel.getPlayer().xRot -= 1.0f;
			}

			if (Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
				//worldModel.getPlayer().xRot += 1.0f;
			}
		
			if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
				//worldModel.getPlayer().yRot -= 1.0f;
			}
			if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
				//worldModel.getPlayer().yRot += 1.0f;
			}
					
			while(Mouse.next()) {
				if (Mouse.getEventButton() == 0) {
					if (Mouse.getEventButtonState()) {
						movingCamera = true;
						lastMouseX = Mouse.getX();
						lastMouseY = Mouse.getY();
					} else {
						movingCamera = false;
					}
				}
				if (movingCamera && Mouse.getEventButton() == -1) {
					tempX = (Mouse.getX() - lastMouseX) / 10;
					if (tempX < 0) {
						//worldModel.getPlayer().yRot += Math.pow(tempX,2);
					} else {
						//worldModel.getPlayer().yRot -= Math.pow(tempX,2);
					}
				
					tempY = (Mouse.getY() - lastMouseY) / 10;
					if (tempY < 0) {
						//worldModel.getPlayer().yRot += Math.pow(tempY,2);
					} else {
						//worldModel.getPlayer().yRot -= Math.pow(tempY,2);
					}
				
					lastMouseY = Mouse.getY();
					lastMouseX = Mouse.getX();
				}
			}
		
			while (Keyboard.next()) {
			
				// Stäng av CubeMan
				if (Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) {
					if (Keyboard.getEventKeyState()) {
						System.out.println("Exiting StagedIT!");
						endGame = true;
					}
				}
			
				// Flytta Spelaren	
				if (Keyboard.getEventKey() == Keyboard.KEY_W) {
					if (Keyboard.getEventKeyState()) { 
						//worldModel.getPlayer().setMovingForward(true);
						////worldModel.getPlayer().setMovingForward(true);
					} else {
						//worldModel.getPlayer().setMovingForward(false);
						////worldModel.getPlayer().setMovingForward(false);
					}
				}
				if (Keyboard.getEventKey() == Keyboard.KEY_S) {
					if (Keyboard.getEventKeyState()) { 
						//worldModel.getPlayer().setMovingBackward(true);
					} else {
						//worldModel.getPlayer().setMovingBackward(false);
					}
				}
				if (Keyboard.getEventKey() == Keyboard.KEY_A) {
					if (Keyboard.getEventKeyState()) { 
						//worldModel.getPlayer().setMovingLeft(true);
					} else {
						//worldModel.getPlayer().setMovingLeft(false);
					}
				}
				if (Keyboard.getEventKey() == Keyboard.KEY_D) {
					if (Keyboard.getEventKeyState()) { 
						//worldModel.getPlayer().setMovingRight(true);
					} else {
						//worldModel.getPlayer().setMovingRight(false);
					}
				}
				if (Keyboard.getEventKey() == Keyboard.KEY_SPACE) {
					if (Keyboard.getEventKeyState()) { 
						//worldModel.getPlayer().jump();
					} else {
						////worldModel.getPlayer().setMovingRight(false);
					}
				}
			}
			this.stageModel.tick();
			this.stageView.render();
		}
		return false;
	}
}