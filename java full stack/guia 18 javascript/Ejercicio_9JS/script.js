document.getElementById('estadoForm').addEventListener('submit', function (event) {
    event.preventDefault();

    let fraceConEspacios = "";
    const frace = document.getElementById(`fraces`).value;
    console.log(frace.length);

    for (var i = 0; i < frace.length; i++) {
        fraceConEspacios += frace.charAt(i);

        if (i < frace.length - 1) {
            fraceConEspacios += " ";
        }
    }
    resultado.innerHTML = `<p> Resultado : ${fraceConEspacios} </p>`;
})