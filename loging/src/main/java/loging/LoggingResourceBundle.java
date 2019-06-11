package loging;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class LoggingResourceBundle
{
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    /**
     * 
     * @param messageCode
     * @param params
     * @return
     */
    public static Message getMessageText(String messageCode, Object... params)
    {
        Message messageText = new Message(
        		getMessage(messageCode + ".CODE", params),
        		getMessage(messageCode + ".MESSAGE", params),
        		getMessage(messageCode + ".DESC", params));
            
        return messageText;
    }

    /**
     * 
     * @param messageCode
     * @param params
     * @return
     */
    public static String getMessage(String messageCode, Object... params)
    {
        String message = resourceBundle.getString(messageCode);
        if (params == null || params.length == 0 || message.equals(messageCode))
        {
            return message;
        }
        return new MessageFormat(message).format(params);
    }
}