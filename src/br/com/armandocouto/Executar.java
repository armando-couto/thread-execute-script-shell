package br.com.armandocouto;

import java.io.IOException;

public class Executar {

  public static void main(String[] args) {
    while (true) {
      try {
        ProcessBuilder pb = new ProcessBuilder(args[0]);
        pb.start();
        Thread.sleep(60000); // 1 minuto
      } catch (IOException e) {
        e.printStackTrace();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
