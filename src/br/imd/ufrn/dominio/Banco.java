package br.imd.ufrn.dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> contas;

	public Banco() {
		contas = new ArrayList<Conta>();
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	public void addConta(Conta conta) {
		if(!contas.contains(conta))
			contas.add(conta);
	}
	
	public List<Conta> listarContas(){
		List<Conta> contasExistentes = new ArrayList<Conta>();
		contasExistentes.addAll(contas);
		return contasExistentes;
	}
	
	
}
