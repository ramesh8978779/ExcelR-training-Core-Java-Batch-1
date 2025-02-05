class StringContainsVowels {	
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".[aeiou].");
	}
}
public class Demo026 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        StringContainsVowels obj = new StringContainsVowels();
		System.out.println(obj.stringContainsVowels("Hello")); // true
		System.out.println(obj.stringContainsVowels("TV"));// false
	}
}
