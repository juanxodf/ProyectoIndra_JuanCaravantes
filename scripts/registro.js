//No he sido capaz de que muestre los mensajes ni de que me lleve despues de registrarme a la pagina principal
document.addEventListener('DOMContentLoaded', function() {
    const registroForm = document.getElementById('registroForm');
    const mensajeDiv = document.getElementById('mensaje');

    // Simulación de una base de datos de registros
    const registros = {
        conferencia: [],
        taller: [],
        actividad: []
    };

    // Función para verificar y registrar
    registroForm.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevenir envío del formulario

        const nombre = document.getElementById('nombre').value;
        const email = document.getElementById('email').value;
        const evento = document.getElementById('evento').value;

        if (registros[evento].includes(email)) {
            mensajeDiv.textContent = `Ya estás registrado en el evento ${evento} con el correo ${email}.`;
            mensajeDiv.style.color = 'red';
        } else {
            registros[evento].push(email);
            mensajeDiv.textContent = `Registro exitoso para el evento ${evento}. ¡Gracias ${nombre}!`;
            mensajeDiv.style.color = 'green';

            // Redirigir a la página principal después de 3 segundos
            setTimeout(function() {
                window.location.href = '../index.html'; // Asegúrate de tener una página 'index.html'
            }, 3000);
        }
    });
});
