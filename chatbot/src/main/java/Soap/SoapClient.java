package Soap;

import currency.NBGCurrencyServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class SoapClient {
    public static String Soapconnect(String currency) throws ServiceException, RemoteException {
        NBGCurrencyServiceLocator locator = new NBGCurrencyServiceLocator();
        return locator.getNBGCurrencyPort().getCurrency(currency);
    }
}
