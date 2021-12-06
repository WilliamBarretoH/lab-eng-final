function cadastrar(nome, email, senha){
    $.ajax({
        url: '/calculadora/cadastrar',
        method: 'POST',
        data:{nome:nome, email:email, senha:senha},
        success: function(response) {
            console.log(response);
            window.location.href = "http://localhost:8080/calculadora/login"
          },
          error: function (response) {
            alert('Falha no cadastro. Por favor verifique seus dados');
          }
    });
}