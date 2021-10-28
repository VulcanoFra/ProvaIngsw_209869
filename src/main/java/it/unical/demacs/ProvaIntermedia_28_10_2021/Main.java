package it.unical.demacs.ProvaIntermedia_28_10_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Come vuoi ordinare? 0=crescente, 1=decrescente");
		int order = sc.nextInt();
		
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(2);
		
		MyListUtil util = new MyListUtil();
		util.sort(lista, order);

		for(Integer i : lista)
			System.out.println(i);
		
		sc.close();
	}
}
