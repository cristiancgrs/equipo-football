# Api Ordenar equipo

### Tecnology:
* Spring Boot 2 +
* Maven 3.5.3 +

### Start:
#### With Eclipse
* Run from application right click and run as.. > Spring Boot App


### Endpoint ordenar por edad


#### Method GET
*http://localhost:8080/equipoEdades

El controller "**JugadorController**" realiza una peticion al metodo "**ordenarJugadorEdad**" del service "**JugadorService**".
Este ultimo metodo usa el metodo "**ordenarEdad**", donde se realiza el ordenamiento de todos los jugadores por su edad.

####Response
```json
{
    "30": [
        "Eduardo Vargas"
    ],
    "31": [
        "Charles Aránguiz",
        "Alexis Sánchez"
    ],
    "32": [
        "Mauricio Isla"
    ],
    "33": [
        "Gary Medel",
        "Arturo Vidal"
    ],
    "34": [
        "Gonzalo Jara",
        "Matias Fernandez"
    ],
    "36": [
        "Jean Beausejour",
        "Jorge Valdivia"
    ],
    "37": [
        "Claudio Bravo"
    ]
}
```

### Endpoint ordenar por nombre:


#### Method GET
*http://localhost:8080/equipoNombres

El controller "**JugadorController**" realiza una peticion al metodo "**ordenarJugadorNombre**" del service "**JugadorService**".
Este ultimo metodo usa el metodo "**ordenarEdad**", donde se realiza el ordenamiento de todos los jugadores por su edad y luego ordena los nombres llamando el metodo "**sortNames**".

 
#### Response 
```json
{
    "30": [
        "Eduardo Vargas"
    ],
    "31": [
        "Alexis Sánchez",
        "Charles Aránguiz"
    ],
    "32": [
        "Mauricio Isla"
    ],
    "33": [
        "Arturo Vidal",
        "Gary Medel"
    ],
    "34": [
        "Gonzalo Jara",
        "Matias Fernandez"
    ],
    "36": [
        "Jean Beausejour",
        "Jorge Valdivia"
    ],
    "37": [
        "Claudio Bravo"
    ]
}
```