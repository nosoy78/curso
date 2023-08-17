document.getElementById('estadoForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const numero1 = parseInt(document.getElementById('number1').value);

    if (numero1 == 0) {
        resultado.innerHTML = `<p> El Numero no es PAR ni IMPAR </p>`;
    } else if (numero1 % 2 == 0) {
        resultado.innerHTML = `<p> Su Numero es PAR </p>`;
    } else {
        resultado.innerHTML = `<p> Su Numero es IMPAR </p>`;
    }
})