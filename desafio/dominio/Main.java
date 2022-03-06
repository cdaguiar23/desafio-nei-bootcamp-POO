package desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição Curso Python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devClaudionei = new Dev();
        devClaudionei.setNome("Claudionei");
        devClaudionei.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Claudionei" + devClaudionei.getConteudosInscritos());
        devClaudionei.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Claudionei" + devClaudionei.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Claudionei" + devClaudionei.getConteudosConcluidos());
        System.out.println("XP: " + devClaudionei.calcularTotalXP());

        System.out.println("------------------------");

        Dev devMarcia = new Dev();
        devMarcia.setNome("Marcia");
        devMarcia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Márcia" + devMarcia.getConteudosInscritos());
        devMarcia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Márcia" + devMarcia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Márcia" + devMarcia.getConteudosConcluidos());
        System.out.println("XP: " + devMarcia.calcularTotalXP());

    }
}
