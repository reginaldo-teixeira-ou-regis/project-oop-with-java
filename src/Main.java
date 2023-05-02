import br.edu.dio.challenge.domain.Bootcamp;
import br.edu.dio.challenge.domain.Course;
import br.edu.dio.challenge.domain.Dev;
import br.edu.dio.challenge.domain.Mentoring;
import br.edu.dio.challenge.domain.DevPrint;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Course course1 = new Course();
    course1.setTitle("curso java");
    course1.setDescription("descrição curso java");
    course1.setHoursOfStudy(8);

    Course course2 = new Course();
    course2.setTitle("curso js");
    course2.setDescription("descrição curso js");
    course2.setHoursOfStudy(4);

    Mentoring mentoring = new Mentoring();
    mentoring.setTitle("mentoria de java");
    mentoring.setDescription("descrição mentoria java");
    mentoring.setDate(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setName("Bootcamp Java Developer");
    bootcamp.setDescription("Descrição Bootcamp Java Developer");
    bootcamp.getContents().add(course1);
    bootcamp.getContents().add(course2);
    bootcamp.getContents().add(mentoring);

    System.out.println("\n--------------Desenvolvedor(a)01--------------\n");
    Dev devReginaldoTeixeira = new Dev();
    devReginaldoTeixeira.setName("Reginaldo Teixeira");
    DevPrint.printDevInformation(devReginaldoTeixeira);
    devReginaldoTeixeira.registerBootcamp(bootcamp);
    System.out.println("\n------------------------------------------\n");
    System.out.println("Depois de inscrito no Bootcamp:\n");
    DevPrint.printDevInformation(devReginaldoTeixeira);
    devReginaldoTeixeira.toProgressInTheBootcamp();
    System.out.println("\n------------------------------------------\n");
    System.out.println("Depois de concluir o 1° curso:\n");
    DevPrint.printDevInformation(devReginaldoTeixeira);
    devReginaldoTeixeira.toProgressInTheBootcamp();
    System.out.println("\n------------------------------------------\n");
    System.out.println("Depois de concluir o 2° curso:\n");
    DevPrint.printDevInformation(devReginaldoTeixeira);

    System.out.println("\n--------------Desenvolvedor(a)02--------------\n");
    Dev devAnaJulia = new Dev();
    devAnaJulia.setName("Ana Julia");
    DevPrint.printDevInformation(devAnaJulia);
    devAnaJulia.registerBootcamp(bootcamp);
    System.out.println("\n------------------------------------------\n");
    System.out.println("Depois de inscrito no Bootcamp:\n");
    DevPrint.printDevInformation(devAnaJulia);
    devAnaJulia.toProgressInTheBootcamp();
    devAnaJulia.toProgressInTheBootcamp();
    devAnaJulia.toProgressInTheBootcamp();
    System.out.println("\n------------------------------------------\n");
    System.out.println("Depois de concluir o 3° curso:\n");
    DevPrint.printDevInformation(devAnaJulia);
  }
}