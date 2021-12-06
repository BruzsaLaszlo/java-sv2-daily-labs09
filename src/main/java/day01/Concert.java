package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person, LocalTime time) {
        if (person.getTicket().entryTime().isBefore(time)) {
            people.add(person);
        } else {
            throw new IllegalArgumentException("most nem léphet be");
        }
    }

    public List<Person> getPeople() {
        return List.copyOf(people);
    }
}
