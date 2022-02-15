$(document).ready(function() {
 // Listo
});

async function iniciarSesion() {

        let datos = {};

        datos.email = document.getElementById("txtEmail").value;
        datos.password = document.getElementById("txtPassword").value;

        const request = await fetch('api/login', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });
      const respuesta = await request.text();

      if  (respuesta == "FAIL"){
        localstorage.token = respuesta;
        localstorage.email = datos.email;
        window.location.href = "usuarios.html"
      }else {
        alert("El email o la contraseña es incorrecto, por favor vuelva a introducirlas.")
      }

}
