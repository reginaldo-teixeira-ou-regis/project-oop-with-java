package br.edu.dio.challenge.domain;

public class Course extends Content {
  private int hoursOfStudy;

  @Override
  public double calculateXp() {
    return XP_STANDARD * hoursOfStudy;
  }

  public int getHoursOfStudy() {
    return hoursOfStudy;
  }

  public void setHoursOfStudy(int hoursOfStudy) {
    this.hoursOfStudy = hoursOfStudy;
  }

  @Override
  public String toString() {
    return "Curso{" +
        "titulo='" + getTitle() + '\'' +
        ", descricao='" + getDescription() + '\'' +
        ", cargaHoraria=" + hoursOfStudy +
        '}';
  }
}
