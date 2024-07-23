package br.com.dio.desafio.dominio;

import java.util.Map;

public class CursoTeste {

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    private boolean aprovado;

    public void recebeResposta(Integer codigoResposta, Pergunta questao) {
        this.aprovado = questao.getRespostaCorreta().equals(codigoResposta);
    }

    public void exibirTeste(Pergunta pergunta, Map<Integer, String> respostas) {
        System.out.println("==========");
        System.out.println(pergunta.getPergunta());
        respostas.values().forEach(System.out::println);
        System.out.println("Informe a sua opção de resposta");
    }


}

