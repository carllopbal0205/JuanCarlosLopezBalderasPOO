import java.util.Scanner;
public class Operaciones{
    //Atributos

    public double a;
    public double b;

    public double sumarNumeros(){
        return a + b;
    }
    public double restarNumeros(){
        return a - b;
    }

    public double divirNumeros(){
        return a / b;
    }

    public double multiplicarNumeros(){
        return a * b;
    }

    //Metodos

    public static void main(String[]args){
        Operaciones operaciones1 = new Operaciones();
        Scanner scanner = new scanner(System.in);
        System.out.println("Numero 1: ")
        operaciones1.a = scanner.nexDouble();
        System.out.println("Numero 2: ")
        operaciones1.a = scanner.nexDouble();
        System.out.println("Numero 3: ")
        operaciones1.a = scanner.nexDouble();

        operaciones1.b = 20.2;
        
        long suma = operaciones1.sumaNumeros();
        System.out.println("El resultado es: " +suma);
    }
}