package org.example.java8.streams1;

import java.util.Arrays;
import java.util.Collection;

public class Streams {
	public static enum Status {
		OPEN, CLOSED
	};

	public static class Task {
		private final Status status;
		private final Integer points;

		Task(final Status status, final Integer points) {
			this.status = status;
			this.points = points;
		}

		public Integer getPoints() {
			return points;
		}

		public Status getStatus() {
			return status;
		}

		@Override
		public String toString() {
			return String.format("[%s, %d]", status, points);
		}
	}
	
	public static void main(String[] args) {
		final Collection<Task> tasks = Arrays.asList(
			    new Task(Status.OPEN, 5),
			    new Task(Status.OPEN, 13),
			    new Task(Status.CLOSED, 8), 
			    new Task(Status.CLOSED, 2) 
			);
		
		int totalPoints = tasks
			.stream()
			.filter(t -> t.getStatus() == Status.CLOSED)
			.mapToInt(Task::getPoints)
//			.mapToInt(task -> task.getPoints())
			.sum();
		System.out.println(totalPoints);
		
		// Calculate total points of all tasks
		final double totalPointsParallel = tasks
		   .stream()
		   .parallel()
		   .map( task -> task.getPoints() ) // or map( Task::getPoints ) 
		   .reduce( 0, Integer::sum );
		    
		System.out.println( "Total points (all tasks): " + totalPointsParallel );
		
		Collection<String> texts = Arrays.asList("a", "b", "c", "d", "e");
		String joinTexts = texts
			.stream()
			.parallel()
			.reduce("", (acc,t) -> acc+t);
		System.out.println(joinTexts);
		
		Collection<String> texts2 = Arrays.asList("a", "b", "c", "d", "e");
		String joinTexts2 = texts2
			.stream()
			.parallel()
			.reduce("", (acc,t) -> acc.isEmpty() ? t : acc + "," + t);
		System.out.println(joinTexts2);
		
	}
}