package day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void addPerson() {

        Ticket normalTicket = new Ticket(
                "Qeeen",
                LocalDateTime.of(2021, 12, 6, 16, 0),
                10);

        Ticket vipTicket = new FrontOfStageTicket(
                "Qeeen",
                LocalDateTime.of(2021, 12, 6, 16, 0),
                10,
                "exxxtra1234");

        Person jancsi = new Person(normalTicket);
        Person juliska = new Person(vipTicket);

        Concert concert = new Concert();

        assertThrows(IllegalArgumentException.class, () ->
                concert.addPerson(jancsi, LocalTime.of(14, 59)));

        concert.addPerson(jancsi, LocalTime.of(15, 0,1));
        assertEquals(1, concert.getPeople().size());

        assertThrows(IllegalArgumentException.class, () ->
                concert.addPerson(juliska, LocalTime.of(13, 59)));

        concert.addPerson(juliska, LocalTime.of(14, 0,1));
        assertEquals(2, concert.getPeople().size());

    }
}