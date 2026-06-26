TALLER GRUPAL – POO Principios SOLID

INTEGRANTES: Devin Chamba, Daniela Jaya, Renata Reyes

Análisis del Problema

1.	¿Qué problemas puede ocasionar un sistema altamente acoplado? 

Puede provocar problemas al intentar implementar cambios en nuestro sistema ya que al estar tan relacionadas todas las clases, un cambio en una de estas puede afectar a las demas y provocar errores. 
Puede ocasionar dificultades para realizar pruebas ya que cuando las clases dependen fuertemente unas de otras, es complicado probar una clase de forma aislada.
Provoca un desarrollo más lento debido a que los programadores deben entender muchas partes del sistema antes de realizar una modificación sencilla.
En general hace que el mantenimiento, la reutilizacion de código y la implementacion de nuevas funciones sea más dificil provocando que el crecimiento del sistema sea un aspecto no tan positivo


2.	¿Qué ventajas ofrece SOLID?
   
-	Nos permiten reutilizar la mayor cantidad de código posible 
-	Hacen que nuestro código sea mas organizado y facil de entender 
-	Hacen que las clases dejen de depender tanto entre sí
-	Nos ayudan al momento de realizar pruebas y detectar errores
-	Permiten agregar nuevas funcionalidades sin modificar código existente.

3.	¿Qué principio consideran más importante y por qué?
   
Creemos que el Principio Abierto/Cerrado (OCP) es uno de los más importantes porque permite agregar nuevas funcionalidades sin modificar el código existente. Esto hace que sea menos probable errores en partes del sistema que ya funcionan correctamente. Además, facilita la evolución del software y hace que sea más sencillo adaptarlo a nuevos requerimientos sin afectar su estabilidad.
Diseño UML
 <img width="921" height="500" alt="image" src="https://github.com/user-attachments/assets/6da94bbf-04f5-4c4c-975c-374945c65f05" />

Implementación en Java Desarrollar el sistema.

EXPLICACIÓN- DEFENSA DEL CÓDIGO

En nuestro programa la clase principal Main dirige e instancia a los participantes tomando en cuenta los principios SOLID y los pilares de la POO como la herencia, el polimorfismo y el encapsulamiento. En primer lugar, la Herencia se evidencia cuando las clases Jugador, Entrenador y Arbitro extienden de la clase padre participante, heredando sus atributos (nombre, nacionalidad, id) y permitiendo la reutilización de código. 
El Encapsulamiento protege estos datos ya que son declarados como private o protected y se usan métodos de acceso públicos (getters y settesr) para evitar modificaciones directas.
 Por otra parte tenemos las Interfaces (Notificacion, Reporte y Persistencia) que actúan como contratos que obligan a las clases WhatsApp, Correo, ReportePDF, ReporteExcel, BaseDatos y Archivo a implementar comportamientos específicos, aquí es donde se evidencia el Polimorfismo donde, por ejemplo, el método abstracto realizarActividad() ejecuta una lógica distinta según el objeto que lo invoque (entrenar disparos, planificar estrategias o supervisar reglas). 
El principio de Responsabilidad Única (SRP) se cumple porque cada clase hace una sola cosa bien en lugar de sobrecargar al GestorMundial, el cual solo coordina el flujo de la aplicación. 
El principio de Abierto/Cerrado (OCP) se evidencia porque podemos extender el sistema agregando nuevos canales como notificaciones por correo o almacenamiento físico en disco a través de Archivo sin nuestro código original.
El principio de Sustitución de Liskov (LSP) se aplica cuando el Main almacena de forma polimórfica a un jugador, un entrenador y un árbitro dentro de variables de tipo genérico participante e interactúa con ellos sin romper el programa ni requerir validaciones manuales de tipo. 
La Segregación de Interfaces (ISP) se aplica al dividir las tareas del sistema en tres interfaces pequeñas en lugar de una interfaz gigantesca, evitando que una clase como WhatsApp deba implementar métodos de guardado en base de datos. 
Finalmente, la Inversión de Dependencias (DIP) se evidencia ya que el constructor de GestorMundial requiere estrictamente los tipos abstractos de las interfaces (Persistencia, Reporte, Notificacion) y jamás se acopla a las implementaciones de bajo nivel como BaseDatos o ReportePDF. 
CAPTURAS DE EJECUCIÓN 
 <img width="783" height="353" alt="image" src="https://github.com/user-attachments/assets/37616bcc-ca44-4825-b470-92a28ec9feca" />
<img width="734" height="525" alt="image" src="https://github.com/user-attachments/assets/869dbd09-c354-4846-a43f-8aef3a215e5e" />


 
