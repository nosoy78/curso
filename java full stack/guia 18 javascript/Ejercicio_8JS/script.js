let maximo = Number.NEGATIVE_INFINITY; // Valor mínimo
let minimo = Number.POSITIVE_INFINITY; // Valor máximo
let total = 0;
let cantidad = 0;

while (true) {
    const numero = parseInt(prompt("Ingrese un número entero (0 para finalizar):"));
    if (numero === 0) {
        break;
    }
    maximo = Math.max(maximo, numero);
    minimo = Math.min(minimo, numero);
    total += numero;
    cantidad++;
}
if (cantidad > 0) {
    const promedio = total / cantidad;
    resultado.innerHTML = `<table class="table table-bordered">
            <thead>
                <tr>
                    <th>Máximo</th>
                    <th>Mínimo</th>
                    <th>Promedio</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${maximo}</td>
                    <td>${minimo}</td>
                    <td>${promedio}</td>
                </tr>
            </tbody>
        </table> `;
} else {
    alert("No se ingresaron números.");
}