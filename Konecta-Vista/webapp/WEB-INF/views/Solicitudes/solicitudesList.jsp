<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Listado de solicitudes</title>
    <spring:url value="/resources" var="urlPublic" />
	 <spring:url value="/solicitud/create" var="urlCreate" />
    <link href="${urlPublic}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${urlPublic}/bootstrap/css/theme.css" rel="stylesheet">
    
  </head>

  <body>

    <jsp:include page="../includes/menu.jsp"></jsp:include>
    
    <div class="container theme-showcase" role="main">

      <h3>Listado de Solicitudes</h3>
      
      <c:if test="${mensaje!=null }">      	
      	<div class='alert alert-success' role="alert">${mensaje}</div>      	
      </c:if>

      <a href="${urlCreate}" class="btn btn-success" role="button" title="Nueva solicitud" >Nueva</a><br><br>
	
      <div class="table-responsive">
        <table class="table table-hover table-striped table-bordered">
            <tr>
                <th>id</th>
                <th>codigo</th>
                <th>descripcion</th>
                <th>resumen</th>
                <th>empleado</th>
               
            </tr>
            
            <c:forEach var="solicitud" items="${solicitud}">
			  <tr>
				<td>${solicitud.id}</td>
				<td>${solicitud.codigo}</td>
				<td>${solicitud.descripcion}</td>
				<td>${solicitud.resumen}</td>
				<td>${solicitud.id_empleado.nombre}</td>
				
				</td>
					
				<td>
					<a href="#" class="btn btn-success btn-sm" role="button" title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
					<a href="#" class="btn btn-danger btn-sm" role="button" title="Eliminar"><span class="glyphicon glyphicon-trash"></span></a>
				</td>
			  </tr>
			</c:forEach>
            
        </table>
      </div>
          
      <hr class="featurette-divider">

      <jsp:include page="../includes/footer.jsp"></jsp:include>

    </div> <!-- /container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script>     
  </body>
</html>
