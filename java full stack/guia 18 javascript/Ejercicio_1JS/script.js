document.getElementById('estadoForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const estadoSeleccionado = document.getElementById('estadoDia').value;
    const resultadoDiv = document.getElementById('resultado');
    
    if (estadoSeleccionado === 'soleado') {
      resultadoDiv.innerHTML = '<p>El día de hoy está soleado.</p>';
    } else if (estadoSeleccionado === 'nublado') {
      resultadoDiv.innerHTML = '<p>El día de hoy está nublado.</p>';
    } else if (estadoSeleccionado === 'lloviendo') {
      resultadoDiv.innerHTML = '<p>El día de hoy está lloviendo.</p>';
    } else {
      resultadoDiv.innerHTML = '<p>Por favor, seleccione una opción válida.</p>';
    }
  });