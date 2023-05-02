package br.edu.dio.challenge.domain;

import java.util.*;

public class Dev {
  private String name;
  private Set<Content> subscribedContent = new LinkedHashSet<>();
  private Set<Content> concludedContents = new LinkedHashSet<>();

  public void registerBootcamp(Bootcamp bootcamp) {
    this.subscribedContent.addAll(bootcamp.getContents());
    bootcamp.getSubscribedDevs().add(this);
  }

  public void toProgressInTheBootcamp() {
    Optional<Content> content = this.subscribedContent.stream().findFirst();
    if (content.isPresent()) {
      this.concludedContents.add(content.get());
      this.subscribedContent.remove(content.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo!");
    }
  }

  public double calculateTotalXp() {
    Iterator<Content> iterator = this.concludedContents.iterator();
    double sum = 0;
    while (iterator.hasNext()) {
      double next = iterator.next().calculateXp();
      sum += next;
    }
    return sum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Content> getSubscribedContent() {
    return subscribedContent;
  }

  public void setSubscribedContent(Set<Content> subscribedContent) {
    this.subscribedContent = subscribedContent;
  }

  public Set<Content> getConcludedContents() {
    return concludedContents;
  }

  public void setConcludedContents(Set<Content> concludedContents) {
    this.concludedContents = concludedContents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Dev dev = (Dev) o;
    return Objects.equals(name, dev.name)
        && Objects.equals(subscribedContent, dev.subscribedContent)
        && Objects.equals(concludedContents, dev.concludedContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subscribedContent, concludedContents);
  }
}
