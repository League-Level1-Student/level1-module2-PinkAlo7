package _99_extra._04_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
	/**
	 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
	 * George Orwell is a man, so say “Hello Mr. Orwell”. 
	 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
	 **/

	@Test
	public void testIsWomanNotWeird() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
	}

	@Test
	public void testIsManNotWeird() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
	}

	@Test
	public void testIsManWeird() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello weird Mr. Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}
	
	@Test
	public void testIsWomanWeird() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello weird Ms. Laura", teaParty.welcome("Laura", true, true));
	}

}
    
