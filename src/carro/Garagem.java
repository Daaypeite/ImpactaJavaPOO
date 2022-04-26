package carro;

import cap5lab1.Fucionario;

public class Garagem {
	Carro carroPasseio = new Carro ();
	Carro carroUtilitario = new Carro ();
	
	public static void main(String[] args) {
		Garagem g = new Garagem();
		
		g.carroPasseio.cor = "vermelho";
		g.carroPasseio.modelo = "VW Jetta";
		g.carroPasseio.potenciaDoMotor = "2.3";
		
		g.carroUtilitario.cor = "branco";
		g.carroUtilitario.modelo = "renault boxer";
		g.carroUtilitario.potenciaDoMotor = "3.8";
		
		System.out.println("carro de passeio:");
		System.out.println("cor:" + g.carroPasseio.cor);
		System.out.println("modelo:" + g.carroPasseio.modelo);
		System.out.println("potenciaDoMotor" + g.carroPasseio.potenciaDoMotor);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("carro Utilitario:");
		System.out.println("cor:" + g.carroUtilitario.cor);
		System.out.println("modelo:" + g.carroUtilitario.modelo );
		System.out.println("potenciaDoMotor:" + g.carroUtilitario.potenciaDoMotor);
		
		
	}

}
