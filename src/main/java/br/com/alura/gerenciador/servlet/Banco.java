package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>(List.of(new Empresa("Alura"), new Empresa("Caelum")));	
	
	
	public void adicionaEmpresa(Empresa empresa) {
		Banco.lista.add(empresa);
	}	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
}
