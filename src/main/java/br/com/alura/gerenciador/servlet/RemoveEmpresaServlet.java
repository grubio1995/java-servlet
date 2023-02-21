package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Removendo empresa");

		int idEmpresa = Integer.parseInt(request.getParameter("id"));

		Banco banco = new Banco();
		banco.removerEmpresa(idEmpresa);		
		
		response.sendRedirect("listaEmpresas");
	}

}
