package hangman;

import java.util.Scanner;

	public class Hangman {
		
		private static String[] woerter = {"java", "erfolg", "bildung", "fernstudium", "abschlussarbeit"};
		private static String wort = woerter[(int) (Math.random() * woerter.length)];
		private static String verschleierung = new String(new char[wort.length()]).replace("\0", "_");
		private static int counter = 0;

		public static void main(String[] args) {
			//EXTERNE QUELLE hinzugezogen
			//siehe Zusatzblatt !!!
			Scanner scanner = new Scanner(System.in);
			
			//Schleife läuft bis Wort erraten oder 10x-Fehlversuche gemacht wurden 
			while (counter < 10 && verschleierung.contains("_")) {
				System.out.println("Tippe einen Buchstaben des gesuchten Wortes ...");
				System.out.println(verschleierung);
				String versuch = scanner.next();
				logikHangman(versuch);
			}
			scanner.close();
		}
		
		//Erzeugt die Verschleierung und Logik des Spiels
		public static void logikHangman(String versuch) {
			String ustrich = "";
			for (int i = 0; i < wort.length(); i++) {
				if (wort.charAt(i) == versuch.charAt(0)) {
					ustrich += versuch.charAt(0);
					
				} else if (verschleierung.charAt(i) != '_') {
					ustrich += wort.charAt(i);
					
				} else {
					ustrich += "_";
				}
			}

			if (verschleierung.equals(ustrich)) {
				counter++;
				zeichneHangman();
			} else {
				verschleierung = ustrich;
			}
			if (verschleierung.equals(wort)) {
				System.out.println("Glückwunsch, Sie "
						+ "b"
						+ "sind dem Galgen entkommen!");
				System.out.println("Das gesuchte Wort lautet " + wort);
				System.exit(0);
			}
		}
		//"Zeichnet" den armen Narr am Galgen 
		public static void zeichneHangman() {
			if (counter == 1) {
				System.out.println("1.Fehlversuch, versuch es erneut!");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("___|___");
				System.out.println();
			}
			if (counter == 2) {
				System.out.println("2.Fehlversuch, versuch es erneut!");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (counter == 3) {
				System.out.println("3.Fehlversuch, versuch es erneut!");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (counter == 4) {
				System.out.println("4.Fehlversuch, versuch es erneut!");
				System.out.println("   _______");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   | ");
				System.out.println("___|___");
			}
			if (counter == 5) {
				System.out.println("5.Fehlversuch, versuch es erneut!");
				System.out.println("   ____________");
				System.out.println("   |          |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (counter == 6) {
				System.out.println("6.Fehlversuch, versuch es erneut!");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |        / . . \\");
				System.out.println("   |       |   v   |");
				System.out.println("   |        \\__u__/");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (counter == 7) {
				System.out.println("7.Fehlversuch, versuch es erneut!");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |        / . . \\");
				System.out.println("   |       |   v   |");
				System.out.println("   |        \\__u__/");
				System.out.println("   |           |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (counter == 8) {
				System.out.println("8.Fehlversuch, versuch es erneut!");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |        / . . \\");
				System.out.println("   |       |   v   |");
				System.out.println("   |        \\__u__/");
				System.out.println("   |           |");
				System.out.println("   |           |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (counter == 9) {
				System.out.println("9.Fehlversuch, versuch es erneut!");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |        / . . \\");
				System.out.println("   |       |   v   |");
				System.out.println("   |        \\__u__/");
				System.out.println("   |           |");
				System.out.println("   |           |");
				System.out.println("   |          / \\ ");
				System.out.println("___|___      /   \\");
			}
			if (counter == 10) {
				System.out.println("Schade, Sie zappeln nun am Galgen!");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |        / . . \\");
				System.out.println("   |       |   v   |");
				System.out.println("   |        \\__u__/");
				System.out.println("   |          _|_");
				System.out.println("   |         / | \\");
				System.out.println("   |          / \\ ");
				System.out.println("___|___      /   \\");
				System.out.println("GAME OVER! Das gesuchte Wort lautete " + wort + "\n Viel Glück beim nächsten mal ! ;D");
				System.exit(0);
			}
		}
	}
	