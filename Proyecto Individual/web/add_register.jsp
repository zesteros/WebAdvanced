<%-- 
    Document   : add_register
    Created on : 23/02/2018, 10:17:48 AM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="ISO-8859-1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Registrar un producto - CÓMICA S.A.  </title>
        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">
        <script type="text/javascript">
            function validate()
            {
                var name = document.getElementById("productInputName");
                var price = document.getElementById("inputPrice").value;
                var valid = true;
                if (name.value.length <= 0 /*|| description.value.length <= 0*/)
                {
                    alert("El producto debe de tener un nombre");
                    valid = false;
                } else {
                    if (isNaN(price)) {
                        alert("Introduce un precio válido");
                        valid = false;
                    }
                }
                return valid;
            }
            ;


        </script>
    </head>

    <body class="bg-dark">
        <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Registrar producto </div>
                <div class="card-body">
                    <form action="RegisterProduct" method="post" onsubmit="return validate();">
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="productInputName">Nombre</label>
                                    <input class="form-control" id="productInputName" type="text" aria-describedby="nameHelp" name="name" placeholder="Ingresa el nombre del producto">
                                </div>
                                <div class="col-md-6">
                                    <label for="inputPrice">Precio</label>
                                    <input class="form-control" id="inputPrice" type="number" step="0.1" aria-describedby="emailHelp" name="price" placeholder="Ingresa el precio del producto">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputDescription">Descripción</label>
                            <input class="form-control" id="inputDescription" type="text" aria-describedby="nameHelp" name="description" placeholder="Ingresa la descripción del producto">

                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="inputCategory">Categoría</label>
                                    <select id="inputCategory" name="category" class="form-control selectpicker">
                                        <option>Papel</option>
                                        <option>Anuncios LED</option>
                                        <option>Póster</option>
                                    </select>
                                </div>
                                <div class="col-md-6">
                                    <label for="inputSupplier">Proveedor</label>
                                    <select id="inputSupplier" name="supplier" class="form-control selectpicker">
                                        <option>Biopappel</option>
                                        <option>Electrónica Jeffrey</option>
                                        <option>Transportes Hamburgo</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                            <input type="submit" class="btn btn-primary btn-block" id="register" value="Registrar Producto">
                        <!--<a class="btn btn-primary btn-block" href="login.html">Registrar</a>-->
                    </form>
                    

                </div>
            </div>
            
        </div>
        
        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    </body>

</html>

