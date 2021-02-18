# ***Lab # 3 Taller Clientes y Servicios***

## Introducción Del Proyecto

En este laboratorio 2 de introducción al dise˜no de sistemas inform´aticos, se procedi´o a desarrollar un programa que permitiera calcular dos operaciones: La
desviaci´on est´andar y la media en un conjunto de
n´umeros reales, proporcionados por el usuario. El programa lee n´umeros reales desde una p´agina web, en la
cual tiene acceso el usuario, con el fin de que pueda
hacer el c´alculo de sus operaciones correspondientes.

Para realizar estos c´alculos correspondientes se
necesito una estructura de datos de tipo ”Linked List”,
con la aplicaci´on de Java, para que estas pudieran ser
desplegadas. Se necesito adquirir el conocimiento para
uso framework Spark, el cual es necesario para poder
desarrollar la aplicaci´on. Realizar la validaci´on de un
despliegue continuo con CircleCI.



### Pre-Requisitos

- Para la realización de este laboratorio es necesario el uso de los aplicativos mencionados abajo de la descripción, en donde si no cuenta con alguno de estos,
       solo es necesario darle click al que necesite y lo dirigira a la pagina de instalacion: 

    * [Java 8.0](https://www.java.com/es/) - Codificación
    * [Maven](https://maven.apache.org/) - Manejo de Dependencias
    * [JUnit](https://junit.org/junit5/) - Pruebas de Unidad
    * [Git](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git) - Control de Sistemas de veriones.
    * [Heroku](https://devcenter.heroku.com/articles/heroku-cli#download-and-install) - Despligue de Ambiente Web


### Despliegue con Heroku App

>[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://eci-horarios.herokuapp.com/)


### Integracion Continua con Circle CI
>[![CircleCI](https://circleci.com/gh/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI.svg?style=svg)](https://app.circleci.com/pipelines/github/Software-Development-Industries/ECI-Horarios)
>

### Calidad Del Código con Codacy

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/b62c449e43f24a86803f524a67d373ea)](https://app.codacy.com/gh/Software-Development-Industries/ECI-Horarios/dashboard)

### Guia de Instalación

1. Primero se debe clonar el repositorio, con el siguiente comando descrito:

       git clone https://github.com/Fabimauri47/AREP-Lab2-Heroku
    

2. Luego proceda abrir el cmd (Ventana de comandos) en donde tiene el repositorio alojado y ejecute el siguiente comando:

       mvn package
    

3. Ejecutamos el programa con el siguiente comando:

       mvn exec:java -D "exec.mainClass"="edu.escuelaing.arem.designprimer.SparkWebApp"
       In your browser: http://localhost:4567
   

4. Gereramos la documentación con el siguiente comando ejecutandolo desde consola:

       mvn javadoc:javadoc
   
 


## Corriendo Pruebas

Para correr las pruebas, usamos el siguiente comando en una terminal CMD o en una terminal GIT:

         mvn test

 
## Desarrollo e Informe

- Para conocer mas sobre el desarrollo del proyecto, descargue el proyecto como se explica arriba o revise el informe:

    -[Presione Aqui para revisar documento](https://github.com/Fabimauri47/AREP-Lab2-Heroku/blob/main/Lab2__INTRODUCTION_TO_COMPUTER_SYSTEM_DESIGN.pdf)

## Construido con

* [Java 8.0](https://www.java.com/es/) - Codificación y Lenguaje de Programacíon.
* [JUnit5](https://junit.org/junit5/) - Programa para ejecutar pruebas de unidad.
* [Maven](https://maven.apache.org/) - Manejo de Dependencias.
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) - Programa usado para la Codificacíon.


## Autor

* **Fabián Mauricio Ramirez Pinto** [Fabimauri47](https://github.com/Fabimauri47)


## Licencia

Este proyecto cuenta con la licencia GNU: General Public License - see the [LICENSE.md](https://github.com/Fabimauri47/AREP-Lab1-Calculadora/blob/main/LICENSE.txt) 
