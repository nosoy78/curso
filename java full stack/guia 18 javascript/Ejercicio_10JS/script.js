document.getElementById('estadoForm').addEventListener('submit', function (event) {
    event.preventDefault();

    let fraceRevez = "";
    const frace = document.getElementById(`fraces`).value;
    console.log(frace.length);

    fraceRevez = reverseWord(frace);

    resultado.innerHTML = `<p> Resultado : ${fraceRevez} </p>`;
})
const reverseWord = palabra => {
    return palabra.split('').reverse().join('');
};