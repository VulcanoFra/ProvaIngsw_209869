package it.unical.demacs.ProvaIntermedia_28_10_2021;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil util;
	
	private DateTime tempo = new DateTime();
	
	@BeforeClass
	public static void init() {
		System.out.println("Prima di tutto");
		util = new MyListUtil();
	}
	
	@Before
	public void prepareTest() {
		System.out.println(tempo);
	}
	
	@After
	public void dopoTest() {
		System.out.println(tempo);
	}
	
	@Test
	public void ordinamentoCrescenteTest() {
		System.out.println("Testando la funzionalità crescente");
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(4);
		lista.add(3);
		lista.add(2);
		
		util.sort(lista, 0);
		
		List<Integer> ordinata = new ArrayList<Integer>();
		ordinata.add(2);
		ordinata.add(3);
		ordinata.add(4);
		ordinata.add(5);
		
		boolean verificata = true;
		for(int i = 0 ; i < lista.size() ; ++i) {
			if(lista.get(i) != ordinata.get(i))
				verificata = false;
		}
		assertTrue(verificata);
	}
	
	@Test
	public void ordinamentoDecrescenteTest() {
		System.out.println("Testando la funzionalità decrescente");

		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		util.sort(lista, 1);
		
		List<Integer> ordinata = new ArrayList<Integer>();
		ordinata.add(5);
		ordinata.add(4);
		ordinata.add(3);
		ordinata.add(2);
		
		boolean verificata = true;
		for(int i = 0 ; i < lista.size() ; ++i) {
			if(lista.get(i) != ordinata.get(i))
				verificata = false;
		}
		assertTrue(verificata);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void exceptionTest() {
		System.out.println("Sto testando l'eccezione");
		
		util.sort(new ArrayList<Integer>(), -1);
	}
}
