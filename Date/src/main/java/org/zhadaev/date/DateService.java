package org.zhadaev.date;

import javax.jws.WebService;
import java.sql.Date;

@WebService(endpointInterface = "org.zhadaev.date.IDateService")
public class DateService implements IDateService {

    @Override
    public Date getDate() {
        return new Date(new java.util.Date().getTime());
    }

}
