document.addEventListener("DOMContentLoaded", function () {
    document
      .getElementById("estadoForm")
      .addEventListener("submit", function (event) {
        event.preventDefault();
  
        const mensaje = document.getElementById("resultado");
  
        let Nombre = "Fernando";
  
        setTimeout(function () {
          console.log("Uno");
          mensaje.innerHTML = " Hola ! ";
        }, 500);
  
        setTimeout(function () {
          console.log("Dos");
          mensaje.innerHTML += " soy : ";
        }, 1000);
  
        setTimeout(function () {
          console.log("Tres");
          mensaje.innerHTML += `<h1>${Nombre}</h1>`;
          mensaje.classList.add("fade-in-out"); 
        },2000);
        setTimeout(function () {
          console.log("Cuatro");
          mensaje.innerHTML = ``;
          mensaje.classList.remove("fade-in-out");
        }, 3500);
      });
  });