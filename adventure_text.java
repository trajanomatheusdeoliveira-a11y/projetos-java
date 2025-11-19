import java.util.*;
//esse é um jogo de texto criado por uma aluno do 1 ano

class Main {
   //os esencias
   static Scanner teclado = new Scanner(System.in);
   static Random gerador = new Random();
   static String item;


   //player
   static String nome;
   static int dano_player;
   static int vida_player = (gerador.nextInt(8)+1)+5; ;
   static int vida_total = vida_player;
   static int agilidade_player;


   //inimigo
   static int dano_inimigo;
   static int vida_inimigo;
   static int agilidade_inimigo;
   //salas
   static int maxSalas =10;
   static int salas_percoridas;
   //laço principal
   public static void main(String[] args) {
          // criação de personagem
           agilidade_player = (gerador.nextInt(5)+1)+5;
          System.out.println("""
                             Este \u00e9 um mundo de Magia e Grandeza, forjado sobre os escombros de um Antigo Imp\u00e9rio de poder imensur\u00e1vel.
                             A humanidade se refugia em poderosas Cidades-Reino \u2014 baluartes da civiliza\u00e7\u00e3o erguidos para resistir aos perigos da imensa Grande Mata de Amantri.
                             Esta floresta, uma cria\u00e7\u00e3o m\u00e1gica de \u00faltima esperan\u00e7a do imp\u00e9rio ca\u00eddo, guarda em suas profundezas as Ru\u00ednas e os Artefatos Antigos que sustentam a vida moderna.
                             Exploradores audazes, como você\u00ea, arriscam-se por este labirinto verde em busca de tesouros e rel\u00edquias \u2014 pois \u00e9 na heran\u00e7a do passado que reside o futuro.""");
           System.out.println("entã qual é o seu nome");
           nome = teclado.nextLine();
           System.out.println(nome+"você é mais rapido ou resistente?");
           String escolha = teclado.nextLine();
           if(escolha.equalsIgnoreCase("rapido")){
               agilidade_player = agilidade_player+5;
           }
           else if(escolha.equalsIgnoreCase("resistente")){
               vida_player = vida_player+5;
           }
          
           dano_player = dano_player+6;
           System.out.print("então vamos começar?(clique em qualquer botão)");
           teclado.nextLine();
          
           // laço pincipal
           jogo_historia(args);


         
       }
       private static void jogo_historia(String[] args) {
		
            int historia1 = gerador.nextInt(4)+1;
            int historia2 = gerador.nextInt(4)+1;
            String hist = ("");
            String hist2 = ("");
            switch(historia1) {
                case 1:
                    hist = ("eliminar os monstros de"); break;
                case 2:
                    hist = ("explorar"); break;
                case 3:
                    hist = ("explorar"); break;
                case 4:
                    hist = ("roubar"); break;
            }
            switch(historia2) {
                case 1:
                    hist2 = ("uma ruina antiga"); break;
                case 2:
                    hist2 = ("um forte abandonado"); break;
                case 3:
                    hist2 = ("um forte abandonado"); break;
                case 4:
                    hist2 = ("uma caverna misteriosa"); break;	
            }
            System.out.println("você ouve falar de uma missão para: "+hist+" "+hist2); 
            teclado.nextLine();
            System.out.println(" você chega ao local  e entra pela porta escura e mal iluminada");
            teclado.nextLine();
            //chama o jogo:
            salas(args);
        }
       //combate e monstros
       private static void combate(String[] args){
           int tipoInimigo = gerador.nextInt(4);


           String nomeInimigo = "";
           String descricao = "";


           // Define atributos conforme o inimigo
           if(salas_percoridas == maxSalas){
               nomeInimigo = "Golem (Boss)";
               vida_inimigo = 15;
               agilidade_inimigo = 10;
               dano_inimigo = 15;
               descricao = "Um colosso de pedra viva. Cada movimento faz o chão tremer, e seus olhos brilham como brasas ancestrais.";
           }
           else{
               switch (tipoInimigo) {
                   case 0 -> {
                       nomeInimigo = "Goblim";
                       vida_inimigo = 5;
                       agilidade_inimigo = 3;
                       dano_inimigo = 3;
                       descricao = "Uma criatura pequena e de olhos amarelados. Ágil, mas fraca. Ri enquanto empunha uma adaga enferrujada.";
                   }
                   case 1 -> {
                       nomeInimigo = "Esqueleto/Múmia";
                       vida_inimigo = 10;
                       agilidade_inimigo = 5;
                       dano_inimigo = 5;
                       descricao = "Um corpo seco e frágil, envolto em panos antigos. Seus ossos rangem a cada passo em direção a você.";
                   }
                   case 2 -> {
                       nomeInimigo = "Ogro";
                       vida_inimigo = 15;
                       agilidade_inimigo = 5;
                       dano_inimigo = 8;
                       descricao = "Um monstro enorme de músculos densos e olhar vazio. Sua força é brutal, mas seus movimentos são lentos.";
                   }
                   case 3 -> {
                       nomeInimigo = "Abominação";
                       vida_inimigo = gerador.nextInt(10)+1;
                       agilidade_inimigo = gerador.nextInt(10)+1;
                       dano_inimigo = gerador.nextInt(10)+1;
                       descricao = "Um amontoado grotesco de carne e ossos retorcidos. Move-se de forma disforme, com velocidade assustadora.";
                   }
               }     
           }
           // Apresentação
           System.out.println("\n Um " + nomeInimigo + " aparece!");
           teclado.nextLine();
           System.out.println(descricao);
           System.out.println("Vida: " + vida_inimigo + " | Dano: " + dano_inimigo + " | Agilidade: " + agilidade_inimigo);
           System.out.println("\nSeu HP: " + vida_player + " | Dano: " + dano_player + " | Agilidade: " + agilidade_player);


           // Loop de combate
           while (vida_player > 0 && vida_inimigo > 0) {
               // Define quem ataca primeiro
               boolean playerAtacaPrimeiro = agilidade_player >= agilidade_inimigo;


               if (playerAtacaPrimeiro) {
                   System.out.println("\nVocê ataca primeiro!");
                   vida_inimigo -= dano_player;
                   System.out.println("Você causa " + dano_player + " de dano ao " + nomeInimigo + ".");
                   if (vida_inimigo <= 0) {
                       System.out.println("\n O " + nomeInimigo + " foi derrotado!");
                       break;
                   }


                   System.out.println("O " + nomeInimigo + " ainda tem " + vida_inimigo + " de vida.");


                   // Contra-ataque
                   vida_player -= dano_inimigo;
                   System.out.println("O " + nomeInimigo + " revida e causa " + dano_inimigo + " de dano!");
                   System.out.println("Sua vida agora é: " + vida_player);
               } else {
                   System.out.println("\nO " + nomeInimigo + " é mais rápido e ataca primeiro!");
                   vida_player -= dano_inimigo;
                   System.out.println("Você sofre " + dano_inimigo + " de dano! (Vida atual: " + vida_player + ")");
                   if (vida_player <= 0) {
                       System.out.println("\n Você foi derrotado pelo " + nomeInimigo + "...");
                       teclado.nextLine();
                       break;
                   }


                   // Contra-ataque
                   vida_inimigo -= dano_player;
                   System.out.println("Você contra-ataca e causa " + dano_player + " de dano!");
                   System.out.println("O " + nomeInimigo + " agora tem " + vida_inimigo + " de vida.");
               }


               // Pausa para o próximo turno
               System.out.println("\nPressione ENTER para o próximo turno...");
               teclado.nextLine();
           }


           // Resultado final
           if (vida_player > 0 && vida_inimigo <= 0) {
               System.out.println("\n Você venceu o combate contra o " + nomeInimigo + "!");
               teclado.nextLine();
           } if (vida_player <= 0) {
               morrer();
               return; // para encerrar o combate
           }


       }
       // criação de masmora
   private  static void salas(String[] args){
       int fuga = gerador.nextInt(20);
       String act ="";
       int maxSalas = 10; // número total de salas da masmorra
       int evento = gerador.nextInt(100); // define evento (par/ímpar)
       String loot = item; // será definido depois com mais lógica


       for (int i = 1; i <= maxSalas; i++) {
           int tipo = gerador.nextInt(20); // tipo da sala (0 a 19)
           System.out.println("\n--- Sala " + i + " ---");


           switch (tipo) {
               case 0, 1, 2, 3, 4 -> { // Sala Pequena
                   System.out.println("As paredes estreitas comprimem o espaço, feitas de pedras antigas cobertas por fissuras.\n"
                                   + "O teto é baixo, sustentado por vigas desgastadas.\n"
                                   + "O chão é irregular e frio ao toque.\n"
                                   + "O ar parece imóvel, como se o tempo ali tivesse parado.");


                      
                   if (evento % 2 == 0) {
                       System.out.println("Ao entrar na sala você vê um grande baú antigo e empoeirado em seu centro, você abre?");
                       String bau = teclado.nextLine();
                       if(bau.equalsIgnoreCase("sim")){
                           if((tipo % 2)== 0){
                               gerarLoot(gerador);
                               System.out.println("Você encontrou: " + item);
                           }
                           if((tipo % 2)== 1){
                               System.out.println("você abre o bau e uma armadilha dispara \n você não cosegue regir a tempo você leva 2 de dano" );
                               vida_player -= 2;
                               if (vida_player <= 0) {
                                   morrer();
                                   return;
                               }
                           }
                           teclado.nextLine();
                       }
                   }
                   else {
                       System.out.println("você ve algo se movnedo você deseja fugir[f] ou lutar[l] ");
                       act = teclado.nextLine();
                       if(act.equalsIgnoreCase("f")){
                           if(fuga >= 10){
                               System.out.println("você foge");
                           }
                           else{
                               System.out.println("você tenta fugir mas não consegue");
                               combate(args);
                           }
                       }
                      if(act.equalsIgnoreCase("l")){
                        combate(args);
                      }
                   }
                   break;
               }
               case 5, 6, 7, 8, 9 -> { // Sala Média
                   System.out.println("O ambiente se abre um pouco mais, revelando colunas simples que sustentam o teto de pedra.\n"
                                   + "As paredes mostram sinais de antigas reformas e rachaduras profundas.\n"
                                   + "O chão, plano e gasto, denuncia muitas passagens.\n"
                                   + "O espaço transmite uma sensação de equilíbrio entre ordem e ruína.");


                   evento = gerador.nextInt(100);
                   if (evento % 2 == 0) {
                       System.out.println("Ao entrar na sala você vê um grande baú antigo e empoeirado em seu centro, você abre?");
                       String bau = teclado.nextLine();
                       if(bau.equalsIgnoreCase("sim")){
                           if((tipo % 2)== 0){
                               gerarLoot(gerador);
                               System.out.println("Você encontrou: " + item);
                           }
                           if((tipo % 2)== 1){
                               System.out.println("você abre o bau e uma armadilha dispara \n você não cosegue regir a tempo você leva 2 de dano" );
                               vida_player -= 2;
                               if (vida_player <= 0) {
                                   morrer();
                                   return;
                               }
                           }
                         teclado.nextLine(); 
                       } 
                   } else {
                       System.out.println("você ve algo se movnedo você deseja fugir[f] ou lutar[l] ");
                       act = teclado.nextLine();
                       if(act.equalsIgnoreCase("f")){
                           if(fuga >= 10){
                               System.out.println("você foge");
                           }
                           else{
                               System.out.println("você tenta fugir mas não consegue");
                               combate(args);
                           }
                       }
                      if(act.equalsIgnoreCase("l")){
                        combate(args);
                      }
                   }
                  
                   break;
               }


               case 10, 11, 12, 13, 14 -> { // Sala Grande
                   System.out.println("A estrutura imponente impressiona pela altura e pela amplitude do teto arqueado.\n"
                                   + "As paredes parecem se perder na penumbra, construídas com blocos enormes e irregulares.\n"
                                   + "O chão é liso, como se polido pelo tempo.\n"
                                   + "Há ecos que percorrem o salão, multiplicando cada som.");


                   evento = gerador.nextInt(100);
                   if (evento % 2 == 0) {
                       System.out.println("Ao entrar na sala você vê um grande baú antigo e empoeirado em seu centro, você abre?");
                       String bau = teclado.nextLine();
                       if(bau.equalsIgnoreCase("sim")){
                           if((tipo % 2)== 0){
                               gerarLoot(gerador);
                               System.out.println("Você encontrou: " + item);
                           }
                           if((tipo % 2)== 1){
                               System.out.println("você abre o bau e uma armadilha dispara \n você não cosegue regir a tempo você leva 2 de dano" );
                               vida_player -= 2;
                               if (vida_player <= 0) {
                                   morrer();
                                   return;
                               }
                           teclado.nextLine();
                           }
                       }
                   } else {
                       System.out.println("você ve algo se movnedo você deseja fugir[f] ou lutar[l] ");
                       act = teclado.nextLine();
                       if(act.equalsIgnoreCase("f")){
                           if(fuga >= 10){
                               System.out.println("você foge");
                           }
                           else{
                               System.out.println("você tenta fugir mas não consegue");
                               combate(args);
                           }
                       }
                      if(act.equalsIgnoreCase("l")){
                        combate(args);
                      }
                   }
                   break;
               }


               default -> { // Corredor
                   System.out.println("O corredor se estende em linha quase perfeita, formado por pedras alinhadas com precisão.\n"
                                   + "O teto baixo cria uma sensação de confinamento constante.\n"
                                   + "As paredes são úmidas e cobertas por marcas do tempo.\n"
                                   + "A passagem parece se alongar infinitamente diante dos olhos.");
                   teclado.nextLine();
                   break;
               }
           }
           if (salas_percoridas > 0 && salas_percoridas % 3 == 0) {
               dano_player += 1; // ganha 1 de dano a cada 3 salas
               int cura = gerador.nextInt(3) + 1; // cura aleatória de 1 a 3
               vida_player += cura;
               if (vida_player > vida_total) vida_player = vida_total; // não passa do máximo
               System.out.println("\nVocê sente-se mais experiente! (+1 dano, +" + cura + " de vida)");
           }
           salas_percoridas = salas_percoridas + 1; 
           if(salas_percoridas == maxSalas){
               System.out.println("Depois de percorrer a longa masmorra, você finalmente chega à câmara final.\nÉ um grande cômodo de pedra, onde a tensão no ar é palpável.\nNo centro, imponente e silencioso, espera o Golem.\nEste é o duelo que você deve vencer.");
               combate(args);
           } 
       }
      
   }
   public static String gerarLoot(Random r) {
       int tipoLoot = r.nextInt(6); // 0 a 5
      


       switch (tipoLoot) {
           case 0 -> {
               item = "Adaga (+2 dano)";
               dano_player += 2;
           }
           case 1 -> {
               item = "Espada Curta (+5 dano)";
               dano_player += 5;
           }
           case 2 -> {
               item = "Espada Longa (+10 dano)";
               dano_player += 10;
           }
           case 3 -> {
               item = "Clava (+15 dano, -5 agilidade)";
               dano_player += 15;
               agilidade_player -= 5;
           }
           case 4 -> {
               item = "Poção de Cura (recupera vida total)";
               vida_player = vida_total;
           }
           case 5 -> {
               item = "Poção de Agilidade (+10 agilidade)";
               agilidade_player += 10;
           }
       }


       //System.out.println(item);
       return item;
   }
   private static void morrer() {
       System.out.println("\n Você foi derrotado...");
       System.out.println("Sua jornada chega ao fim.");


       System.out.println("\nDeseja tentar novamente? (sim/não)");
       String escolha = teclado.nextLine();


       if (escolha.equalsIgnoreCase("sim")) {
           // Reinicia o jogo
           vida_player = 10;
           agilidade_player = 5;
           dano_player = 5;
           System.out.println("\nReiniciando sua aventura...");
           main(new String[]{}); // recomeça o jogo
       } else {
           System.out.println("Fim de jogo. Obrigado por jogar!");
           System.exit(0); // encerra o programa
       }
   }
}
