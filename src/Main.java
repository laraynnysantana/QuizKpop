import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacaoTotal = 0;


        Pergunta[] perguntas = new Pergunta[3];


        perguntas[0] = new MultiplaEscolha(
                "Qual grupo de K-pop lançou o sucesso 'Dynamite'?",
                15,
                new String[]{"A) EXO", "B) BTS", "C) Stray Kids"},
                "B"
        );

        perguntas[1] = new MultiplaEscolha(
                "Qual grupo feminino é famoso pelo hit 'DDU-DU DDU-DU'?",
                10,
                new String[]{"A) TWICE", "B) Red Velvet", "C) BLACKPINK"},
                "C"
        );

        perguntas[2] = new MultiplaEscolha(
                "Qual é o nome oficial do fandom do grupo TWICE?",
                15,
                new String[]{"A) ONCE", "B) BLINK", "C) ARMY"},
                "A"
        );

        IO.println("=== QUIZ K-POP ===");



        for (Pergunta pt : perguntas) {
            pt.exibirPergunta();
            IO.println("Sua resposta (digite a letra): ");


            String resposta = scanner.nextLine();

            if (pt.validarResposta(resposta)) {
                IO.println("-> Correto! Você ganhou " + pt.getPontuacao() + " pontos.");
                pontuacaoTotal += pt.getPontuacao();
            } else {
                IO.println("-> Resposta incorreta!");
            }

        }
        if (pontuacaoTotal >= 30) {
            IO.println("VITÓRIA! Você atingiu a meta.");
        } else {
            IO.println("DERROTA! Você não atingiu a meta.");
        }

        IO.println("\n=========================");
        IO.println("FIM DO JOGO!");
        IO.println("Sua pontuação final: " + pontuacaoTotal + " pontos!");
        IO.println("=========================");

        scanner.close();
    }
}