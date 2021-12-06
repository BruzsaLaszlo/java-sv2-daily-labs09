package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends  Ticket{

    private String extraCode;

    public FrontOfStageTicket(String nameOfBand, LocalDateTime startTime, int price, String extraCode) {
        super(nameOfBand, startTime, price);
        this.extraCode = extraCode;
    }

    public String getExtraCode() {
        return extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return getStartTime().minusHours(2).toLocalTime();
    }
}
