package com.technerder.blockgame;

import java.io.File;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

import com.technerder.blockgame.manager.AudioManager;
import com.technerder.blockgame.manager.DisplayManager;
import com.technerder.blockgame.manager.InputManager;

public class BlockGame {

	private final AudioManager audioManager;
	private final DisplayManager displayManager;
	private final InputManager inputManager;

	public BlockGame() {

		audioManager = new AudioManager(this);
		displayManager = new DisplayManager(this);
		inputManager = new InputManager(this);
		
		startGame();

	}

	public void startGame() {

		displayManager.setupDisplay();
		
	}

	public void endGame() {

		Display.destroy();
		System.exit(0);

	}

	public void startGameLoop() {

	}

	public AudioManager getAudioManager() {

		return audioManager;

	}

	public DisplayManager getDisplayManager() {

		return displayManager;

	}

	public InputManager getInputManager() {

		return inputManager;

	}

	public static void main(String[] args) throws LWJGLException {

		System.setProperty("org.lwjgl.librarypath", new File("./lib").getAbsolutePath());

		new BlockGame();

	}

}