import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        carro mycar = new carro(model); 
    }
}

class carro {
    private String modelo;


    public carro(String modelo) {
        this.modelo = modelo;
        System.out.println("carro criado");

    }
}