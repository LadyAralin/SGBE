const nombre = sessionStorage.getItem("nombreUsuario");// Obtener el nombre de usuario del sessionStorage
        if (nombre) {
            document.getElementById("mensaje").textContent = `Bienvenid@, ${nombre}`;// Mostrar el mensaje de bienvenida
        }
        function cerrarSesion() {// Función para cerrar sesión
             sessionStorage.clear();// Limpiar el sessionStorage
            window.location.href = "login.html";// Redirigir a la página de inicio de sesión
        }