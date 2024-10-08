# Conversor de Moneda

Este es un proyecto en Java que permite realizar conversiones entre diferentes monedas utilizando una API de tasas de cambio (ExchangeRate API). El usuario puede elegir entre varias opciones de conversión de moneda y luego ingresar la cantidad a convertir. El sistema se conecta a la API de ExchangeRate para obtener la tasa de conversión actual y realizar la conversión solicitada.

## Funcionalidades

- Conversión entre las siguientes monedas:
    - Peso Mexicano a Dólar
    - Dólar a Peso Mexicano
    - Peso Argentino a Dólar
    - Dólar a Peso Argentino
    - Real Brasileño a Dólar
    - Dólar a Real Brasileño
- Peticiones a la API de ExchangeRate para obtener las tasas de conversión actualizadas.

## Requisitos Previos

- **Java 11 o superior**: El proyecto está desarrollado en Java, por lo que necesitarás tener instalado un JDK (Java Development Kit).
- **Clave API de ExchangeRate API**: Necesitas una clave de la API para poder realizar peticiones. Puedes obtener una clave gratuita registrándote en ExchangeRate API.

Configura la clave API en tu entorno de sistema mediante la variable de entorno `KEY`. Por ejemplo:

### En Linux/macOS:
```bash
export KEY=tu_clave_api
```
### En Windows:
```bash
set KEY=tu_clave_apiç
```
## Estructura del Proyecto

El proyecto está dividido en varias clases:

- **Main**: Punto de entrada de la aplicación. Gestiona la interacción con el usuario y controla el flujo del programa.
- **UserInterface**: Se encarga de mostrar las opciones al usuario, recibir la opción seleccionada y el monto a convertir.
- **ExchangeRateClient**: Realiza la solicitud a la API para obtener la tasa de cambio de la moneda seleccionada.
- **GetPairConversionResponse**: Clase utilizada para deserializar la respuesta JSON de la API.

## Cómo Ejecutar el Proyecto

1. Clona el repositorio o descarga los archivos del proyecto.
2. Asegúrate de tener configurada la variable de entorno con tu clave API.
3. Compila el proyecto desde la terminal:

```bash
javac Main.java
```
4. Ejecuta el proyecto:

```bash
java Main
```
5.Sigue las instrucciones en pantalla para elegir la opción de conversión de moneda y proporcionar el monto deseado.

## Dependencias

Este proyecto utiliza las siguientes librerías:

- **Gson**: Para deserializar la respuesta JSON de la API.
- **java.net.http.HttpClient**: Para realizar solicitudes HTTP a la API de tasas de cambio.

## Ejemplo de Ejecución

BIENVENIDO/A AL CONVERSOR DE MONEDA
***********************************
1. PESO MEXICANO --> DOLAR
2. DOLAR --> PESO MEXICANO
3. PESO ARGENTINO --> DOLAR
4. DOLAR --> PESO ARGENTINO
5. REAL BRASILEÑO --> DOLAR
6. DOLAR --> REAL BRASILEÑO
   Ingresa el numero de la opcion deseada: 1
   Ingresa el monto que deseas convertir: 1000
   conversion: 50.0





