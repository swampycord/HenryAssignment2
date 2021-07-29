package mypackage;

import java.util.HashSet;
import java.util.Scanner;

public class Memory {

	private HashSet<Integer> list;// List veld voor globale scope zodat Memory() en requestInput() het kan
									// opnemen.
	private int count;// variabel aangemaakt voor globale scope zodat Memory() en requestInput() het
						// kan opnemen.
	private Scanner input;

	// Method voor het oplsaan van elke input die ik maak. Alleen unieke getallen
	// gaan in de list. Na elke keer wat typen dan wordt er steeds bij
	// opgeteld(count)
	public Memory() {
		list = new HashSet<>();
		count = 0;
	}

	// Method die een loop maakt voor runNumbers() met do ... while statement.
	public void runNumbers() {

		boolean result;
		do {

			result = requestInput();
		} while (result);
		input.close();// Ik close mijn input hier af
	}

	// Method voor het invoeren voor de user.
	public boolean requestInput() {

		count++;
		input = new Scanner(System.in);
		System.out.print("Enter number: ");
		boolean result;

		try {// Als de user "quit" of "stop" of getallen invult dan zal if statement aan de
				// slag gaan
			String myInput = input.next();

			if (myInput.equals("stop") || myInput.equals("quit")) {// Als user stop klik. Dan geven we de resultaat
				System.out.println("List: " + list);
				System.out.println("Total tries: " + (count - 1));
				result = false;
			} else {// Als user getallen invult, dan gaan we verder
				Integer myInputInteger = Integer.parseInt(myInput);// Getallen in string worden convert naar Integer
				if (list.contains(myInputInteger)) {// Als user een niet uniek getal invult dan zal de loop opnieuw
													// beginnen en ingevoerde getal skippen
					System.err.println("Not unique number.");
				} else {// Als de user een uniek getal invoert dan zal de lsit dit getal toevoegen en de
						// loop zal opnieuw beginnen.
					list.add(myInputInteger);
				}
				result = true;
			}
		} catch (Exception e) {// Als de getal alles invult behalve "stop" of "quit" of getallen dan krijg ie
								// een foutmelding en begint de loop opnieuw
			System.err.println("Invalid");
			result = true;
		}

		return result;

	}

}
