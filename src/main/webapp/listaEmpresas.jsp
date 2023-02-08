<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>


<html>
	<body>
		Lista de Empresas:
		<ul>
			<% 
				List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
				for(Empresa empresa : empresas	){
			%>
				<li><%= empresa.getNome()%></li>
			<%
				}
			%>
		</ul>
	</body>	
</html>