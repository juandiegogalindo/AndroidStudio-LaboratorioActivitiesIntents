# Laboratorio 2 – Activities e Intents

## 1. Nombre del Proyecto
Laboratorio 2 – Comunicación entre Activities en Android

---

## 2. Descripción

Aplicación Android desarrollada en Java que implementa comunicación bidireccional entre dos Activities mediante el uso de Intents explícitos y el mecanismo moderno `ActivityResultLauncher`.

El proyecto permite enviar un mensaje desde una Activity principal hacia una segunda Activity y recibir una respuesta de regreso, demostrando el flujo completo de comunicación de ida y vuelta dentro de una misma aplicación.

---

## 3. Objetivo Académico

Implementar y comprender:

- Creación y configuración de múltiples Activities.
- Uso de Intents explícitos.
- Envío de datos con `putExtra()`.
- Recuperación de información con `getStringExtra()`.
- Retorno de datos mediante `setResult()`.
- Uso de `ActivityResultLauncher`.
- Configuración adecuada del `AndroidManifest.xml`.

---

## 4. Tecnologías Utilizadas

- Lenguaje: Java
- Entorno de desarrollo: Android Studio
- SDK mínimo: API 23
- Sistema de construcción: Gradle (Groovy DSL)
- Arquitectura basada en Activities y XML layouts

---

## 5. Estructura del Proyecto

```
app/
 ├── java/co/edu/unipiloto/...
 │    ├── CreateMessageActivity.java
 │    └── ReceiveMessageActivity.java
 │
 ├── res/layout/
 │    ├── activity_create_message.xml
 │    └── activity_receive_message.xml
 │
 └── AndroidManifest.xml
```

---

## 6. Flujo de Funcionamiento

1. El usuario escribe un mensaje en la primera Activity.
2. Se crea un Intent explícito.
3. El mensaje se envía mediante `putExtra()`.
4. La segunda Activity recibe el mensaje con `getIntent()`.
5. El usuario escribe una respuesta.
6. Se envía el resultado con `setResult()`.
7. La primera Activity recibe la respuesta mediante `ActivityResultLauncher`.

---

## 7. Ejecución del Proyecto

1. Clonar el repositorio:

```
git clone https://github.com/juandiegogalindo/AndroidStudio-LaboratorioActivitiesIntents.git
```

2. Abrir el proyecto en Android Studio.
3. Sincronizar Gradle.
4. Ejecutar en emulador o dispositivo físico.

---

## 8. Conceptos Aplicados

- Ciclo de vida de una Activity.
- Comunicación entre componentes.
- Gestión de resultados entre pantallas.
- Arquitectura básica de aplicaciones Android.

---

## 9. Imagenes Demostracion

1. Imagen Inicial del Programa:

<img width="366" height="239" alt="image" src="https://github.com/user-attachments/assets/df93fcfd-a032-4107-ab90-0454e0cb7c4a" />


2. Imagenen del texto recibido:

<img width="368" height="209" alt="image" src="https://github.com/user-attachments/assets/14a43250-3d7c-42a4-be09-43550cea008b" />

   
3. Imagen del mensaje de respuesta:

<img width="370" height="203" alt="image" src="https://github.com/user-attachments/assets/72504fe0-3bf6-4f45-acb2-38513e458230" />


---
