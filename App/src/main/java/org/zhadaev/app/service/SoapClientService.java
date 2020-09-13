package org.zhadaev.app.service;

import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;

@Service
public class SoapClientService implements ISoapClientService {

    public String getDate() {

        String date = "";

        try {
            SOAPConnectionFactory sfc = SOAPConnectionFactory.newInstance();
            SOAPConnection connection = sfc.createConnection();

            MessageFactory mf = MessageFactory.newInstance();
            SOAPMessage sm = mf.createMessage();
            SOAPHeader sh = sm.getSOAPHeader();
            SOAPBody sb = sm.getSOAPBody();
            sh.detachNode();

            MimeHeaders mimeHeader = sm.getMimeHeaders();
            mimeHeader.setHeader("SOAPAction", "");
            QName bodyName = new QName("http://date.zhadaev.org/", "getDate");
            SOAPBodyElement bodyElement = sb.addBodyElement(bodyName);

            URL endpoint = new URL("http://localhost:8080/dateservice/");
            SOAPMessage response = connection.call(sm, endpoint);

            date = response.getSOAPBody().getElementsByTagName("return").item(0).getTextContent();

            connection.close();

        } catch (SOAPException | IOException e) {
            e.printStackTrace();
        }

        return date;

    }

}
