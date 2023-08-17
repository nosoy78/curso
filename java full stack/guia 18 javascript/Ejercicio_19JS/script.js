let arregloA = [];
let arregloB = [];
function numeroAleatorio(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}
function llenarVectorA(cant) {
    for (let i = 0; i < cant; i++) {
        arregloA.push(numeroAleatorio(1, 99));
    }
}
function llenarVectorB(opc, cant) {
    if (opc == 1) {
        for (let i = 0; i < cant; i++) {
            arregloB.push(0.5);
        }
    }
    if (opc == 2) {
        for (let i = 0; i < cant; i++) {
            arregloB.push(arregloA[i]);
        }
    }
}
llenarVectorA(50);

console.log("Arreglo A : " + arregloA);
console.log("Arreglo B : " + arregloB);

arregloA.sort((a, b) => a - b);
console.log("Arreglo A Ordenado : " + arregloA);

llenarVectorB(2, 10);
console.log("Arreglo B + A : " + arregloB);

llenarVectorB(1, 10);
console.log("Arreglo B + 0.5 : " + arregloB);