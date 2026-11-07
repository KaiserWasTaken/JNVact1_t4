# Proyecto Spring Boot

Aplicación web desarrollada con Spring Boot para practicar la creación de controladores REST y respuestas en formato JSON.

## Requisitos

- Java 25 o superior
- Maven (el proyecto incluye Maven Wrapper)

## Ejecutar localmente

Desde la carpeta del proyecto:

```powershell
.\mvnw.cmd spring-boot:run
```

La aplicación inicia en el puerto `9525`. También se puede compilar y ejecutar el archivo JAR:

```powershell
.\mvnw.cmd package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

## Endpoints REST

Todos los endpoints utilizan el método HTTP `GET`:

| Ruta | Descripción |
|---|---|
| `/api/proyecto` | Devuelve la información general del proyecto y su autor. |
| `/api/materias` | Devuelve una lista simulada de materias. |
| `/api/estado` | Devuelve el estado actual del servidor. |
| `/detalles_info2` | Endpoint REST de ejemplo original del proyecto. |

Con la aplicación ejecutándose localmente, las rutas están disponibles en:

```text
http://localhost:9525/api/proyecto
http://localhost:9525/api/materias
http://localhost:9525/api/estado
```

## Pruebas

Para ejecutar las pruebas automatizadas:

```powershell
.\mvnw.cmd test
```

## Estructura principal

```text
src/
├── main/
│   ├── java/com/web/demo/
│   │   ├── DemoApplication.java
│   │   └── controllers/
│   └── resources/
└── test/
```

