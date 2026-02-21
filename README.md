
ANÁLISIS DEL TAREA MAVEN-DEPENDENCIAS...

¿Qué tanto se dificulta la lectura?

En el JAR normal, los nombres de clases, métodos y variables son claros y nos ayudan a entender qué hace cada parte del programa. Por ejemplo, ExpressionValidator valida expresiones y stack que es la pila. Después de ofuscar, estos nombres cambian a letras como a, b o c, que no tienen significado. Esto hace que sea mucho más difícil leer el código rápidamente. Para entenderlo, ahora hay que analizar cada línea con más cuidado y detalle.

¿Se pierde claridad estructural?

La estructura del código, como los ciclos for y las condiciones if, sigue igual después de la ofuscación. Sin embargo, los nombres de clases, métodos y variables se reemplazan por letras genéricas. Por ejemplo, isBalanced puede llamarse a y stack puede ser b. Esto hace que no sea inmediato saber qué hace cada parte. Aunque la lógica interna sigue intacta, leer el código se vuelve más lento y menos perceptivo o comprensible.

¿Sigue siendo posible entender la lógica?

Sí, la lógica del programa sigue siendo la misma y funciona igual que antes de ofuscar. Se puede ver que los caracteres se agregan a la pila y se revisan los paréntesis, incluso con nombres genéricos. Sin embargo, ahora se necesita más atención para deducir qué hace cada instrucción. La ofuscación no impide que entendamos el flujo del programa, pero sí aumenta el esfuerzo y el tiempo para comprenderl y saber su función.


-------------------------------------------------------------------------

Proyecto: Validación de Expresiones con Pila

Este repositorio contiene dos proyectos Java que trabajan juntos para validar expresiones algebraicas usando una pila implementada manualmente, con gestión de dependencias mediante Maven y protección del código mediante ofuscación.

-Estructura del repositorio
/umg.edu.gt.data-structure.stack --> Librería con la implementación manual de la pila
/stackHandler --> Proyecto principal que valida expresiones
/evidencias --> Capturas de ejecución y decompilado
README.md --> Instructivo


 Requisitos
- Java JDK 11 o superior
- Maven instalado
- Sistema operativo compatible (Windows, Linux, macOS)
- IDE opcional, pero todas las pruebas deben ejecutarse desde consola.

-------------------------------------------------------------------------

1. Compilar proyectos

1.1 Librería `umg.edu.gt.data-structure.stack`

1. Abrir consola y posicionarse en la carpeta del proyecto:
cd umg.edu.gt.data-structure.stack

2. Instalar la librería en el repositorio local con el comando:
    mvn clean install
Este comando utilizado generará el JAR de la librería que será consumido por stackHandler.

1.2 Proyecto stackHandler

1. Posicionarse en la carpeta del proyecto:
     cd ../stackHandler

2. Compilar el proyecto con Maven con el comando:
      mvn clean package

3. Compilar el JAR ofuscado (perfil ProGuard) con el comando:
        mvn clean package -Pobfuscate


Al finalizar estos pasos se obtendrá:

-stackHandler-1.0-SNAPSHOT.jar --> JAR normal

-stackHandler-1.0-SNAPSHOT-obfuscated.jar --> JAR ofuscado

2. Ejecutar desde consola.

2.1 Ejecutar JAR normal con el comando:
 java -jar stackHandler-1.0-SNAPSHOT.jar "(a+b) * [c-d]"

Al ejecutarlo debe aparecer como resultado: 
Expression: (a+b) * [c-d]
Balanced: true

2.2 Ejecutar JAR ofuscado con el comando: 
java -jar stackHandler-1.0-SNAPSHOT-obfuscated.jar "(a+b) * [c-d]"

Al ejecutarlo debe aparecer como resultado: 
Expression: (a+b) * [c-d]
Balanced: true

2.3 Caso inválido, ejecutar el comando:
java -jar stackHandler-1.0-SNAPSHOT-obfuscated.jar "([)]"

Al ejecutarlo debe aparecer como resultado: 
Expression: ([)]
Balanced: false

Al realizar estos pasos, esto confirma que el main sigue funcionando después de la ofuscación.

