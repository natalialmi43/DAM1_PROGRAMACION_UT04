1. Propósito del Sistema
   La cadena de tiendas requiere una aplicación para gestionar el inventario de sus productos. El sistema debe registrar diferentes tipos de electrodomésticos y calcular automáticamente el precio de venta final según sus características técnicas y físicas.
   +1

2. Definición General de Producto (Electrodoméstico)
   Todos los productos deben incluir obligatoriamente los siguientes datos:


Precio Base: Coste inicial antes de tasas de eficiencia.


Color: La gama incluye Blanco, Negro, Rojo, Azul y Gris. Si se registra un color distinto, el sistema asignará "Blanco" por defecto.
+1


Consumo Energético: Clasificado de la 'A' a la 'F'. Si se introduce un valor fuera de rango, se aplicará la 'F'.
+1


Peso: Dato necesario para la logística de transporte.

3. Tipos de Productos Específicos
   El negocio se divide en dos categorías con reglas de precio adicionales:

Sección de Lavandería (Lavadoras)
Se debe registrar la carga (en kg).


Regla de Negocio: Si la capacidad de carga es superior a 30 kg, se aplicará un recargo en el precio final.

Sección de Imagen (Televisiones)
Se registra el tamaño (en pulgadas) y si posee sintonizador TDT.


Regla de Negocio A: Si la pantalla es de 60 pulgadas o más, el precio se incrementa un 30%.


Regla de Negocio B: Si el panel es OLED, el precio aumenta 250€ adicionales.

4. Cálculo Dinámico de Precios
   El "Precio Final" se obtiene sumando al precio base los siguientes suplementos acumulativos:
   +1


Por Consumo: A menor eficiencia (letra F), mayor es el suplemento.


Por Peso: Los productos más pesados tienen un suplemento mayor por transporte.

5. Requerimientos de Informes (Estadísticas)
   El sistema debe procesar un listado de productos vendidos para:

Mostrar el precio final individual de cada artículo.

Calcular el total acumulado desglosado por:

Recaudación total de Lavadoras.

Recaudación total de Televisiones.

Suma total de todos los productos.

6. Seguridad y Construcción

Alta de productos: Puede ser rápida (solo precio y peso) o completa (todos los datos).


Validación: Los procesos de corrección de colores y letras de consumo deben ser internos y transparentes para el vendedor.