public abstract class Pergunta {
    protected String questao;
    protected int pontuacao;

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Pergunta(String questao, int pontuacao) {
        this.questao = questao;
        this.pontuacao = pontuacao;

    }

    // 1. Exibe a pergunta e as alternativas no console
    public abstract void exibirPergunta();

    // 2. Compara a resposta digitada com a resposta correta
    public abstract boolean validarResposta(String resposta);
}
