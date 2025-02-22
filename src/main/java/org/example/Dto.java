package org.example;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Dto {
    private final String name;
    private final String description;
    private final int age;
    private final LocalDate birthday;
    private final String status;
}
