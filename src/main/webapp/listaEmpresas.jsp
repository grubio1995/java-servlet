<%-- <%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
	<body>
		Lista de Empresas:
		
		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>${empresa.nome}</li>
			</c:forEach>
		</ul>
		
		

<%-- Fazendo uma listagem com scriptlet	
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
--%>


	</body>	
</html>