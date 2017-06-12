package siralama.stack;

import java.util.Stack;

public class Islem {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("mustafa");
		stack.push("Hilal");
		stack.push("muhammed");
		stack.push("Cemal");
		stack.push("hann");
		System.out.println(stack);
		while (!stack.empty()) {
			stack.pop();
			System.out.println(stack);
		}
	}
}
