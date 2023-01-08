package Encode;

public class Main {

	public static void main(String[] args) {
		
		String Message = "ChatGPT is Awesome";
		int offset = 5;
		
		EncodeMsg encodemsg = new EncodeMsg();
		
		System.out.println("Encoded Message:" + encodemsg.Encode(Message, offset));
	}

}
