# Agregación en Java: Computadora y Parlante

- `src/Parlante.java`: clase de los parlantes.
- `src/Computadora.java`: clase que agrupa parlantes.
- `src/Principal.java`: clase que ejecuta el ejemplo.
- `diagrama-clases.puml`: diagrama de clases en formato PlantUML.

## Cómo ejecutar el programa

1. Abra la carpeta del proyecto en IntelliJ IDEA, VS Code o cualquier editor con Java.
2. Verifique que tenga instalado Java 8 o una versión más reciente.
3. En PowerShell, desde la carpeta del proyecto, ejecute:

```powershell
javac -d out .\src\*.java
java -cp out Principal
```

Debe aparecer una salida parecida a esta:

```text
Parlantes de PC de Daniel:
- Logitech izquierdo
- Logitech derecho
El parlante sigue existiendo: Logitech izquierdo
```
