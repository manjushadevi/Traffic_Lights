/** name : Manjusha
 * Description: Reverse the String word by word
 * Date: 15/4/2021
 */
public class StringReverse {

	public static void main(String[] args) {
		
		String str = "Hello My Dear Friends";
		
		/*Challenge :  Write your logic here so that the output should be in reverse order. It should be displayed as
		 * Friends Dear My Hello.
		 * You need to reverse the String word by word. 
		 * Limitation :  Do not use the reverse method
		 */
		String reversedString = revrerseString(str);
		
		System.out.println("Original String: "+ str);
		System.out.println("Reversed String: "+reversedString);
	}

	private static String revrerseString(String str) {
		String[] separateWords = str.split(" "); 
		String[] newString = new String[separateWords.length];
		int j=0;
		for(int i=separateWords.length-1;i>=0;i--) {
			newString[j] = separateWords[i];
			j++;
		}
		String outputString = String.join(" ", newString);
		return outputString;
	}

}
