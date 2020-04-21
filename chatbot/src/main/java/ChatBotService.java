import Soap.SoapClient;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class ChatBotService {
    public static String answer(String question) throws ServiceException, RemoteException {
        String result;

        switch (question) {
            case "გამარჯობა":
                result = "გამარჯობა, რითი შემიძლია დაგეხმაროთ?";
                break;
            case "რომელი საათია?":
                result = "10";
                break;
            case "USD":
                result= SoapClient.Soapconnect("USD");
                break;
            case "EUR":
                result= SoapClient.Soapconnect("EUR");
                break;
            case "JPY":
                result= SoapClient.Soapconnect("JPY");
                break;
            default:
                result = "ამ კითხვაზე პასუხი არ მაქვს";
        }

        return result;
    }
}