
public class decrypting {
	public static String decoding(String cipherT, int shift) {
        cipherT = cipherT.toLowerCase();
        // converting the text to lowercase
        String plainT = "";
        // initializing empty string to add alphabets iteratively
        for (int i = 0; i < cipherT.length(); i++) {
            int mappingV = alph.indexOf(cipherT.charAt(i));
            int deVal = (mappingV - shift) % 26;
            if (deVal < 0) // to handle the negative values
            {
                deVal = alph.length() + deVal;
            }
            char Val = alph.charAt(deVal); // the character to be replaced
            plainT = plainT + Val; // adding to plaintext
        }
        return plainT;
    }
 
}
