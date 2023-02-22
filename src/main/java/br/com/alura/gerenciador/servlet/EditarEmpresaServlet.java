package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editarEmpresa")
public class EditarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Editando empresa");

		Integer idEmpresa = Integer.parseInt(request.getParameter("idEmpresa"));
		String nomeEmpresa = request.getParameter("nome");
		Date dataAbertura = null;
		
		try {
			dataAbertura = fmt.parse(request.getParameter("dataAbertura"));
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.obterEmpresa(idEmpresa);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
	
		
		response.sendRedirect("listaEmpresas");
	}

}
