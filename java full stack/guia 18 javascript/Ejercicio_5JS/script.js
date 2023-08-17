document.getElementById('estadoForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const numero1 = parseInt(document.getElementById('number1').value);
    const numero2 = parseInt(document.getElementById('number2').value);
    const caracter = document.getElementById('caracter').value;
    const resultado = document.getElementById('resultado');

    auxcarac = caracter.toUpperCase();

    switch (auxcarac) {
        case "S":
            aux = numero1 + numero2;
            resultado.innerHTML = `<p> Suma : ${aux} </p>`;
            break;
        case "R":
            aux = numero1 - numero2;
            resultado.innerHTML = `<p> Resta : ${aux} </p>`;
            break;
            break;
        case "M":
            aux = numero1 * numero2;
            resultado.innerHTML = `<p> Multiplicacion : ${aux} </p>`;
            break;
            break;
        case "D":
            aux = numero1 / numero2;
            resultado.innerHTML = `<p> Division : ${aux} </p>`;
            break;
            break;
        default:
            console.log("Ingreso Mal");
            break;
    }
})