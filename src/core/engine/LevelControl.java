package core.engine;

import javax.swing.JOptionPane;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class LevelControl {
	
	private static TiledMap mapa = null;

	public TiledMap level(int id) {
		try {
			mapa = new TiledMap("data/mapas/" + id + ".tmx");
		} catch (SlickException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar mapa " + id);
		}
		return mapa;
	}
	
	public static TiledMap getMapa() {
		return mapa;
	}

}
