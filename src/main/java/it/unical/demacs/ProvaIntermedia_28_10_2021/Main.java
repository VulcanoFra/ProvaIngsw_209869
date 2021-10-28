package it.unical.demacs.ProvaIntermedia_28_10_2021;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(2);
		
		MyListUtil util = new MyListUtil();
		util.sort(lista, 0);
		
		
		
	}
}
