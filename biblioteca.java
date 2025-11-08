
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        final int MAX = 50;
        String[] titulo = new String[MAX];
        String[] autor = new String[MAX];
        String[] genero = new String[MAX];
        int totallivros = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("=================================");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Exibir todos os livros");
            System.out.println("3. Procurar livro pelo nome");
            System.out.println("4. slvar/logar livros");
            System.out.println("5. Sair");
            System.out.println("=================================");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    if (totallivros < MAX) {
                        System.out.println("titulo do livro: ");
                        titulo[totallivros] = scanner.nextLine();
                        System.out.println("autor do livro: ");
                        autor[totallivros] = scanner.nextLine();
                        System.out.println("genero: ");
                        genero[totallivros] = scanner.nextLine();  

                        totallivros++;
                        System.out.println("Produto cadastrado com sucesso!");
                    } 
                    else {
                        System.out.println("Não é possível cadastrar mais produtos. Estoque cheio.");
                    }
                    break;

                case 2:
                    if (totallivros == 0) {
                        System.out.println("Não há livros cadastrados.");
                    } 
                    else {
                        System.out.println("+---------------------------+---------------------------+---------------------------+");
                        System.out.printf("| %-25s | %-25s | %-25s |\n", "titulo", "Autor", "genero");
                        System.out.println("+---------------------------+---------------------------+---------------------------+");
                        for (int i = 0; i < totallivros; i++) {
                            System.out.printf("| %-25s | %-25s | %-25s |\n", titulo[i], autor[i], genero[i]);
                        }

                        System.out.println("+---------------------------+---------------------------+---------------------------+");
                                        }
                    break;

                case 3:             
                    System.out.print("Digite o nome do livro: ");
                    String nomeProcurado = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < totallivros; i++) {
                        if (titulo[i].equalsIgnoreCase(nomeProcurado)) {
                            System.out.println("livro encontrado: " + titulo[i] + ", autor: " + autor[i] + ", genero: " + genero[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do produto para atualizar a quantidade: ");
                    String produtoParaAtualizar = scanner.nextLine();
                    boolean produtoAtualizado = false;

                    for (int i = 0; i < totallivros; i++) {
                        if (titulo[i].equalsIgnoreCase(produtoParaAtualizar)) {
                            System.out.print("Nova quantidade: ");
                            autor[i] = scanner.nextLine();
                            scanner.nextLine();  
                            System.out.println("Quantidade atualizada com sucesso!");
                            produtoAtualizado = true;
                            break;
                        }
                    }

                    if (!produtoAtualizado) {
                        System.out.println("Produto não encontrado para atualização.");
                    }
                    break;

                case 5:

                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
