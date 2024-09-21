# Documentación del Patron Adapter

## Introducción

El Patron Adapter es un patrón de diseño estructural que permite la colaboración entre interfaces incompatibles. Este repositorio implementa el patrón Adapter para integrar diferentes sistemas de crédito fintech, permitiendo que se comuniquen entre sí a través de una interfaz común.

## Estructura del Código

El código se organiza en varias carpetas y archivos principales:

- `src/main/java/org/example/fintech/a/`: Contiene las clases relacionadas con la Fintech A.
  - [`FintechACreditos.java`](https://github.com/davidfer1112/patronadapter/tree/main/src/main/java/org/example/fintech/a/FintechACreditos.java): Define la estructura de los créditos en Fintech A.
  - [`FintechAResultadoAprobacion.java`](https://github.com/davidfer1112/patronadapter/tree/main/src/main/java/org/example/fintech/a/FintechAResultadoAprobacion.java): Estructura para los resultados de aprobación de Fintech A.

- `src/main/java/org/example/implementacion/`: Contiene los adaptadores implementados.
  - [`AdaptadorFintechA.java`](https://github.com/davidfer1112/patronadapter/tree/main/src/main/java/org/example/implementacion/AdaptadorFintechA.java): Adaptador para Fintech A.
  - [`AdaptadorFintechC.java`](https://github.com/davidfer1112/patronadapter/tree/main/src/main/java/org/example/implementacion/AdaptadorFintechC.java): Adaptador para Fintech C.

- `src/main/java/org/example/patronadapter/`: Contiene el punto de entrada principal del programa.
  - [`PatronAdapterMain.java`](https://github.com/davidfer1112/patronadapter/tree/main/src/main/java/org/example/patronadapter/PatronAdapterMain.java): Clase principal que demuestra el uso del patrón Adapter con las fintechs.

## Uso

Para utilizar este patrón, se crea una solicitud de crédito y se envía a través de los adaptadores correspondientes. Cada adaptador se encarga de transformar la solicitud al formato requerido por cada sistema fintech y procesar la respuesta.

```java
FintechSolicitudCredito request = new FintechSolicitudCredito();
request.setCliente("Cristiano Ronaldo");
request.setValor(2000);

InterfaceFintechAdaptador FinancieraA = new AdaptadorFintechA();
FintechCreditoRespuesta FAresponse = FinancieraA.EnvioSolicitudCredito(request);
System.out.println("Resultado aprobación Financiera <<A>>: > " + FAresponse.isAprobacion());
```
