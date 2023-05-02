package br.edu.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
  private LocalDate date;

  @Override
  public double calculateXp() {
    return XP_STANDARD + 20d;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Mentoria{" +
        "titulo='" + getTitle() + '\'' +
        ", descricao='" + getDescription() + '\'' +
        ", data=" + date +
        '}';
  }
}
