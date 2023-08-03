package triangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double ax , bx , cx, ay , by , cy;
      
   
       
       Scanner sc = new  Scanner(System.in);
       
   
       
       System.out.println("Digite os lados do triangulo X");
       ax = sc.nextDouble();
       bx = sc.nextDouble();
       cx = sc.nextDouble();
       
       
       System.out.println("Digite os lados do triangulo Y");
       ay = sc.nextDouble();
       by = sc.nextDouble();
       cy = sc.nextDouble();
       
       double p = (ax +bx +cx)/2;
       double areaX = Math.sqrt(p * (p - ax) * (p - bx) * (p - cx));
       
       
       p = (ay +by +cy)/2;
       double areaY = Math.sqrt(p * (p - ay) * (p - by) * (p - cy));
       
       System.out.printf("Triangulo de X: % 4f%n", areaX);
       System.out.printf("Triangulo de Y: % 4f%n", areaY);
       
       if(areaX > areaY) {
    	   System.out.println("Triangulo X tem a maior área");
    	   
    	   
       }else {
    	   System.out.println("Triangulo Y tem a maior área");
       }
      
    		   
    		   
    		   
    		   sc.close();
	}

}
