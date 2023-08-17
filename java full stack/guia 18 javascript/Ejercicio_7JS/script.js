document.getElementById('estadoForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const numero1 = parseInt(document.getElementById('number1').value);
    if (numero1 <= 0) {
        alert('Por favor, ingrese un número positivo en el límite numérico.');
        return;
    }

    let aux = 0;
    do {
        let nuevoNumero = parseInt(prompt("Ingrese un número:", "0"));
        aux += nuevoNumero;
        console.log(aux);
    } while (aux < numero1)

    resultado.innerHTML = `<p> Usted a llegado al limite numerico, Felicitaciones. </p>`;
})