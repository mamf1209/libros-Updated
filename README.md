# MODIFICACIONES DEL PROYECTO BIBLIOTECA API

## Se ha añadido la funcionalidad para manejar excepciones personalizadas.

### Se mejoró el controlador de libros para manejar excepciones cuando no se encuentra un libro específico, lanzando una excepción "LibroException".

![LibroException](https://raw.githubusercontent.com/mamf1209/libros-Updated/main/images/1.jpg)


### Actualización del controlador de libros para responder con un estado `NOT_FOUND` y un mensaje personalizado en caso de no encontrar un libro.

![NotFound](https://raw.githubusercontent.com/mamf1209/libros-Updated/main/images/3.jpg)

![Postman1](https://raw.githubusercontent.com/mamf1209/libros-Updated/main/images/5.jpg)

![Postman2](https://raw.githubusercontent.com/mamf1209/libros-Updated/main/images/6.jpg)


### Modificación del controlador de libros para devolver un estado `CREATE` al agregar un nuevo libro a la biblioteca.

![NotFound](https://raw.githubusercontent.com/mamf1209/libros-Updated/main/images/3.jpg)

![StatusCreate](https://raw.githubusercontent.com/mamf1209/libros-Updated/main/images/7.jpg)


### Integración de un manejador global de excepciones para gestionar errores personalizados en todo el proyecto.

![GlobalException](https://raw.githubusercontent.com/mamf1209/libros-Updated/main/images/2.jpg)
