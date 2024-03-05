import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestStudent {
    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testStringInBounds() {
	assertTrue(CryptoManager.isStringInBounds("ABCD"));
	assertTrue(CryptoManager.isStringInBounds("1234$%&^#"));
	assertTrue(CryptoManager.isStringInBounds(" HELLO SPACE          "));
	assertFalse(CryptoManager.isStringInBounds("abcdefg"));
	assertFalse(CryptoManager.isStringInBounds("`ABCD`|~"));
	assertFalse(CryptoManager.isStringInBounds("_{}][]|~~~"));
    }

    @Test
    public void testEncryptCaesar() {
	assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("~~~~", 3));
	assertEquals("BCSBIBN!MJODPMO", CryptoManager.caesarEncryption("ABRAHAM LINCOLN", 1));
	assertEquals("?D=CU;U@:CC:9N", CryptoManager.caesarEncryption("JOHN F KENNEDY", 1010101));
	assertEquals("KFILIMQJNM", CryptoManager.caesarEncryption("3.14159265", 3141592));
	assertEquals("HELLO WORLD", CryptoManager.caesarEncryption("OLSSV'^VYSK", 12345));
	assertEquals("453<1B1D9?>P?6P9>45@5>45>35", CryptoManager.caesarEncryption("DECLARATION OF INDEPENDENCE", 1776));
    }

    @Test
    public void testDecryptCaesar() {
	assertEquals("CUT MY LIFE INTO PIECES", CryptoManager.caesarDecryption("]/.:'3:&# _:#(.):*#_]_-", 666));
	assertEquals("THIS IS MY LAST RESORT", CryptoManager.caesarDecryption("]QR\\)R\\)V\")UJ\\])[N\\X[]", 777));
	assertEquals("SUFFOCATION, NO BREATHING", CryptoManager.caesarDecryption("KM>>G;9LAGF$XFGX:J=9L@AF?", 888));
	assertEquals("DONT GIVE A #$@#", CryptoManager.caesarDecryption("+65;G.0=,G(GJK'J", 999));
    }

    @Test
    public void testEncryptBellaso() {
	assertEquals("The selected string is not in bounds, Try again.", CryptoManager.bellasoEncryption("~~~~~", "HELLO"));
	assertEquals("JINGLE BELLS", CryptoManager.bellasoEncryption("8:L>>&TA<H-R", "ROBIN_LAID_AN_EGG"));
	assertEquals("BATMAN SMELLS", CryptoManager.bellasoEncryption("+2E-9?Q366=,K", "WOO HOO WOO HOO WHOO HOO"));
	assertEquals("ROBIN LAID AN EGG", CryptoManager.bellasoEncryption("HF4BB[,?D8T.DW7@;", "JINGLE BELLS"));

    }

    @Test
    public void testDecryptBellaso() {
	assertEquals("B.P", CryptoManager.bellasoDecryption("CAT", "ASDBASDIOWALDMSAD"));
	assertEquals("MERRY CHRISTMAS", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
	assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));

    }
}
