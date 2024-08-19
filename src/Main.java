import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        // Instanciando o curso
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);
        // System.out.println(curso1);

        Curso curso2 = new Curso();

        curso2.setTitulo("Js");
        curso2.setDescricao("Descricao curso Js");
        curso2.setCargaHoraria(4);
        // System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descricao Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // DEV ARMANDO
        Dev devArmando = new Dev();
        devArmando.setNome("Armando");
        devArmando.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devArmando.getConteudosInscritos());
        devArmando.progredir();
        System.out.println("Conteudos concluidos: " + devArmando.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + devArmando.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devArmando.getConteudosConcluidos());
        devArmando.progredir();
        System.out.println("XP " + devArmando.calcularTotalXp());


        /*
         * System.out.println("Encapsulamento e abstração");
         * System.out.println("Teste");
         */
    }
}
