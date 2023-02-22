package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer idEmpresa = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Empresa empresaASerEditada = banco.obterEmpresa(idEmpresa);
		
		// chamar o jsp
		RequestDispatcher rd = request.getRequestDispatcher("/formEditarEmpresa.jsp");
		request.setAttribute("empresaASerEditada",empresaASerEditada);
		rd.forward(request, response);	

	}

}
