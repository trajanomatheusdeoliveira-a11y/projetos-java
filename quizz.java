import java.util.*;

class Main {

    static String pergunta = "";
    static String resposta_correta = "";
    static int corretas ;
    static String retorno[] = new String[31];
    static int sequencia ;
    static int pontos ;
    
    public static void main(String[] args) {
        //vou ir colacando uns comentarios n meio p explicar cada coisa
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hello world!");
        // o for é usado p repetição e depois reusado p o switch
        for (int i = 1; i < 31; i++) {
            switch(i) {
                case 1:
                    pergunta = "Qual foi a primeira nação a desenvolver foguetes no século III a.C.? \n a) China \n b) Grécia \n c) Egito \n d) Índia \n e) Roma";
                    resposta_correta = "a";
                    break;
                case 2:
                    pergunta = "Quem escreveu o livro 'A Exploração do Espaço Cósmico por Meio de Dispositivos de Reação'? \n a) Isaac Newton \n b) Stephen Hawking \n c) Robert Goddard \n d) Konstantin Tsiolkovsky \n e) Carl Sagan";
                    resposta_correta = "d";
                    break;
                case 3:
                    pergunta = "Quem foi que criou o primeiro telescópio? \n a) Isaac Newton \n b) Galileu Galilei \n c) Hans Lippershey \n d) Copérnico \n e) Kepler";
                    resposta_correta = "c";
                    break;
                case 4:
                    pergunta = "Qual livro de ficção foi responsável pela ambição de ir à Lua? \n a) A Máquina do Tempo \n b) Da Terra à Lua \n c) Viagem ao Centro da Terra \n d) 1984 \n e) Fundação";
                    resposta_correta = "b";
                    break;
                case 5:
                    pergunta = "Quem criou o primeiro foguete movido a combustível líquido? \n a) Wernher von Braun \n b) Nikola Tesla \n c) Robert Goddard \n d) Yuri Gagarin \n e) Tsiolkovsky";
                    resposta_correta = "c";
                    break;
                case 6:
                    pergunta = "Com base em qual lei da física foguetes funcionam? \n a) Lei da gravidade \n b) Lei da entropia \n c) Terceira Lei de Newton \n d) Lei de Coulomb \n e) Lei da Inércia";
                    resposta_correta = "c";
                    break;
                case 7:
                    pergunta = "Qual foi o primeiro foguete a passar a Linha de Kármán (100 km)? \n a) Apollo 11 \n b) Saturn V \n c) V-2 \n d) Explorer 1 \n e) Sputnik 1";
                    resposta_correta = "c";
                    break;
                case 8:
                    pergunta = "Qual foi a nação que criou o V-2? \n a) EUA \n b) Alemanha \n c) Rússia \n d) Japão \n e) França";
                    resposta_correta = "b";
                    break;
                case 9:
                    pergunta = "Quem foi Hermann Oberth? \n a) Um astronauta russo \n b) Um engenheiro da NASA \n c) Um cientista pioneiro em foguetes \n d) Um piloto da Luftwaffe \n e) Um físico americano";
                    resposta_correta = "c";
                    break;
                case 10:
                    pergunta = "A quem pertence a frase 'É difícil dizer o que é impossível, pois o sonho de ontem é a esperança de hoje e a realidade de amanhã.'? \n a) Einstein \n b) Tsiolkovsky \n c) Robert Goddard \n d) Von Braun \n e) Hawking";
                    resposta_correta = "c";
                    break;
                case 11:
                    pergunta = "Quais eram os países envolvidos na Guerra Fria? \n a) EUA e URSS \n b) China e Japão \n c) França e Alemanha \n d) EUA e China \n e) Inglaterra e França";
                    resposta_correta = "a";
                    break;
                case 12:
                    pergunta = "Qual nação iniciou na frente da corrida espacial? \n a) EUA \n b) Alemanha \n c) União Soviética \n d) França \n e) Japão";
                    resposta_correta = "c";
                    break;
                case 13:
                    pergunta = "Qual foi o primeiro satélite lançado? \n a) Explorer 1 \n b) Sputnik 1 \n c) Luna 2 \n d) Soyuz 1 \n e) Vostok 1";
                    resposta_correta = "b";
                    break;
                case 14:
                    pergunta = "O que foi o Explorer 1? \n a) O primeiro foguete americano \n b) O primeiro satélite americano \n c) Um foguete soviético \n d) Uma nave lunar \n e) Um observatório espacial";
                    resposta_correta = "b";
                    break;
                case 15:
                    pergunta = "Qual era o nome do primeiro animal a viajar para o espaço? \n a) Belka \n b) Strelka \n c) Laika \n d) Yuri \n e) Sput";
                    resposta_correta = "c";
                    break;
                case 16:
                    pergunta = "Qual foi o primeiro humano que viajou para o espaço? \n a) Neil Armstrong \n b) Yuri Gagarin \n c) John Glenn \n d) Buzz Aldrin \n e) Alan Shepard";
                    resposta_correta = "b";
                    break;
                case 17:
                    pergunta = "Qual era o objeto que as potências queriam alcançar até o fim da década? \n a) Marte \n b) Lua \n c) Vênus \n d) Júpiter \n e) Órbita Terrestre";
                    resposta_correta = "b";
                    break;
                case 18:
                    pergunta = "Qual foi o nome da missão soviética que chegou a Vênus? \n a) Soyuz \n b) Sputnik \n c) Venera \n d) Luna \n e) Mir";
                    resposta_correta = "c";
                    break;
                case 19:
                    pergunta = "Qual foi a primeira estação espacial? \n a) Skylab \n b) ISS \n c) Mir \n d) Salyut 1 \n e) Tiangong";
                    resposta_correta = "d";
                    break;
                case 20:
                    pergunta = "Quem venceu a Guerra Fria? \n a) EUA \n b) URSS \n c) China \n d) Nenhum \n e) ONU";
                    resposta_correta = "a";
                    break;
                case 21:
                    pergunta = "O que foi o desastre da Challenger? \n a) Uma colisão espacial \n b) Uma explosão de ônibus espacial \n c) Um erro de cálculo de órbita \n d) Um acidente com satélite \n e) Um incêndio na base";
                    resposta_correta = "b";
                    break;
                case 22:
                    pergunta = "O que é a ISS? \n a) Um satélite militar \n b) Uma estação espacial internacional \n c) Um telescópio \n d) Uma nave de carga \n e) Um foguete";
                    resposta_correta = "b";
                    break;
                case 23:
                    pergunta = "Quais são as duas maiores empresas espaciais privadas atuais? \n a) Virgin e Boeing \n b) SpaceX e Blue Origin \n c) Lockheed e NASA \n d) ESA e JAXA \n e) RocketLab e Airbus";
                    resposta_correta = "b";
                    break;
                case 24:
                    pergunta = "Qual é o maior foguete da atualidade? \n a) Saturn V \n b) Falcon Heavy \n c) Starship \n d) SLS \n e) Ariane 6";
                    resposta_correta = "c";
                    break;
                case 25:
                    pergunta = "Quais são os dois países que estão crescendo na exploração espacial? \n a) Rússia e EUA \n b) China e Índia \n c) Japão e França \n d) Coreia e Brasil \n e) Alemanha e Itália";
                    resposta_correta = "b";
                    break;
                case 26:
                    pergunta = "Qual é o maior programa espacial sul-americano? \n a) SABIA-Mar \n b) Amazônia-1 \n c) Cbers \n d) CONAE \n e) Cruzeiro do Sul";
                    resposta_correta = "c";
                    break;
                case 27:
                    pergunta = "Qual é o nome da estação espacial chinesa? \n a) Tiangong \n b) Shenzhou \n c) Chang'e \n d) Long March \n e) Jade Rabbit";
                    resposta_correta = "a";
                    break;
                case 28:
                    pergunta = "Qual é o novo programa da NASA que busca levar humanos de volta à Lua? \n a) Orion \n b) Artemis \n c) Apollo II \n d) Nova Era \n e) Moonrise";
                    resposta_correta = "b";
                    break;
                case 29:
                    pergunta = "Qual foguete levará humanos de volta à Lua? \n a) SLS \n b) Starship \n c) Falcon Heavy \n d) Saturn V \n e) Ariane 6";
                    resposta_correta = "a";
                    break;
                case 30:
                    pergunta = "Qual é o nome do próximo foguete brasileiro? \n a) VLM-1 \n b) VSB-30 \n c) Cruzeiro \n d) Santos Dumont I \n e) Atlântico";
                    resposta_correta = "a";
                    break;
            }
            //isso Deveria fazer a pergunta obs:tomara q funcione
            System.out.println("\nPergunta " + i + ":");
            System.out.println(pergunta);
            String tentativa = teclado.nextLine();


            if (tentativa.equalsIgnoreCase(resposta_correta)) {
                System.out.println("CORRETO!!!");
                corretas = corretas+1;
                retorno[i] = "CORRETO!!!";
                sequencia = sequencia +1;
                pontos = pontos + 10;
            }
            else {
                System.out.println("ERRADO!!!");
                retorno[i] = "ERRADO!!!";
                sequencia = 0;
               }
                //p contar os pontos extras
            if (sequencia == 3) {
                pontos = pontos + 100;
                sequencia = 0;
            }
            }
            //aqui vai sair a resposta final
            System.out.println("Você acertou " + corretas + " de 30 perguntas.");
            System.out.println("Pontuação total: " + pontos);
            for (int y = 0; y < 31; y++) {
                if (retorno[y] != null) { // só imprime se houver resposta
                    System.out.println("Pergunta " + y  + ": " + retorno[y]);
                }
            }

            if (pontos <= 50) {
                System.out.println("seus conhecimentos: Perdido");
            } 
            else if (pontos <= 150) {
                System.out.println("seus conhecimentos: Iniciante");
            }  
            else if (pontos <= 250) {
                System.out.println("seus conhecimentos: Experiente");
            }  
            else {
            System.out.println("seus conhecimentos: mestre");
            }
        }
    }
