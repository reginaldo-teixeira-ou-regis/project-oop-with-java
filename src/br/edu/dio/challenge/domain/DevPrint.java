package br.edu.dio.challenge.domain;

import java.util.ArrayList;

public class DevPrint {
  public static void printDevInformation(Dev dev) {
    ArrayList<Content> subscribedContent = new ArrayList<>(
        dev.getSubscribedContent());
    ArrayList<Content> concludedContents = new ArrayList<>(
        dev.getConcludedContents());

    if (subscribedContent.isEmpty() && concludedContents.isEmpty()) {
      System.out.println(dev.getName() + " não se inscreveu no Bootcamp.");
    }

    if (subscribedContent.isEmpty() && !concludedContents.isEmpty()) {
      System.out.println(dev.getName() + " concluiu o Bootcamp.");

      System.out.println(" ");
    }

    if (!subscribedContent.isEmpty()) {
      System.out.println("Conteúdos Inscritos de " + dev.getName() + ":\n");
      for (Content content : dev.getSubscribedContent()) {
        System.out.println(content);
      }

      System.out.println(" ");
    }

    if (concludedContents.isEmpty() && !subscribedContent.isEmpty()) {
      System.out.println(dev.getName()
          + " não concluiu nenhum curso até o momento.\n");
    }

    if (!concludedContents.isEmpty()) {
      System.out.println("Conteúdos Concluídos de " + dev.getName() + ":\n");
      for (Content content : dev.getConcludedContents()) {
        System.out.println(content);
      }

      System.out.println(" ");
   
      System.out.printf(
          "XP de %s: %.2f\n", dev.getName(), dev.calculateTotalXp());

      System.out.println(" ");
    }
  }
}
