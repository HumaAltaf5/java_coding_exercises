package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Exercise004 {
    private LocalDateTime localDateTime;
    private final int GIGA_SECONDS = 1000000000;

    // Getter for LocalDateTime
    public LocalDateTime getLocalDateTime () {
        return localDateTime;
    }

    public Exercise004(LocalDate date) {
        this.localDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.localDateTime = dateTime;
    }

    // Method to add giga seconds to time
    public LocalDateTime getDateTime() {
        return getLocalDateTime().plusSeconds(GIGA_SECONDS);
    }

}
