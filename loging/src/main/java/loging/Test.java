package loging;

public class Test {
	public static void main(String args[]) {
		Message message = LoggingResourceBundle.getMessageText("GREETINGS");
		System.out.println(message.toString());
		
		Message messageWithParam = LoggingResourceBundle.getMessageText("GREETINGS_WITH_PARAM", new Object[]{"Satmetrix"});
		System.out.println(messageWithParam.toString());
		
		Message test = LoggingResourceBundle.getMessageText("TEST");
		System.out.println(test.toString());
	}
}
