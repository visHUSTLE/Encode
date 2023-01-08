package Encode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncodeMsgTest {
	
	private EncodeMsg encodemsg = new EncodeMsg();
	
	@Test
	void testEncodeMsgwithoffsetof12() {
		assertEquals("bmfyfos nx `bjxtrj", encodemsg.Encode("ChatGPT is Awesome", 5));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", encodemsg.Encode("", 12));
	}

}
