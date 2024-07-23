import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pergunta pergunta1 = new Pergunta("O que é Java", 1);
        Pergunta pergunta2 = new Pergunta("O que é a máquina virtual Java (JVM)", 2);
        Pergunta pergunta3 = new Pergunta("O que é um Objeto", 3);
        Pergunta pergunta4 = new Pergunta("O que é uma Classe", 4);
        Map<Integer, String> respostasJava = new HashMap<>();
        respostasJava.put(1, "É uma linguagem de programação orientada a objetos independente de plataforma");
        respostasJava.put(2, "É uma maquina virtual que executa o bytecode java ");
        respostasJava.put(3, "É instância de uma Classe");
        respostasJava.put(4, "É o modelo que a partir dele é criado um objeto");



        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        CursoTeste testeJavaCamila = new CursoTeste();
       int respostaCamila = 1;
        testeJavaCamila.exibirTeste(pergunta1, respostasJava);
        testeJavaCamila.recebeResposta(respostaCamila, pergunta1);
        System.out.println("Resposta:" + respostaCamila);
        if(testeJavaCamila.isAprovado()){
            devCamila.progredir();

        }

        CursoTeste testeJavaCamila2 = new CursoTeste();
        int respostaCamila2 = 3;
        testeJavaCamila2.exibirTeste(pergunta3, respostasJava);
        testeJavaCamila2.recebeResposta(respostaCamila2, pergunta3);
        System.out.println("Resposta:" + respostaCamila2);
        if(testeJavaCamila2.isAprovado()){
            devCamila.progredir();

        }

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        CursoTeste testeJavaJoao = new CursoTeste();
        int respostaJoao = 2;
        testeJavaJoao.exibirTeste(pergunta2, respostasJava);
        testeJavaJoao.recebeResposta(respostaJoao, pergunta2);
        System.out.println("Resposta:" + respostaJoao);
        if(testeJavaJoao.isAprovado()){
            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();
        }

        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
