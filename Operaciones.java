public class Operaciones{
  public static void main(String args[]){

  int num_uno = 5, num_dos = 3, resultado = 0;
  int parametro = 2;
  
  switch(parametro){
    
   case 1: resultado = num_uno + num_dos;
           System.out.println("El resultado de la suma es: " + resultado);
           break;

   case 2: resultado = num_uno - num_dos;
           System.out.println("El resultado de la resta es: " + resultado);
           break; 

   case 3: resultado = num_uno * num_dos;
           System.out.println("El resultado de la multiplicacion es: " + resultado);
           break; 

   case 4: resultado = num_uno / num_dos;
           System.out.println("El resultado de la division es: " + resultado);
           break; 

   default: System.out.println("Error, la opcion no existe");
            break; 
  }  
 
 }
}