package ch05;

public class SingExample {

	public static void main(String[] args) {

		Octave song[] = { Octave.SOL, Octave.SOL, Octave.LA, Octave.LA, Octave.SOL, Octave.MI };

		for (Octave one : song) {
			switch (one) {
			case DO:
				System.out.println("도");
				break;

			case RE:
				System.out.println("레");
				break;

			case SOL:
				System.out.println("솔");
				break;

			case SI:
				System.out.println("시");
				break;
			}
		}

	}

}
