# UT4 - Ejercicios 6 - Herencia - restaurante

Vamos a hacer una aplicación para informatizar todos los platos de nuestra carta.

Los camareros van a tener un smartphone donde anotar las comandas de cada mesa. Estas comandas incluyen información de que numero de mesa es y el número de comensales. Y además incluye todos los platos que han pedido.

Todos los platos tienen un nombre y un precio.

En la carta tenemos divididos los platos en cuatro categorías:
Primeros. Estos platos tienen la opción de compartir, por lo que debemos almacenar si son para compartir en la mesa o no.
Carnes. Tienen la opción de poner el grado de cocción, que debe ser uno de los siguientes: Poco hecho, Al punto, Muy hecho, Carbonizado.
Pescados. No tienen más información relevante
Postres. Tienen información para diabéticos, por lo que almacenan si son con o sin azúcar.
En resumen, hay que programar:
La jerarquía de clases para los platos. Estas clases deben contener los métodos básicos, y el método toString().
La clase Comanda con todos los métodos básicos necesarios. Deberá almacenar el listado de platos en un array.
Un método toString() en la clase Comanda que imprime la comanda con toda la información de todos los platos que contiene.
Un método coste() en la clase Comanda que calcula el precio total de todo lo pedido.
Un método hayDiabeticosEnLaMesa(), que retorna verdadero o falso, si se han pedido postres sin azúcar en la comanda.