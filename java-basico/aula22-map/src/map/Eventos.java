package map;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Eventos {
  private Map<LocalDate, Evento> eventos;

  public Eventos() {
    this.eventos = new HashMap<>();
  }

  public void addEvento(LocalDate data, String nome, String atracao) {
    eventos.put(data, new Evento(nome, atracao));
  }

  public void exibirEventos() {
    Map<LocalDate, Evento> data = new TreeMap<>(eventos);
    System.out.println(data);
  }

  public void obterProximoEvento() {
    // Set<LocalDate> dataSet = eventos.keySet();
    // Collenction<Evento> values = eventos.values();
    // eventos.get():
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;

    Map<LocalDate, Evento> eventosTree = new TreeMap<>(eventos);
    for(Map.Entry<LocalDate, Evento> entry: eventosTree.entrySet()){
      if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();
        System.out.printf("O proximo event: %s acontecerá na data: %s", proximoEvento, proximaData);
        break;
      }
    }
  }

  public static void main(String[] args) {
    // Eventos eventos = new Eventos();

    // eventos.addEvento(LocalDate.of(2022, 7, 15),"evento2","atracao2");
    // eventos.addEvento(LocalDate.of(2024, Month.JUNE, 01),"evento4","fechamento");
    // eventos.addEvento(LocalDate.of(2024, 5, 30),"evento3","Haikyuu");
    // eventos.addEvento(LocalDate.of(2022, 7, 15),"evento1","atracao1");

    // // eventos.exibirEventos();

    // eventos.obterProximoEvento();
    // Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
    // System.out.println(coresDaBandeiraDoBrasil);

  List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
    System.out.println(consoantesMeuNome);

  }
}
