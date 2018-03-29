import static org.junit.Assert.*;
import org.junit.Test;

public class AlphabetCipherTest {

	@Test
	public void EncryptTest1() {
		AlphabetCipher cipher = new AlphabetCipher();
		cipher.CipherSetup();
		assertEquals("uvrufrsryherugdxjsgozogpjralhvg", cipher.encrypt("bond".toCharArray(), 
				"theredfoxtrotsquietlyatmidnight".toCharArray()));
	}
	
	@Test
	public void EncryptTest2() {
		AlphabetCipher cipher = new AlphabetCipher();
		cipher.CipherSetup();
		assertEquals("flrlrkfnbuxfrqrgkefckvsa", cipher.encrypt("train".toCharArray(), 
				"murderontheorientexpress".toCharArray()));
	}
	
	@Test
	public void EncryptTest3() {
		AlphabetCipher cipher = new AlphabetCipher();
		cipher.CipherSetup();
		assertEquals("zhvpsyksjqypqiewsgnexdvqkncdwgtixkx", cipher.encrypt("garden".toCharArray(), 
				"themolessnuckintothegardenlastnight".toCharArray()));
	}
	
	@Test
	public void DecryptTest1() {
		AlphabetCipher cipher = new AlphabetCipher();
		cipher.CipherSetup();
		assertEquals("iamtheprettiestunicorn", cipher.decrypt("cloak".toCharArray(), 
				"klatrgafedvtssdwywcyty".toCharArray()));
	}
	
	@Test
	public void DecryptTest2() {
		AlphabetCipher cipher = new AlphabetCipher();
		cipher.CipherSetup();
		assertEquals("alwayslookonthebrightsideoflife", cipher.decrypt("python".toCharArray(), 
				"pjphmfamhrcaifxifvvfmzwqtmyswst".toCharArray()));
	}
	
	@Test
	public void DecryptTest3() {
		AlphabetCipher cipher = new AlphabetCipher();
		cipher.CipherSetup();
		assertEquals("foryoureyesonly", cipher.decrypt("moore".toCharArray(), 
				"rcfpsgfspiecbcc".toCharArray()));
	}
}
