package org.example.java8.streams2;

import java.util.Arrays;
import java.util.List;

public class Averager {
	private int total = 0;
	private int count = 0;

//	@Override
	public void accept(int value) {
		total += value;
		count++;
	}

	public double average() {
		return count > 0 ? ((double) total) / count : 0;
	}

	public void combine(Averager other) {
		total += other.total;
		count += other.count;
	}

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
		Averager averageCollect = values
				.stream()
				.collect(Averager::new, Averager::accept, Averager::combine);

		System.out.println("Average age of male members: " + averageCollect.average());
	}
}
