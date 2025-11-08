import java.util.*;

public class Main {
    static  Scanner teclado = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("calculadora de temperaturas v3");
       
        System.out.println("Digite a temperatura base ('celsios', 'kelvin' ou 'fahrenheit'):");
        String func = teclado.nextLine();
        
        switch (func) {
            case "celsios":
                celsios(args);  
                break;
            case "fahrenheit":
                fahrenheit(args);  
                break;
            case "kelvin":
                kelvin(args);  
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
     private static void celsios(String[] args) {
           System.out.println("digite a temperatura na qual deseja transformar");
           String tran = teclado.nextLine();
           System.out.println("digite a temperatura em celsios");
           Double ce = teclado.nextDouble(); 
            if (tran.equals("kelvin")) {
               Double ke = (ce + 273.15);
               System.out.println(ce+ " graus Celsius são "+ke+" kelvin ");
            }
            else if(tran.equals("fahrenheit")){
                Double fi = (9*ce+160)/5;
                System.out.println(ce+ " graus Celsius são "+fi+" Fahrenheit ");
            }
            else{
                System.out.println("imposivel calcular");
            }
        }
           
     private static void kelvin(String[] args){
           System.out.println("digite a temperatura na qual deseja transformar");
           String tran = teclado.nextLine();
           System.out.println("digite a temperatura em fahrenheit");
           Double ke = teclado.nextDouble(); 
            if (tran.equals("celsios")) {
               Double ce = (ke - 273.15);
               System.out.println(ke+ " graus kelvin são "+ce+" celsios ");
            }
            else if(tran.equals("fahrenheit")){
                double ce = (ke - 273.15 );
                Double fi = (9*ce+160)/5;
                System.out.println(ke+ " graus kelvin são "+fi+" fahrenheit ");
            }
            else{
                System.out.println("imposivel calcular");
            }
        }
      private static void fahrenheit(String[] args){
           System.out.println("digite a temperatura na qual deseja transformar");
           String tran = teclado.nextLine();
           System.out.println("digite a temperatura em celsios");
           Double fe = teclado.nextDouble(); 
            if (tran.equals("kelvin")) {
               Double ce = (9/fe-160)*5; 
               Double ke = (ce + 273.15);
               System.out.println(fe+ " graus fahrenheit são "+ke+" kelvin ");
            }
            else if(tran.equals("celsios")){
                Double ce = (9/fe-160)*5;
                System.out.println(fe+ " graus fahrenheit são "+ce+" celsios ");
            }
            else{
                System.out.println("imposivel calcular");
            }    
        }
    }
