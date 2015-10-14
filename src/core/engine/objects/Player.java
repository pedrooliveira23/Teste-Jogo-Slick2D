package core.engine.objects;

import javax.swing.JOptionPane;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import core.engine.LevelControl;

public class Player {
	private Image sprite;
	private int[] coordenadas = new int[2];

	public Player(String path, int x, int y) {
		try {
			setSprite(new Image(path));
		} catch (SlickException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível carregar /" + path);
		}
		coordenadas[0] = x;
		coordenadas[1] = y;
	}

	public int getCoordenadas(int index) {
		return coordenadas[index];
	}

	public void setCoordenadas(int[] coordenadas) {
		this.coordenadas = coordenadas;
	}

	public void movimentoCima(int delta) {
		if (LevelControl.getMapa().getTileId(coordenadas[0] / 32, (int) Math.ceil(coordenadas[1] / 32 - 0.21875), 1) == 0) {
			coordenadas[1] -= delta * 0.3;
		}
	}

	public void movimentoBaixo(int delta) {
		if (LevelControl.getMapa().getTileId(coordenadas[0] / 32, (int) Math.ceil(coordenadas[1] / 32 + 0.21875), 1) == 0) {
			coordenadas[1] += delta * 0.3;
		}
	}

	public void movimentoEsquerda(int delta) {
		if (LevelControl.getMapa().getTileId((int) Math.ceil(coordenadas[0] / 32 - 0.21875), coordenadas[1] / 32, 1) == 0) {
			coordenadas[0] -= delta * 0.3;
		}
	}

	public void movimentoDireita(int delta) {
		if (LevelControl.getMapa().getTileId((int) Math.ceil(coordenadas[0] / 32 + 0.21875), coordenadas[1] / 32, 1) == 0) {
			coordenadas[0] += delta * 0.3;
		}

	}

	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	
}
