import java.util.HashMap;

public class AlphabetCipher {

	
	private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	private HashMap<Character, Integer> cipher = new HashMap<Character, Integer>(); 
	
	public void CipherSetup() {
		for (int i = 0; i < alphabet.length; i++) {
			char a = alphabet[i];
			cipher.put(a, i);
		}
	}
	
	public String encrypt(char[]phrase, char[]message) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, j = 0; i<message.length; i++, j = (j+1) % phrase.length) {
			sb.append(alphabet[(cipher.get(message[i]) + cipher.get(phrase[j])) % alphabet.length]);
		}
		return sb.toString();
	}
	
	public String decrypt(char[]phrase, char[]message) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, j = 0; i<message.length; i++, j = (j+1) % phrase.length) {
			sb.append(alphabet[(cipher.get(message[i]) - cipher.get(phrase[j]) + alphabet.length)
					% alphabet.length]);
		}
		return sb.toString();
	}
}
