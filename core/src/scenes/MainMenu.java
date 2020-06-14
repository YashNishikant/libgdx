package scenes;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGdxGame;

public class MainMenu implements Screen{

	private MyGdxGame game;
	private Texture bg;
	
	public MainMenu(MyGdxGame game) {
		this.game = game;
		bg = new Texture("Game BG.png");
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		game.getBatch().begin();
		game.getBatch().draw(bg, 0, 0);
		game.getBatch().end();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {

	}
}
