Conversor de Monedas 💵💱💶

Este proyecto es un Conversor de Monedas desarrollado en Java que utiliza una API para obtener tasas de cambio en tiempo real. Fue desarrollado como parte del Challenge Conversor de Monedas, propuesto por Alura Latam en colaboración con Oracle en el programa ONE, como parte de la especialización Back-End.

Descripción 📝

El Conversor de Monedas te permite convertir diferentes monedas utilizando una API de tasas de cambio en tiempo real. Con este conversor, se pueden realizar solicitudes a la API, analizar la respuesta JSON, filtrar las monedas de interés y mostrar los resultados a los usuarios de manera clara y concisa. Además, la aplicación guarda un historial de conversiones que incluye una marca de tiempo para cada consulta, lo que permite al usuario realizar un seguimiento de sus conversiones anteriores y ver cuándo y a qué hora se realizaron.

Tecnologías Utilizadas 💻

Lenguaje de Programación: Java
API de Tasas de Cambio: Se utiliza una API externa para obtener las tasas de conversión en tiempo real.
Biblioteca Gson: Gson se emplea para el análisis de respuestas JSON de la API.
Control de Versiones: Git/GitHub para el control de versiones y colaboración.
IDE: IntelliJ IDEA como entorno de desarrollo.

Funcionalidades 🧩

Clases Principales

Main.java: Punto de entrada del programa que gestiona la interacción con el usuario a través de la consola.

Converter.java: Maneja la lógica de las conversiones de moneda, incluyendo métodos para almacenar valores de moneda, realizar conversiones y generar respuestas.

RateFetcher.java: Realiza solicitudes a la API externa para obtener las tasas de cambio entre diferentes monedas.

FileGenerator.java: Guarda el historial de conversiones en un archivo de texto.


Instrucciones de Uso 🚀

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en IntelliJ IDEA u otro IDE de tu elección.
3. Ejecuta la clase Main.java para iniciar el programa.
4.Selecciona la moneda base y la moneda objetivo.
5.Ingresa la cantidad que deseas convertir.
6.El programa mostrará la cantidad convertida en la moneda seleccionada y guardará la conversión en el historial.
7.¡Disfruta convirtiendo monedas!
