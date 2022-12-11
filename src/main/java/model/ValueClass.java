package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class ValueClass {
    private String name;
    private String surname;
    private Date dateOfBirth;



    @Override
    public String toString() {
        return String.format("%-15s %-15s %-50s", name, surname, dateOfBirth);
    }
}
