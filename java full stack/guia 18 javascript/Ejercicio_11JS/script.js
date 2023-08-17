document.getElementById('estadoForm').addEventListener('submit', function (event) {
    event.preventDefault();


    const cadenaEjemplo = document.getElementById(`fraces`).value;
    const palabraLarga = palabraMasLarga(cadenaEjemplo);
    console.log(palabraLarga);
    console.log(cadenaEjemplo);

    resultado.innerHTML = `<p> Resultado : ${palabraLarga} </p>`;

})

function palabraMasLarga(cadena) {
    const palabras = cadena.split(' ');
    let palabraMasLarga = '';
    for (let i = 0; i < palabras.length; i++) {
        if (palabras[i].length > palabraMasLarga.length) {
            palabraMasLarga = palabras[i];
        }
    }
    return palabraMasLarga;
}