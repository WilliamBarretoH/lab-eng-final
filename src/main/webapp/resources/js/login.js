function login(email, senha){
    $.ajax({
        url: '/calculadora/login',
        method: 'POST',
        data:{email:email, senha:senha},
        statusCode: {
          200: function (response) {
            window.location.href = "http://localhost:8080/calculadora/calcular"
          },
          500: function (response) {
            alert('Falha no login, verifique seus dados');
            window.location.href = "http://localhost:8080/calculadora/login"
            window.location.reload();
          }
         }
    });
}