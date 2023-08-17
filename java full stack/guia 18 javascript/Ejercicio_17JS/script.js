let v1 = [];
let v2 = [];

function numeroAleatorio(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}
function llenarVectores() {
    for (let i = 0; i < 5; i++) {
        v1.push(numeroAleatorio(1, 10));
    }
}

llenarVectores();

console.log(v1);
vectorOriginal.innerHTML = `<h1> Vector Original : [${v1}] </h1>`;
v2 = v1;

delete v2[4];
delete v2[3];

console.log(v2);
vetorModificado.innerHTML = `<h1> Vector Modificado : [${v2}] </h1>`;
