# Facturador en Java
Aplicación realizada en Eclipse Mars con la ayuda de GitHub para el trabajo en equipo, así como la creación y estructuración de una documentación *medianamente* decente.


----------
# Requisitos

 - JRE/JDK 1.8 
 - MySQL >= 5 
 - Manejador de reportes (No determinado todavía, puede ser Pentaho-Reports, iReports o Jasper Reports)

__________________

>##Notas importantes##
> - Esta documentación puede (Y seguramente debe) estar incompleta, en la sección de Issues puedes señalar deficiencias respecto a la documentación del código o a este README mismo.
> - Al clonar la carpeta debe afinar la dirección de las librerias (la ruta por defecto es /src/com/Facturador/libs) para que la aplicación funcione, puede hacer esto facilmente desde Eclipse en la opción `Build Path` > `Add Libraries...`
> - Ya que la aplicación fue realizada desde Eclipse Mars, es posible que si utiliza versiones anteriores de Eclipse para editar el codigo puedan ocurrir errores, manténgase [al filo de las novedades](https://es.wikipedia.org/wiki/Bleeding_edge_technology) y consiga la [ultima versión de eclipse](https://eclipse.org/downloads/) si es necesario.
> - El modelo relacional de la base de datos fue (o será) realizado en [MySQL WorkBench](http://dev.mysql.com/downloads/workbench/), y el modelo entidad-relación en [Microsoft Visio 2013](https://thepiratebay.se/torrent/9696046/Microsoft_Visio_Pro_2013_SP1_VL_x86_en-US), ambos modelos agregados al presente README.

____________________________

#¿Qué es esto?

Es una aplicación que puede registrar **productos**, emitir **compras**, **ventas**, y generar **facturas** de esas operaciones, el mismo también permite registrar clientes y proveedores, así como llevar un inventario de los productos en existencia.

____________________________

#¿Cómo obtengo el proyecto?
Hay dos formas:
>##Importando el proyecto manualmente a Eclipse##
> - Descargando el ZIP desde [acá](https://github.com/leothescrub/Facturador-t2m2/archive/master.zip) y luego importarlo al Workspace desde Eclipse.

_____________________________

>##Clonando el repositorio desde Eclipse (Mars) con GitHub##
> - Click derecho en el workspace, luego Import...

> - Git > Projects from Git
> - ![Topkek](http://puu.sh/mB0yW/607fd567f3.png)
> - Clone URL
> - Copiar la url del .git (https://github.com/leothescrub/Facturador-t2m2.git)
> - ![enter image description here](http://puu.sh/mB0CM/2776ec7a1d.png)
> - (No es necesario tener cuenta, es mera formalidad)
> - Seleccionar el Branch `Master`, luego Next
> - Seleccionar el destino
> - Marcar "Import Existing Eclipse Proyects"
> - Fin.

__________________________________

#Posibles errores
>##El proyecto no se puede importar desde Eclipse
> - El problema radica en que la descarga no se termina de efectuar, para ello vamos a la barra superior de eclipse, en la penultima opción `Window` > `Preferences` > `Team` >`Git` y establecemos el Timeout en una cantidad razonable de tiempo para que se descargue el repositorio (99999 segundos?)
![Ejemplo](http://puu.sh/mB3EZ/2fa365f3e0.png) 

> - Asegurate de eliminar la carpeta que contiene la descarga fallida, si no lo haces te dará problemas.

>##El login no funciona
> - Debes correr la aplicación desde `ClasePrincipal.java` que se encuentra en el paquete `com.Facturador.controlador`, de lo contrario sucederá eso 

>##El programa no hace facturas o no consigue las entidades al consultarlas
> - Heh, chequea el codigo

___________________________________

# Diagrama Entidad-Relación

El diagrama entidad-relación fue creado mediante Microsoft Visio 2013, el mismo puede ser encontrado en el directorio `sql_things`

![enter image description here](http://puu.sh/mAlP7/c66f370dcc.png)

__________________________________

# Modelo Relacional
El modelo relacional fue realizado mediante MySQL WorkBench, el mismo puede ser encontrado en el directorio `sql_things`

![enter image description here](http://puu.sh/mB3Ui/04e4d9b927.jpg)

Imagen a máxima resolución [acá](http://puu.sh/mB3Ui/04e4d9b927.jpg)

----------
# Script de la base de datos

Puedes usar la misma base de datos que se utilizó para este proyecto si importas el `Base de datos(No final).sql` que se encuentra en la carpeta `sql_things`.

![enter image description here](http://puu.sh/mAknN/0dfd65a587.png) 

Imagen a máxima resolución [acá](http://puu.sh/mAknN/0dfd65a587.png)

En el botón `Seleccionar archivo` marcamos el script y seleccionamos `Continuar`