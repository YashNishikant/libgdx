package com.mygdx.game;

import com.badlogic.gdx.Game; 
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends Game {
	
	private SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
	}

	@Override
	public void render () {

	}
	
	public SpriteBatch getBatch() {
		return this.batch;

	}
}
