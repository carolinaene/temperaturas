package temperaturas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conversiones {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double centigrados;
		double kelvin;
		double fahrenheit;
		double resultado;
		int conversion;
		do {
		
		Scanner leer= new Scanner(System.in);
		
		
conversion=Integer.parseInt(JOptionPane.showInputDialog("Menu de conversiones\n1. centigradosTofahrenheit\n2. centigradosTokelvin\n3. fahrenheitTocentigrados\n4. fahrenheitTokelvin\n5. kelvinTocentigrados\n6. kelvinTofahrenheit"));

		switch (conversion) {
		
		case 1:
			System.out.println("centigrados a fahrenheit");
			System.out.println("ingrese los centigrados");
			centigrados=leer.nextDouble();
			resultado= (9*centigrados/5) +32;
			System.out.println("conversion: "+ resultado + "grados fahrenheit");
			break; 
			
		case 2: 
			System.out.println("centigrados a kelvin");
			System.out.println("ingrese los centigrados");
			centigrados=leer.nextDouble();
			resultado=((centigrados) + 273.15);
			System.out.println("conversion: "+ resultado + "grados kelvin");
			break; 
			
		case 3:
			System.out.println("fahrenheit a centigrados");
			System.out.println("ingrese los fahrenheit");
			fahrenheit=leer.nextDouble();
			resultado= 5*(fahrenheit-32)/9;
			System.out.println("conversion: "+ resultado + "grados centigrados");
			break; 
			
		case 4:
			System.out.println("fahrenheit a kelvin");
			System.out.println("ingrese los fahrenheit");
			fahrenheit=leer.nextDouble();
			resultado= 5*(fahrenheit-32) /9 + 273.15;
			System.out.println("conversion: "+ resultado + "grados kelvin");
			break; 
			
		case 5:
			System.out.println("kelvin a centigrados");
			System.out.println("ingrese los kelvin");
			kelvin=leer.nextDouble();
			resultado= kelvin - 273.15;
			System.out.println("conversion: "+ resultado + "grados centigrados");
			break; 
			
		case 6:
			System.out.println("kelvin a fahrenheit");
			System.out.println("ingrese los kelvin");
			kelvin=leer.nextDouble();
			resultado= 9*(kelvin - 273.15)/5 +32;
			System.out.println("conversion: "+ resultado + "grados fahrenheit");
			break; 
		
		
		}}  while(conversion!=6);

}
}