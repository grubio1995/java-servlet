<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url  value="/editarEmpresa"  var="linkServletEditarEmpresa"/>

<!DOCTYPE html>
<body>
	<form action="${linkServletEditarEmpresa}" method="post">
	<input type="hidden" name="idEmpresa"  value="${empresaASerEditada.id}"/>
		Nome: <input type="text" name="nome"  value="${empresaASerEditada.nome}"/></br>
		Data Abertura: <input type="text" name="dataAbertura" value="<fmt:formatDate value="${empresaASerEditada.dataAbertura}" pattern="dd/MM/yyyy"/>" />
		
		<input type="submit">
	</form>
</body>
</html>	