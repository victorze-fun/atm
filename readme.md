# Cash Machine

Esta aplicación es un ejemplo de una arquitectura limpia. Hace uso de un contenedor
de inyección de dependencia (Spring Context). La lógica del negocio, el
repositorio de datos y la interfaz de usuario (cli) están desacoplados.

## Instrucciones

Para probar la aplicación debe usar el usuario `qwerty` y la contraseña `secret`.
Puede crear más usuarios y cuentas en los métodos `init` de las clases localizadas
en el paquete `repositories`.

## Artículos relacionados

* [The Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html),
  Robert C. Martin
  
* [A Little Architecture](https://blog.cleancoder.com/uncle-bob/2016/01/04/ALittleArchitecture.html),
  Robert C. Martin
  
* [Inversión de contenedores de control y patrón de inyección de dependencia](https://martinfowler.com/articles/injection.html),
  Martin Fowler

* [https://martinfowler.com/bliki/InversionOfControl.html](https://martinfowler.com/bliki/InversionOfControl.html),
  Martin Fowler