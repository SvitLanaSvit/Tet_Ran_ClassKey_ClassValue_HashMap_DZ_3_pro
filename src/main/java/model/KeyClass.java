package model;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class KeyClass {
    private String id;

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return String.format("%-15s", id);
    }
}
