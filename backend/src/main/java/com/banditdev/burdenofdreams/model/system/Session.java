package com.banditdev.burdenofdreams.model.system;

import java.sql.Time;
import java.util.Date;

public class Session {
    private long id;
    private Activity typeOfActivity;
    private int amountOfCustomers;
    private Equipment reservedEquipment;
    private Date dateOfActivity;
    private Time startOfSession;
    private Time endOfSession;
}
