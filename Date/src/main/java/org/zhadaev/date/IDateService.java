package org.zhadaev.date;

import javax.jws.WebService;
import java.sql.Date;

@WebService
public interface IDateService {
    Date getDate();
}
