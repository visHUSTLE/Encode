package Encode;

public class EncodeMsg {
	
	private static final char LTR_A = 'a';
	private static final char LTR_Z = 'z';
	private static final int size = 26;
	
	public String Encode(String msg, int offset){
		offset %= size;
		char[] character = msg.toCharArray();
		offsetBy(character, offset);
		return new String(character);
	}

	private void offsetBy(char[] character, int offset) {
		
		for (int i = 0; i < character.length; ++i) {
			
			if (character[i] != ' ') {
			
				character[i] = offsetChar(character[i], offset, LTR_A, LTR_Z);
			}
		}
		
		
	}

	private char offsetChar(char c, int offset, char ltrA, char ltrZ) {
		c += offset;
		
		if (c < ltrA) {
			return (char)(c + size);
		}
		
		if (c > ltrZ) {
			return (char)(c - size);
		}
		
		return c;
	}
	
	
}
