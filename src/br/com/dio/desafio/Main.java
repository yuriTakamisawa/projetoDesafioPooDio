package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
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
    }
}
