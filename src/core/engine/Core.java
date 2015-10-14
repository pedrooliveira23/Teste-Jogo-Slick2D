package core.engine;

import java.util.Arrays;

import javax.swing.JOptionPane;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

import core.engine.objects.Player;

public class Core extends BasicGame {

	private Player player;
	private LevelControl level;

	public Core(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		level.level(0).render(0, 0);
		player.getSprite().draw(player.getCoordenadas(0), player.getCoordenadas(1));
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		level = new LevelControl();
		player = new Player("data/recursos/sprites/player.png", 64, 64);
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		Input input = arg0.getInput();
		if (input.isKeyDown(Input.KEY_UP)) {
			player.movimentoCima(arg1);
		} else if (input.isKeyDown(Input.KEY_DOWN)) {
			player.movimentoBaixo(arg1);
		} else if (input.isKeyDown(Input.KEY_LEFT)) {
			player.movimentoEsquerda(arg1);
		} else if (input.isKeyDown(Input.KEY_RIGHT)) {
			player.movimentoDireita(arg1);
		}
	}

}
