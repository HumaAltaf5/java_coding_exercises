package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Exercise004 {
    private LocalDateTime localDateTime;

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
        return getLocalDateTime().plusSeconds(1000000000);
    }

}
