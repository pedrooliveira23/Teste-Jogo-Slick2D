package core;

import javax.swing.JOptionPane;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import core.engine.Core;

public class Principal {

	public static void main(String[] args) {
		try {
			AppGameContainer jogo = new AppGameContainer(new Core("Jogo 01"));
			jogo.setDisplayMode(800, 600, false);
			jogo.start();
			
		} catch (SlickException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar o jogo!");
		}

	}

}
