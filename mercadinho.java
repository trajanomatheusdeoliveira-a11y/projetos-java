import java.util.*;
import java.io.*;



class Main{
    
	public static void main(String[] args) {
		
		ArrayList<String> produtos_nome = new ArrayList<>();
        ArrayList<Integer> produtos_valor = new ArrayList<>();
        ArrayList<Integer> produtos_qnt = new ArrayList<>();

        
		Scanner teclado = new Scanner(System.in);
		
		String nome_produto;
		int qnt_produto;
		int subtotal = 0;
		int valor_produto;
        int n = 1;
        while (n>0) {

    		System.out.println("===== MERCADINHO DO JOÃO =====");
    		System.out.println("1 - Adicionar produto");
    		System.out.println("2 - Mostrar total da compra");
    		System.out.println("3 - listar produtos");
    		System.out.println("4 - Sair");
    		System.out.println("==============================");
    		int act = teclado.nextInt();
    		
            switch (act) {
                case 1:
                	System.out.println("digite o nome do produto");
                	nome_produto = teclado.nextLine();
                    nome_produto = teclado.nextLine();  
                    produtos_nome.add(nome_produto);
                    System.out.println("digite o valor do produto");
                    valor_produto = teclado.nextInt(); 
                    produtos_valor.add(valor_produto);
                    System.out.println("digite a quantidade do produto");
                    qnt_produto = teclado.nextInt(); 
                    produtos_qnt.add(qnt_produto);

                    
                    if(qnt_produto==3) {
                    	subtotal = subtotal + valor_produto*(qnt_produto-1);
                    }
                    if(qnt_produto >= 5) {
                    	int desconto = (valor_produto/100)*10;
                    	subtotal = subtotal+ (valor_produto*qnt_produto) - desconto;
                    }
                    else {
                    	subtotal = subtotal +(valor_produto*qnt_produto);
                    }
                    break;
                  
                case 2:
                	System.out.println(subtotal);
                    break;
                case 3:

                    System.out.println("+------------+------------+------------+");
                    System.out.printf("| %-10s | %-10s | %-10s |\n", "Produto", "Valor", "Quantidade");
                    System.out.println("+------------+------------+------------+");

                    for (int i = 0; i < produtos_nome.size(); i++) {
                        System.out.printf("| %-10s | R$ %-7d | %-10d |\n",
                            produtos_nome.get(i),
                            produtos_valor.get(i),
                            produtos_qnt.get(i));
                    }
                    System.out.println("+------------+------------+------------+");
                    System.out.println("você quer salvar a lista?");
                    String acti = teclado.nextLine();
                    acti = teclado.nextLine();
                    if(acti.equalsIgnoreCase("sim")){
                    try {
                        FileWriter escritor = new FileWriter("C:\\Users\\Computador\\Desktop\\dados.txt", true);
                        escritor.write("+------------+------------+------------+\n");
                        escritor.write(String.format("| %-10s | %-10s | %-10s |\n", "Produto", "Valor", "Quantidade"));
                        escritor.write("+------------+------------+------------+\n");
                        
                        for (int i = 0; i < produtos_nome.size(); i++) {
                            escritor.write(String.format("| %-10s | R$ %-7d | %-10d |\n",
                                produtos_nome.get(i),
                                produtos_valor.get(i),
                                produtos_qnt.get(i)));
                        }
                        
                        escritor.write("+------------+------------+------------+\n");
                        escritor.write("\n");
                        escritor.close();
                        System.out.println("Arquivo salvo na área de trabalho!");
                    } catch (IOException e) {
                        System.out.println("Erro ao salvar o arquivo.");
                    }
                    break; 
                } else {
                    break;  
                }
                    
                case 4:
                    n = (n-2);
                    break;  
                    
                default:
                    System.out.println("erro");
            }
        }   
        teclado.close();
	}
}