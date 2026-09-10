# Agregación en Java: Computadora y Parlante

Integrantes: Daniel Cubillos, Johan Burgos y Juan Carreño.

## Idea del ejemplo

Una computadora puede tener varios parlantes. Los parlantes se crean por fuera y luego se agregan a la computadora. Por eso pueden seguir existiendo aunque la computadora deje de usarse. Esa es la idea de la agregación.

## Archivos

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

## Cómo subirlo a GitHub

1. En GitHub cree un repositorio nuevo llamado `agregacion-java` y no agregue README, licencia ni `.gitignore`, porque ya están en esta carpeta.
2. Abra PowerShell dentro de esta carpeta y ejecute los siguientes comandos. Cambie `TU_USUARIO` por su usuario de GitHub:

```powershell
git init
git add .
git commit -m "Ejemplo de agregacion en Java"
git branch -M main
git remote add origin https://github.com/TU_USUARIO/agregacion-java.git
git push -u origin main
```

3. El vínculo final tendrá esta forma: `https://github.com/TU_USUARIO/agregacion-java`.

Si GitHub pide iniciar sesión, complete el inicio de sesión en la ventana que aparezca y vuelva a ejecutar el último comando.
