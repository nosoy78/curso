document.getElementById('estadoForm').addEventListener('submit', function (event) {
    event.preventDefault();
    const cadenaEjemplo = document.getElementById(`fraces`).value;
    console.log(cadenaEjemplo);
    const tipoDato = (cadena) => {
        return typeof cadena;
        ;
    }
    const valor = tipoDato(cadenaEjemplo);
    console.log(valor)
    resultado.innerHTML = `<p> Resultado : ${valor} </p>`;
})