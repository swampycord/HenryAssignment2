package mypackage;

public class Assignment2 {

	/*
	 * Assignment #2 (Easy): Make sure that the user cannot enter more than "10"
	 * valid, unique numbers, after that stop. He also can exit by entering quit or
	 * exit or stop
	 */

	public static void main(String[] args) {

//		Memory2 memory = new Memory2();
//		memory.requestInput();

		Memory mem = new Memory();
		mem.runNumbers();

	}
}
