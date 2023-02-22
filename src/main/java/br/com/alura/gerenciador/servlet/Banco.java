package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial);
		empresa1.setNome("Empresa 1");
		empresa1.setDataAbertura(new Date());
		chaveSequencial++;

		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial);
		empresa2.setNome("Empresa 2");
		empresa2.setDataAbertura(new Date());
		chaveSequencial++;
		
		lista.add(empresa1);
		lista.add(empresa2);
	}
	
	public void adicionaEmpresa(Empresa empresa) {
		Banco.lista.add(empresa);
	}	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removerEmpresa(int idEmpresa) {
		lista.removeIf(empresa -> empresa.getId() == idEmpresa);		
	}
	
	public Empresa obterEmpresa(Integer idEmpresa) {
		return lista
				.stream()
				.filter(emp -> emp.getId()== idEmpresa)
				.findFirst()
				.get();
	}
	
}
