package loging;

public class Message
{
    private String code;
    private String text;
    private String desc;

    public Message(String messageTypeCode, String messageText, String messageDesc)
    {
        this.code = messageTypeCode;
        this.text = messageText;
        this.desc = messageDesc;
    }

	@Override
	public String toString() {
		String str = code + ", Message : " + text;
		if(desc !=null && !desc.isEmpty()) {
			str += ", Possible Solution : " + desc;
		}
		return str;
	}
}
