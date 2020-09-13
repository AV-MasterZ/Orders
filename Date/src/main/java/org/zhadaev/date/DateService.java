package org.zhadaev.date;

import javax.jws.WebService;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebService(endpointInterface = "org.zhadaev.date.IDateService")
public class DateService implements IDateService {

    @Override
    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(new Date());
    }

}
