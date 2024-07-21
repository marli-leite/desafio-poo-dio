package br.com.dio.desafio.dominio;

public class Questao {

    private String pergunta;
    private Integer respostaCorreta;

    public Questao (String pergunta, Integer respostaCorreta){
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;

    }
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public Integer getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(Integer respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }
}
