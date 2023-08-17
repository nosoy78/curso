document.getElementById('estadoForm').addEventListener('submit',
function (event) {
    event.preventDefault();

    const edad = parseInt(document.getElementById('edad').value);
    const resultado = document.getElementById('resultado');

    if (!isNaN(edad)) {
        if (edad >= 18) {
            resultado.innerHTML = `<p> Usted es Mayor de edad </p>`;
        } else {
            resultado.innerHTML = `<p> Usted es Menor de edad </p>`;
        }
    } else {
        resultado.innerHTML = `<p> Por favor, ingrese una edad válida </p>`;
    }
});