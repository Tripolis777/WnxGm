package com.wnx.gm;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.wnx.gm.Screens.DesktopScreen;

public class WnxGmMain extends Game {
	public SpriteBatch batch;
	private Texture img;

	@Override
	public void create () {
		img = new Texture("badlogic.jpg");
		batch = new SpriteBatch();
		this.setScreen(new DesktopScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

}
