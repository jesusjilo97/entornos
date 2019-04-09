package github;

import alumno;

import java.util.Scanner;

public class githubdos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MODIFICACIÓN DEL PROYECTO EN ECLIPSE
		
		Scanner entrada= new Scanner(System.in);
		alumno a1=new alumno("EDITADO CON GITHUB");
		alumno a2=new alumno(a1);
		System.out.print("a1.getnombre"());
		System.out.println("a1.getapellido"());
		System.out.print("a2.getnombre"());
		System.out.println("a2.getapellido"());
		a2=a1;
		a1.setnombre("Carlos");
		System.out.println("a2.getnombre"());
		System.out.println("a1.getnombre"());
		if (a1.getnombre().equals(a2.getnombre())) {
		System.out.println("Los nombres coinciden");
		}
		else {
		System.out.println("Los nombres no coinciden");	
		}
		String nombre, apellido;
		alumno a3=new alumno();
		System.out.print("a3.getnombre"());
		System.out.println
		(a3.getapellido());
		System.out.println("Escribe un nombre");
		nombre=entrada.nextLine();
		System.out.println("Escribe un un apellido");
		apellido=entrada.nextLine();
		alumno a4= new alumno(nombre, apellido);
		System.out.print(a4.getnombre());
		System.out.print("-");
		System.out.println(a4.getapellido());
		System.out.println("NÃºmero de alumnos: "+ a4.getnumalumnos() + "-");
		a4.resultado();
		System.out.println("La nota final es um: "+ a4.getresultado() + "-");
		
		
	}

}
