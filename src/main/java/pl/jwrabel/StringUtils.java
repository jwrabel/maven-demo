package pl.jwrabel;

/**
 * Created by jakubwrabel on 08.03.2017.
 */
public class StringUtils {
	public static void main(String[] args) {

		String text = "Ala ma kota";


		text.equals("sdsdsdss"); // "ALA".equals("ala") // false
		text = text.toLowerCase(); // ala ma kota
		text = text.toUpperCase(); // ALA MA KOTA
		char[] charsFromString = text.toCharArray(); // ['A', 'l','a' ...
		boolean ifContains = text.contains("avc"); // false
		boolean ifContains2 = text.contains("Ala"); // true
		boolean areEqual = text.equalsIgnoreCase("AlA Ma KoTA"); // true
		int comparisonResult = text.compareTo("BCA"); //

		// A.compare(B) // < 0 -> A<B
		// 0 -> A == B
		// > 0 -> A>B

		String resultSubstring = text.substring(3); // " ma kota"
		String resultSubstring2 = text.substring(3, 6); // " ma "

		String replaceResult = text.replaceAll("A", "B"); // "Bla ma kota"
		String trimResult = "     ALA MA KOTA    ".trim(); // "ALA MA KOTA"
		int index = text.indexOf("ma"); // 3 -> miejsce w stringu, gdzie jest podany string, jeśli nie ma zwraca -1



		// String -> tablicę Stringów/znaków
		String[] split = text.split("");
//        String[] splitWords = text.split(" ");

		// String -> tablicę charów
		char[] chars = text.toCharArray();

	}
}
