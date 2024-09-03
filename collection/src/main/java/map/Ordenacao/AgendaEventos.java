package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	Map<LocalDate, Evento> eventos;
	
	public AgendaEventos() {
		this.eventos = new Hashtable();
	}
	
	public static void main(String[] args) {
		AgendaEventos agenda = new AgendaEventos();
		agenda.adicionarEvento(LocalDate.of(2022, 5, 12), "Veron", "La Grand Comemoration");
		agenda.adicionarEvento(LocalDate.of(2024, Month.MAY, 14), "Tzmaut", "A festa de independência");
		agenda.adicionarEvento(LocalDate.of(2024, 9, 7), "Independência", "201 anos de independência");
		agenda.exibirAgenda();
		agenda.obterProximoEvento();
	}
	
	public void adicionarEvento(LocalDate date, String nome, String atracao) {
		eventos.put(date, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap(eventos);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		Evento proximoEvento = null;
		LocalDate dateNow = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap(eventos);
		if(!eventos.isEmpty()) {
			for(Map.Entry<LocalDate, Evento> entry: eventos.entrySet()) {
				if(entry.getKey().isEqual(dateNow) || entry.getKey().isAfter(dateNow)) {
					System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
					break;
				}
			}
		} else {
			System.out.println("Não há eventos registrados!");
			return;
		}
		
		System.out.println(proximoEvento);
	}
}
