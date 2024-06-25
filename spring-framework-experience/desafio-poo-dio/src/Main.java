import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(10);

        mentoria1.setTitulo("Mentória de Java");
        mentoria1.setDescricao("Mentória com foco em Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1.toString());
        System.out.println(mentoria1.toString());
    }
}
