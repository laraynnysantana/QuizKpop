public abstract class Pergunta {
    protected String questao;
    protected int pontuacao;

    public String getQuestao() {
        return questao;
    }

    public void Questao(String questao) {
        this.questao = questao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void Pontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Pergunta(String questao, int pontuacao) {
        this.questao = questao;
        this.pontuacao = pontuacao;

    }


    public abstract void exibirPergunta();


    public abstract boolean validarResposta(String resposta);
}
