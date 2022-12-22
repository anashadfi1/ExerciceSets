package entities;

import java.util.*;
import java.util.Set;

public class Main {
		public static void main(String[] args) {


			Set<String> WordSet = new HashSet<String>();
			Set<String> StringsSet = new HashSet<String>();
			WordSet.add("Anas");
			WordSet.add("Etudiant");
			WordSet.add("Ingenieur");
			WordSet.add("EMSI");
			StringsSet.add("EMSI");
			StringsSet.add("a");
			StringsSet.add("X");
			StringsSet.add("Ge");
			System.out.println(WordSet);
			System.out.println(StringsSet);
			WordSet.retainAll(StringsSet);
			System.out.println(WordSet);
			System.out.println(WordSet.contains("Hello"));

			System.out.println(WordSet.contains("EMSI"));

			System.out.println(WordSet.contains("A"));
		}
}
