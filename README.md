# Literalura Application

Literalura Application es una aplicación basada en Spring Boot que permite la gestión de libros y autores. Utiliza una base de datos PostgreSQL para almacenar la información y proporciona varias funcionalidades, como la búsqueda de libros por título, listar todos los libros y autores registrados, entre otras.

## Requisitos

- JDK 11 o superior
- Maven 3.6.0 o superior
- PostgreSQL
- PgAdmin 4 (opcional, para administrar la base de datos)

## Configuración del Proyecto

### Clonar el repositorio

git clone https://github.com/tu-usuario/literalura-application.git
cd literalura-application

## Configurar la base de datos
1.-Crear una base de datos en PostgreSQL:

2.-Crear un usuario y asignarle permisos:

## Configurar las propiedades de la aplicación
Edita el archivo src/main/resources/application.properties y configura las propiedades de la base de datos:

## Funcionalidades
- Búsqueda de libro por título
- Listar todos los libros registrados
- Listar todos los autores registrados
- Listar autores vivos en un determinado año
- Listar libros por idioma
- Obtener estadísticas de descargas

## Estructura del Proyecto
- src/main/java/com/aluracursos/literalura/: Contiene el código fuente de la aplicación.
- src/main/resources/: Contiene los archivos de configuración.
- src/test/java/com/aluracursos/literalura/: Contiene las pruebas unitarias.

## Principales clases y archivos
- LiteraluraApplication.java: Clase principal de la aplicación Spring Boot.
- Principal.java: Clase que maneja el menú interactivo y las operaciones principales.
- AutorRepository.java: Repositorio para manejar las operaciones CRUD de los autores.
- LibroRepository.java: Repositorio para manejar las operaciones CRUD de los libros.
- Libro.java: Entidad que representa un libro.
- Autor.java: Entidad que representa un autor.

## Contribuir
Si deseas contribuir a este proyecto, por favor, sigue los siguientes pasos:

- Haz un fork del repositorio.
- Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
- Realiza los cambios necesarios y commitea (git commit -m 'Agregar nueva funcionalidad').
- Push a la rama (git push origin feature/nueva-funcionalidad).
- Abre un Pull Request.
