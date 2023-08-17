const v1 = [];
const v2 = [];

llenarVectores();
console.log(v1);
console.log(v2);

resultado.innerHTML = `<h1> Primer Vector : [${v1}] </h1>
<h1> Segundo Vector : [${v2}] </h1>`;

function numeroAleatorio(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}
function llenarVectores() {
    for (let i = 0; i < 5; i++) {
        v1.push(numeroAleatorio(1, 10));
        v2.push(numeroAleatorio(1, 10));
    }
}