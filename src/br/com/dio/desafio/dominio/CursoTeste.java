package br.com.dio.desafio.dominio;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CursoTeste {

    Map<Integer, Questao> perguntas = new HashMap<>();
    Map<Integer, String> respostas = new HashMap<>();

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    private boolean aprovado;

    public void recebeResposta(Integer codigoResposta, Questao questao) {
        this.aprovado = questao.getRespostaCorreta().equals(codigoResposta);
    }

    public void exibirTeste(Questao pergunta, Map<Integer, String> respostas) {
        System.out.println("==========");
        System.out.println(pergunta.getPergunta());
        respostas.values().forEach(System.out::println);
        System.out.println("Informe a sua opção de resposta");
    }


}

