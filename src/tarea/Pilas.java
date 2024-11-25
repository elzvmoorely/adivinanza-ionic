package tarea;
import java.util.Scanner;
import java.util.Stack;

public class Pilas {
	  public static void main(String[] args) {
	  Scanner tec = new Scanner(System.in);
	        
	    double[] sec = new double[10];
	    System.out.println("Ingresa una secuencia de 10 números reales (enteros o decimales)");
	    for (int i = 0; i < 10; i++)
	    {
	    double chuchito;
	    sec[i] = tec.nextDouble();
	    }
	    Stack<Double> pila = new Stack<>();
	     for (int j = 0; j < 10; j++) 
	        {
	            pila.push(sec[j]);
	        }

	   System.out.println("Secuencia original:");
	      for (int k = 0; k < 10; k++) 
	        {
	            System.out.print("["+sec[k] + "]"+ " ");
	        }
	   System.out.println();

	        
	   System.out.println("Secuencia con pila:");
	      while (!pila.isEmpty()) 
	       {
	          System.out.print("[" + pila.pop()+ "]" + " ");
	       }
	    }
	  
	}
