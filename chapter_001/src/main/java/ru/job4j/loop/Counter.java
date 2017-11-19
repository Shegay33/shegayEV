package ru.job4j.loop;

public class Counter {
	private int start;
	private int finish;
	int summ;

	public Counter(int a, int b) {
		this.start = a;
		this.finish = b;
	}
	
	public int add(int start, int finish) {
		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				summ += a;
				
		    }
		} 
                 return summ;		
		    
	}
	
	
}