class StringContainsVowels {	
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".[aeiou].");
	}
}
public class Demo14 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        StringContainsVowels obj = new StringContainsVowels();
		System.out.println(obj.stringContainsVowels("Hello"));
		System.out.println(obj.stringContainsVowels("TV"));
	}
}