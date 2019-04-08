
/**
 * @author: Jesusin Jilo
 * @version: 28/02/2019 F
 *////CAMBIO
public class github {
String nombre;
String apellido;
private static int numalumnos;
public static double notaMedia;
/**
 * Getter
 * @return nos devuelve el nombre.
 */
public String getnombre() {
return nombre;
}
/**
 * Getter
 * @return nos devuelve el apellido.
 */
public String getapellido() {
return apellido;
}
public static void setnombre(String name) {

}
public static void setapellido(String ap) {

}
/**
 * Getter 
 * @return nos devuelve el numero de alumnos.
 */
public int getnumalumnos() {
return numalumnos;
}
public void incrementar() {
notaMedia++;
}
public void resultado() {
this.incrementar();

}
/**-
 * Getter
 */

public github (String nombre, String apellido)  {
this.nombre=nombre;
this.apellido=apellido;
numalumnos++;
}
/**
 * @param alumno : alumno
 */
public github(github alumno1) {
this.nombre=alumno1.getnombre();
this.apellido=alumno1.getapellido();
numalumnos++;
}
public github() {
String nombre="Jesús";
String apellido=" Jiménez";
this.nombre=nombre;
this.apellido=apellido;
numalumnos++;
}
}		