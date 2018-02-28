package com.technerder.blockgame.manager;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import com.technerder.blockgame.BlockGame;

public class DisplayManager {

	public final BlockGame blockGame;

	public DisplayManager(BlockGame blockGame) {

		this.blockGame = blockGame;

	}

	public void setupDisplay() {

		try {

			Display.setDisplayMode(new DisplayMode(720, 480));
			Display.setTitle("BlockGame");
			Display.setResizable(false);
			Display.create();

			while (!Display.isCloseRequested()) {
				Display.update();
				Display.sync(60);
			}

		} catch (LWJGLException e) {

		}

	}

}