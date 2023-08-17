console.log("Hola desde script");
const PI = Math.PI;
document.getElementById('estadoForm').addEventListener('submit',
    function (event) {
        event.preventDefault();

        const radio = parseFloat(document.getElementById('radio').value);
        const resultado = document.getElementById('resultado');

        let area = PI * radio * radio;
        let perimetro = 2 * PI * radio;

        resultado.innerHTML =
            `<p> Área: ${area.toFixed(2)}</p>
         <p> Perímetro: ${perimetro.toFixed(2)}</p>`;
    });