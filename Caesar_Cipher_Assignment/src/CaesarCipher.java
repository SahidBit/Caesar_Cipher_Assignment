
public class CaesarCipher {

	  public static final String alph = "abcdefghijklmnopqrstuvwxyz";
	  
	    public static String encoding(String plainT, int shift) {
	        plainT = plainT.toLowerCase();

	        String cipherT = "";
	        for (int i = 0; i < plainT.length(); i++) {
	            int mappingV = alph.indexOf(plainT.charAt(i));

	            // value of each alphabet in integers like for A=0, B=1 ...
	            int enVal = (shift + mappingV) % 26;
	            char Val = alph.charAt(enVal); // the character to be replaced
	            cipherT = cipherT + Val; 
	        }
	        return cipherT;
	    }

}
