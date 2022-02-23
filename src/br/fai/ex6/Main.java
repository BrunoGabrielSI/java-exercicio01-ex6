package br.fai.ex6;

import br.fai.ex6.Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();
	}

	private void start() {
		String[] carros = {"Civic", "Gol", "Palio", "Uno"};
		
		try {
			for (int i = -1; i < carros.length; i++) {
				String carro = carros[i];
				System.out.println("Nome do carro: " + carro);	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		carros[1] = "L200";
		System.out.println("----------------");
		
		for (String carro : carros) {
			System.out.println("Nome do carro: " + carro);
			
		}
		System.out.println("-----------------");
		
	}

}
