let matrizOriginal = [[3], [6], [9], [12], [15]];
console.log(matrizOriginal);
let matrizModificada = matrizOriginal.flat();
delete matrizModificada[0];
matrizModificada.push(18);
console.log(matrizModificada);