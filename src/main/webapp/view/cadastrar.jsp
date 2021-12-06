<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="resources/css/cadastro.css"/>
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/js/cadastrar.js"></script>
    </head>
    <body>
        <h1>Cadastro</h1>

    <form action="" method="post">
        <div class="container">
            <label class="content" for="uname"><b>Nome</b></label>
            <input type="text" placeholder="Insira seu nome" name="nome" id="nome" required>
        </div>
        <div class="container">
            <label class="content" for="uname"><b>Email</b></label>
            <input type="text" placeholder="Insira seu email" name="email" id="email" required>
        </div>
        <div class="container">
            <label class="content" for="psw"><b>Senha</b></label>
            <input type="password" placeholder="Insira sua senha" name="senha" id="senha" required> 
        </div>

        <div class="container">
            <button type="submit" onclick="cadastrar($('#nome').val(), $('#email').val(), $('#senha').val())">Salvar</button>
        </div>
    </form>

    </body>
</html>