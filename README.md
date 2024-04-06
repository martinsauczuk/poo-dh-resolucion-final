# Resolución de examen final

Realizar el diagrama UML y programar en Java (implementando los patrones que se requieran) el siguiente enunciado.

## Enunciado

Para una municipalidad se necesita desarrollar un sistema que permita gestionar el monto de los impuestos de las propiedades que tiene el municipio. Existen dos tipos de propiedades: casas y chalets. Ambas pueden ser parte de un barrio cerrado.
Ambos tipos de propiedades poseen una calle y un número. 
Para calcular el impuesto total de las casas se debe multiplicar el impuesto base por un coeficiente que depende de la zona en que se encuentran, la municipalidad determina este coeficiente en el momento de generar la propiedad.

Los chalets tienen un monto base, y un coeficiente similar al de las casas pero que se multiplica por la cantidad de cocheras (siempre mayor o igual a 1). 
Cada barrio cerrado posee un factor multiplicador y además contiene varias casas y/o chalets dentro.
Se necesitará desarrollar las siguientes __funcionalidades__:

- Poder __calcular__ el impuesto de una casa.
- Poder __calcular__ el impuesto de un chalet.
- Poder __calcular__ el impuesto de un barrio cerrado que consiste en la sumatoria de todos los impuestos de las propiedades que este puede contener al que se le multiplica por el factor multiplicador.
Por otro lado el municipio deberá poder generar propiedades con los coeficientes ya cargados, los cuales no deben poder modificarse después. 

La municipalidad debe poder generar como mínimo estas 3 propiedades:
- Casa clase alta: Genera una casa con un coeficiente 1.9.
- Casa clase media: Genera una casa con coeficiente 1.1.
- Chalet XL: Genera un chalet con 2 cocheras y un coeficiente 1.5.
- Barrio Privado tipo: Genera un barrio privado con 8 casas clase media y 2 chalet XL.  Elegir a elección el factor multiplicador.

El impuesto base debe estar definido en el mismo lugar que se asignan los coeficientes. Asignar un valor a elección elegido por la municipalidad. 

Los coeficientes y la cantidad de cocheras no pueden cambiarse una vez generados las propiedades. Si se debe poder modificar la calle y la dirección una vez generadas las propiedades. (tener en cuenta estas definiciones a la hora de establecer getters y setters para las clases).
Probar en el main como mínimo 1 ejemplo de cada propiedad generada y cómo se calcula el impuesto.
