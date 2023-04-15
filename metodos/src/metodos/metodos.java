package metodos;

import java.util.Scanner;
import java.util.*;

public class metodos {
int num1 = 0;
int num2 = 0;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		Scanner teclado= new Scanner(System.in);
                  
        System.out.println("primer numero 1: ");
        n1=teclado.nextInt();
        
        System.out.println("segundo numero 2: ");
        n2=teclado.nextInt();		
		
metodos calcula = new metodos(n1,n2);

int resultadosuma = calcula.sumar();
System.out.print("Suma: "+resultadosuma);
System.out.print(System.lineSeparator());

int resultadoresta = calcula.restar();
System.out.print("Resta: "+resultadoresta);
System.out.print(System.lineSeparator());

int resultadomulti = calcula.multi();
System.out.print("Multiplicacion: "+resultadomulti);
System.out.print(System.lineSeparator());

int resultadodivi = calcula.divi();
System.out.print("Division: "+resultadodivi);
System.out.print(System.lineSeparator());
		
	}		
		
	public metodos(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int sumar(){
		int resul = num1 + num2;
		return resul;
	}
	
	public int restar() {
		int resul = num1 - num2;
		return resul;
	}
	public int multi() {
		int resul = num1 * num2;
		return resul;
	}
	public int divi() {
		int resul = num1 / num2;
		return resul;
	}
}




