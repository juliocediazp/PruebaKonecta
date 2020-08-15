<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Creacion de Solicitud</title>    
	 <spring:url value="/resources" var="urlPublic" />
	 <spring:url value="/solicitud/save" var="urlForm" />
    <link href="${urlPublic}/bootstrap/css/bootstrap.min.css" rel="stylesheet">   
    <link href="${urlPublic}/bootstrap/css/theme.css" rel="stylesheet">

  </head>

  <body>

    <jsp:include page="../includes/menu.jsp"></jsp:include>

    <div class="container theme-showcase" role="main">

      <h3 class="blog-title"><span class="label label-success">Datos de la Noticia</span></h3>
	  
      <form action="${urlForm}" method="post">
        <div class="row">         
          <div class="col-sm-6">
            <div class="form-group">
              <label for="codigo">codigo</label>             
              <input type="text" class="form-control" name="codigo" id="codigo" required="required"/>
            </div>
          </div>
          <div class="col-sm-3">
            <div class="form-group">
              <label for="empleado">empleado</label>             
              <input type="text" class="form-control" name="empleado" id="empleado" required="required"/>
             </div>
          </div>
        </div>
        <div class="row"> 
          <div class="col-sm-12">
            <div class="form-group">
              <label for="descripcion">descripcion</label>             
              <textarea class="form-control" name="descripcion" id="descripcion" rows="10"></textarea>
            </div>  
          </div>
        </div>
         <div class="row"> 
          <div class="col-sm-12">
            <div class="form-group">
              <label for="resumen">resumen</label>             
              <textarea class="form-control" name="resumen" id="resumen" rows="10"></textarea>
            </div>  
          </div>
        </div>

        <button type="submit" class="btn btn-danger" >Guardar</button>
      </form> 

      <hr class="featurette-divider">

      <jsp:include page="../includes/footer.jsp"></jsp:include>

    </div> <!-- /container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script> 
    <script src="${urlPublic}/tinymce/tinymce.min.js"></script>
    <script>
	  // Configuracion de la barra de heramientas
	  // https://www.tinymce.com/docs/get-started/basic-setup/
      tinymce.init({
          selector: '#detalle',
          plugins: "textcolor, table lists code",
          toolbar: " undo redo | bold italic | alignleft aligncenter alignright alignjustify \n\
                    | bullist numlist outdent indent | forecolor backcolor table code"
      });
    </script>
  </body>
</html>
