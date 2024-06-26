package com.dotandbox.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.dotandbox.game.DotAndBox;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(650,480);
		config.setForegroundFPS(60);
		config.setTitle("Dot AndBox");
		new Lwjgl3Application(new DotAndBox(), config);
	}
}
