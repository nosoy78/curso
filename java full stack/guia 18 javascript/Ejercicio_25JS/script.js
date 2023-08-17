function getFormValores() {
    event.preventDefault();
    const nombre = document.getElementById("form1").nombre.value;
    const apellido = document.getElementById("form1").apellido.value;

    console.log("Nombre:", nombre);
    console.log("Apellido:", apellido);

    return false;
}