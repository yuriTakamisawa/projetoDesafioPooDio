package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Java fundamentals");
        curso1.setCarhaHoraria(80);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Boas vindas");
        mentoria1.setCargaHoraria(2);
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devYuri = new Dev();
        devYuri.setNome("Yuri");
        devYuri.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos: "+devYuri.getConteudosInscritos());
        devYuri.progredir();
        System.out.println("-----");
        System.out.println("Conteudos concluidos: "+devYuri.getConteudosConcluidos());
        System.out.println("XP: "+ devYuri.calcularTotalXp());


        System.out.println("----------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-----");
        System.out.println("Conteudos concluidos: "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }
}
