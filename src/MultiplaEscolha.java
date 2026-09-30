public class MultiplaEscolha extends Pergunta {

    private String[] opcoes;
    private String respostaCorreta;


    public MultiplaEscolha(String questao, int pontuacao, String[] opcoes, String respostaCorreta) {
        super(questao, pontuacao);
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }


    @Override
    public void exibirPergunta() {
        IO.println("\n" + getQuestao() + " (" + getPontuacao() + " )");
        for (String opcao : opcoes) {
            IO.println(opcao);
        }
    }


    @Override
    public boolean validarResposta(String resposta) {
        return this.respostaCorreta.equalsIgnoreCase(resposta.trim());
    }
}