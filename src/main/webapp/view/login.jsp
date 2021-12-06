<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="resources/css/login.css"/>
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/js/login.js"></script>
    </head>
    <body>
        <h1>Login</h1>

    <form action="" method="post">
        <div class="container">
            <label class="content" for="uname"><b>Email</b></label>
            <input type="text" placeholder="Insira seu email" name="email" id="email" required>
        </div>
        <div class="container">
            <label class="content" for="psw"><b>Senha</b></label>
            <input type="password" placeholder="Insira sua senha" name="senha" id="senha" required> 
        </div>

        <div class="container">
            <button type="submit" onclick="login($('#email').val(), $('#senha').val())">Realizar Acesso</button>
        </br>
        </br>
            <span class="psw"> 
                <a href="/calculadora/cadastrar">CADASTRE-SE AQUI</a>
            </span>
        </div>
    </form>

    </body>
</html>
        
