# 🏬 Projecto-Almacen

🇪🇸 [Español](#-español) | 🇬🇧 [English](#-english)

---

## 🇪🇸 Español

Aplicación de escritorio en Java para la gestión de un almacén/inventario, desarrollada como proyecto académico. Incluye control de acceso de usuarios, administración de productos, registro de ventas y generación de reportes.

### 🚀 Funcionalidades

- 🔐 Acceso de usuarios (`AccesoUsuarios`) con creación y gestión de cuentas (`CrearUsuario`, `MenuUsuarios`).
- 📦 Gestión de productos: creación, modificación, eliminación y búsqueda por código o nombre (`CrearProducto`, `ModificarProducto`, `BorrarProducto`, `BuscarCodigo`, `BuscarNombre`).
- 🧾 Registro y rastreo de ventas (`RegistrarVenta`, `RastrearVenta`, `MostrarVenta`).
- 🏢 Gestión general de bodega y reportes (`GestionBodega`, `GestionProductos`, `GestionVentas`, `GestionReportes`).
- 💾 Persistencia en archivos de texto plano (`Productos.txt`, `Usuarios.txt`, `Ventas.txt`).

### 🔧 Tecnologías y herramientas

- Java (proyecto NetBeans, `build.xml` con Ant)
- Interfaz gráfica: `javax.swing` (formularios `.form`)
- Persistencia: archivos de texto (sin base de datos)
- Librería externa: [JCalendar](https://toedter.com/jcalendar/) (`Libreria/jcalendar-1.1.4.jar`)

### 🏗️ Estructura del proyecto

```
Projecto-Almacen/
├── src/almaceninventario/
│   ├── AccesoUsuarios.java        # Login / control de acceso
│   ├── AlmacenInventario.java     # Clase principal
│   ├── MenuPrincipal.java         # Menú principal
│   ├── MenuUsuarios.java          # Menú de gestión de usuarios
│   ├── CrearUsuario.java          # Alta de usuarios
│   ├── GestionProductos.java      # Menú de gestión de productos
│   ├── CrearProducto.java         # Alta de productos
│   ├── ModificarProducto.java     # Edición de productos
│   ├── BorrarProducto.java        # Eliminación de productos
│   ├── BuscarCodigo.java          # Búsqueda por código
│   ├── BuscarNombre.java          # Búsqueda por nombre
│   ├── GestionVentas.java         # Menú de gestión de ventas
│   ├── RegistrarVenta.java        # Registro de una venta
│   ├── RastrearVenta.java         # Consulta/rastreo de ventas
│   ├── MostrarVenta.java          # Detalle de una venta
│   ├── GestionBodega.java         # Gestión general de bodega
│   ├── GestionReportes.java       # Generación de reportes
│   ├── ArchivoProductos.java      # Persistencia de productos
│   ├── ArchivoUsuarios.java       # Persistencia de usuarios
│   ├── ArchivoVentas.java         # Persistencia de ventas
│   ├── Producto.java              # Entidad Producto
│   ├── Usuario.java               # Entidad Usuario
│   ├── Venta.java                 # Entidad Venta
│   └── ProductoVendido.java       # Entidad producto vendido (detalle de venta)
├── Libreria/                      # Librerías externas (JCalendar)
├── Productos.txt / Usuarios.txt / Ventas.txt   # Persistencia en texto plano
└── build.xml                      # Configuración del proyecto (Ant)
```

### 🚀 Cómo ejecutar

1. Abrir el proyecto en NetBeans (`File > Open Project`).
2. Clean and Build.
3. Ejecutar `AlmacenInventario.java` (clase principal).

### 📄 Licencia

Proyecto académico.

---

## 🇬🇧 English

A Java desktop application for warehouse and inventory management, built as an academic project. It includes user access control, product administration, sales tracking, and report generation.

### 🚀 Features

- 🔐 User login (`AccesoUsuarios`) with account creation and management (`CrearUsuario`, `MenuUsuarios`).
- 📦 Product management: create, edit, delete, and search by code or name (`CrearProducto`, `ModificarProducto`, `BorrarProducto`, `BuscarCodigo`, `BuscarNombre`).
- 🧾 Sales registration and tracking (`RegistrarVenta`, `RastrearVenta`, `MostrarVenta`).
- 🏢 General warehouse management and reporting (`GestionBodega`, `GestionProductos`, `GestionVentas`, `GestionReportes`).
- 💾 Plain-text file persistence (`Productos.txt`, `Usuarios.txt`, `Ventas.txt`).

### 🔧 Technologies and Tools

- Java (NetBeans project, `build.xml` with Ant)
- GUI: `javax.swing` (`.form` files)
- Persistence: plain text files (no database)
- External library: [JCalendar](https://toedter.com/jcalendar/) (`Libreria/jcalendar-1.1.4.jar`)

### 🏗️ Project Structure

```
Projecto-Almacen/
├── src/almaceninventario/
│   ├── AccesoUsuarios.java        # Login / access control
│   ├── AlmacenInventario.java     # Main class
│   ├── MenuPrincipal.java         # Main menu
│   ├── MenuUsuarios.java          # User management menu
│   ├── CrearUsuario.java          # Create user
│   ├── GestionProductos.java      # Product management menu
│   ├── CrearProducto.java         # Create product
│   ├── ModificarProducto.java     # Edit product
│   ├── BorrarProducto.java        # Delete product
│   ├── BuscarCodigo.java          # Search by code
│   ├── BuscarNombre.java          # Search by name
│   ├── GestionVentas.java         # Sales management menu
│   ├── RegistrarVenta.java        # Register a sale
│   ├── RastrearVenta.java         # Track/query sales
│   ├── MostrarVenta.java          # Sale detail view
│   ├── GestionBodega.java         # General warehouse management
│   ├── GestionReportes.java       # Report generation
│   ├── ArchivoProductos.java      # Product persistence
│   ├── ArchivoUsuarios.java       # User persistence
│   ├── ArchivoVentas.java         # Sales persistence
│   ├── Producto.java              # Product entity
│   ├── Usuario.java               # User entity
│   ├── Venta.java                 # Sale entity
│   └── ProductoVendido.java       # Sold-product entity (sale line item)
├── Libreria/                      # External libraries (JCalendar)
├── Productos.txt / Usuarios.txt / Ventas.txt   # Plain-text persistence
└── build.xml                      # Project configuration (Ant)
```

### 🚀 How to Run

1. Open the project in NetBeans (`File > Open Project`).
2. Clean and Build.
3. Run `AlmacenInventario.java` (main class).

### 📄 License

Academic project.
