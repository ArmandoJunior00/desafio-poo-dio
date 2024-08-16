import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        // Instanciando o curso
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();

        curso2.setTitulo("Js");
        curso2.setDescricao("Descricao curso Js");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria js");
        mentoria2.setDescricao("descricao mentoria js");
        mentoria2.setData(LocalDate.now());
        System.out.println(mentoria2);

        System.out.println("Encapsulamento e abstração");
    }
}
