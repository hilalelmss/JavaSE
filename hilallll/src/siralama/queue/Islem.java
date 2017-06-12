package siralama.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Islem {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("mustafa");
		queue.offer("hilal");
		queue.offer("cemal");
		System.out.println(queue);
		while (!queue.isEmpty()) {
			queue.poll();
			System.out.println(queue);
		}
	}
}
