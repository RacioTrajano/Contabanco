package br.imd.ufrn.main;

import br.imd.ufrn.dominio.Banco;
import br.imd.ufrn.dominio.Conta;

public class Main {

	public static void main(String[] args) {
		
		Conta xico = new Conta();
		
		xico.setTitular("Fran Xico");
		xico.setNumConta("01");
		xico.Deposito(200);
		
		Conta francisca = new Conta();
		francisca.setTitular("Francisca das Dores");
		francisca.setNumConta("02");
		francisca.Deposito(300);
		
		Banco santander = new Banco();
		santander.addConta(xico);
		santander.addConta(francisca);
		
		for(Conta d: santander.listarContas()) {
			System.err.println(d);
		}
		
		
		//System.out.println(xico);
	}

}
