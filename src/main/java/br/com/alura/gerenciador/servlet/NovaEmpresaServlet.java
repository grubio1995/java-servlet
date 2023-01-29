package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var nomeEmpresa = request.getParameter("nome");
		System.out.println("Cadastrando nova empresa");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa " + toEmptyIfNull(nomeEmpresa) +  " cadastrada com sucesso</body></html>");
	}

	public String toEmptyIfNull(String txt) {
		if(txt == null) {
			return "";
		}
		
		return txt;
	}
	
}
