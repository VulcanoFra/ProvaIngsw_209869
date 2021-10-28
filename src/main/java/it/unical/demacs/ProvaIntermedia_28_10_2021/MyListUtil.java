package it.unical.demacs.ProvaIntermedia_28_10_2021;

import java.util.Comparator;
import java.util.List;

public class MyListUtil {

	public List<Integer> sort(List<Integer> lista, int order){
		
		if(order == 0) {
			ordinaCrescente(lista);
		}
		else if(order == 1)
			ordinaDecrescente(lista);
		else {
			throw new IllegalArgumentException();
		}
		return lista;
	}
	
	private void ordinaCrescente(List<Integer> lista) {
		lista.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
	}
	
	private void ordinaDecrescente(List<Integer> lista) {
		lista.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
	}
}
