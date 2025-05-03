# TDA Cola: Implementación de Estructuras Estáticas y Dinámicas en Java

## Objetivo

El objetivo de este trabajo es implementar y aplicar los métodos asociados a las operaciones fundamentales del Tipo de Dato Abstracto (TDA) Cola, considerando tanto su versión con estructura estática (basada en arreglos) como dinámica (basada en listas enlazadas). A través de la resolución de ejercicios prácticos, se explorarán distintas aplicaciones de la cola en diversos contextos.

## Ejercicios

### Ejercicio 1: Implementación de la Interfaz y la Clase Cola

**Descripción**: Crear una interfaz `Cola` con los métodos básicos de una cola. Luego, implementar la clase `Cola`, considerando tanto una implementación estática como dinámica.

**Métodos**:
- `enqueue`: Para agregar un elemento al final de la cola.
- `dequeue`: Para remover y retornar el elemento al frente de la cola.
- `isEmpty`: Para verificar si la cola está vacía.
- `isFull`: Para verificar si la cola está llena (solo para la implementación estática).
- `peek`: Para ver el elemento al frente de la cola sin removerlo.
- `display`: Para ver todos los elementos de la cola.

### Ejercicio 2: Control de Turnos en una Farmacia

**Descripción**: Implementar un sistema que administre una cola de clientes en una farmacia, donde cada cliente tiene un número de turno secuencial.

**Funcionalidades**:
- Agregar un nuevo cliente a la cola.
- Atender al cliente del frente.
- Mostrar la cola actual de espera.

### Ejercicio 3: Simulación de Tareas en una Impresora

**Descripción**: Modelar una cola de tareas que deben enviarse a una impresora. Cada tarea tiene un nombre y una cantidad de páginas.

**Funcionalidades**:
- Agregar nuevas tareas.
- Procesar tareas de una en una.
- Calcular cuántas páginas se han impreso en total.

### Ejercicio 4: Administración de un Buffer Circular de Sensores

**Descripción**: Implementar un buffer circular que almacene los últimos N valores de un sensor de temperatura.

**Funcionalidades**:
- Registrar nuevas temperaturas, sobrescribiendo las más antiguas si el buffer se llena.
- Mostrar el contenido del buffer desde el más reciente al más antiguo.

### Ejercicio 5: Simulador de Ventanilla Bancaria con Cola Circular

**Descripción**: Implementar una cola circular de atención rápida en un banco, con un máximo de 5 clientes.

**Funcionalidades**:
- Admitir nuevos clientes si hay lugar.
- Atender al cliente del frente (y liberarlo).
- Mostrar el estado actual de la cola.

### Ejercicio 6: Sistema de Triage de Hospital

**Descripción**: Un hospital utiliza un sistema de triage que clasifica a los pacientes según su gravedad (mayor número = más grave). Cada paciente tiene un nombre y prioridad.

**Funcionalidades**:
- Permitir ingresar pacientes con su prioridad.
- Atender siempre al paciente más grave.
- Mostrar la lista actual de espera por prioridad.

### Ejercicio 7: Planificación de Procesos del Sistema Operativo

**Descripción**: Un planificador de procesos administra procesos según su prioridad (cuanto más alta, antes se ejecuta). Cada proceso tiene un ID, un nombre y una prioridad.

**Funcionalidades**:
- Cargar nuevos procesos.
- Ejecutar (eliminar) el proceso más prioritario.
- Mostrar el estado actual de la cola de ejecución.

### Ejercicio 8: Gestión de Llamadas en un Call Center

**Descripción**: Un call center recibe llamadas que se almacenan en una cola implementada con listas. Cada llamada contiene un ID, nombre del cliente y duración estimada.

**Funcionalidades**:
- Insertar una nueva llamada al final.
- Atender (eliminar) la llamada del frente.
- Mostrar todas las llamadas pendientes.
- Calcular el tiempo total estimado en espera.

### Ejercicio 9: Registro de Pedidos en una Cafetería

**Descripción**: Cada pedido recibido por la barra de una cafetería se encola en una cola implementada con listas. Los pedidos se procesan por orden de llegada. Cada pedido tiene número, nombre del cliente y detalle.

**Funcionalidades**:
- Registrar nuevos pedidos.
- Entregar el pedido más antiguo.
- Listar los pedidos en espera.
- Permitir cancelar un pedido si aún no fue atendido (búsqueda y eliminación en lista).

### Ejercicio 10: Fila Rápida vs Fila Regular en un Banco

**Descripción**: Un banco tiene dos colas: una regular y otra rápida (para trámites simples). Cada cliente tiene un nombre y tipo de operación.

**Funcionalidades**:
- Clasificar automáticamente cada cliente en la fila correspondiente.
- Atender los clientes, indicando el turno que será atendido, alternando entre filas (si ambas tienen elementos).
- Mostrar el estado de ambas colas.

## Estructuras de Datos Utilizadas

- **Cola Estática**: Implementación basada en un arreglo de tamaño fijo.
- **Cola Dinámica**: Implementación basada en una lista enlazada.
- **Cola Circular**: Implementación con un buffer circular para manejar los elementos de manera cíclica.
- **Cola con Prioridad**: Implementación que permite atender los elementos según su prioridad.

## Integrantes del Grupo

- **Nombre Completo:** Melissa Oriana Mareco  
- **Legajo:** 1148938

## Requisitos

- Java 8 o superior.
- Entorno de desarrollo como IntelliJ IDEA, Eclipse, o similar.
- Uso de estructuras de datos genéricas para mayor flexibilidad.

## Cómo Ejecutar

1. Clona este repositorio:
   ```bash
   git clone <url-del-repositorio>
