/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
    import java.util.Scanner;
/**
 *
 * @author Agus
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  int n1 = 4;
        int n2 = 5;
        int n3 = n1 + n2;
        int n4 = n3 / (n1-2);    
      
      -----------------------
        int e1 = 30;
        String nombre = "Agustin Pereyra";
        
        System.out.println("Mi nombre es " + nombre + " y tengo " + e1);  
      
      -------------------------
      Scanner leer = new Scanner(System.in);
      int numero = leer.nextInt();
            System.out.println(numero);    
      
     -------------------------------
    
     Scanner leer = new Scanner(System.in);
     System.out.print("true or false? ");
     boolean logica=leer.nextBoolean();
      System.out.print("numero random positivo ");
     float real=leer.nextFloat();
     System.out.print("Dame ese puto caracter ");
     char caracter=leer.next().charAt(0);
     System.out.println("tu letra es la "+ caracter + " tu numero random elegido fue el " + real + " y segun vos todo esto es " + logica); 
    
      ------------------------------------     
      System.out.print("Ingrese dos numeros ");
      Scanner leer = new Scanner(System.in);
      int n3 = 0;
      int n1 = leer.nextInt();
      int n2 = leer.nextInt();
      if (n1>25){
          n3 = 1;}
      if (n2>25){
          n3 = n3 + 1;}
      if (n3>0){
          System.out.println("la cantidad de numeros mayores a 25 es de " + n3);}
      else
          System.out.println("no tienes numeros mayores a 25" );
      ----------------------------------------------------------------------- 
      
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese cantidad de caracteres");
        int caract,i,j;
        
        caract=leer.nextInt();
        
        for (i=1; i <= caract; i++){
            for (j=1; j <= caract; j++){
         if ((i>1) && (i<caract) && (j>1) && (j<caract)){
             System.out.print(" ");
         }  
         else{
             System.out.print("*");
         }
                   
         }
            System.out.println(" ");
        }
        
       
    }
}

   ----------------------------------------------------------------------------------    
    
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        double euros = leer.nextDouble();
        System.out.println("Ingrese la moneda a convertir");
        String moneda = leer.next();
        cambiar(euros,moneda);
        
    }
    public static void cambiar(double euros, String moneda){
        switch (moneda){
            case "libras":
                System.out.println("en libras es: "+(0.86*euros));
                break;
            case "dolar":
                System.out.println("en dolar es: "+(1.28611*euros));
                break;
            case "yenes":
                System.out.println("en yenes es; "+ (129.852*euros));
                break;
        }
    }


----------------------------------------------------------------------------------------- 
        
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es primo");
        int num = leer.nextInt();
        
        System.out.println(numPrimo(num));
       
    }
  public static boolean numPrimo(int num){
  int cont = 2;
  boolean primo = true;
      while(cont<num && primo == true){
        if (num%cont==0){
            primo = false;
        }else{
        cont = cont+1;
        }
    }
  
 return primo; 
  
  }

  -------------------------------------------------------------------------------------------------------      
        
        
        
        
        public static void main(String[] args) { String vectorA[] = new String[1000];
       

        for(int i = 0; i < 1000; i++){
            
            vectorA[i] = Integer.toString(i).replace("3", "E");
        }

        for(int i = 0; i < 1000; i++){
             
            System.out.println(vectorA[i]); 
         }
        // TODO code application logic here
    }
    
}

        
        
        
   --------------------------------------------------------------------------------------------------     
        
        
        
        */

      
    }
}