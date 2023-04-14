package com.jetbrains.bek;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class appointmentServiceTest {
    @Test
    @DisplayName("The appointment object shall have a required unique contact ID string that cannot be longer than 10 characters.\")")
    void TestGetAppointmentID() {
        appointment a = new appointment("13", "12/12/2023", "test");
        assertEquals(a.getAppointmentID(),"13");
    }

    @Test
    void getAppointmentDate() {
        appointment b = new appointment("13", "12/12/2023", "test");
        assertEquals(b.getAppointmentDate(),"12/12/2023");
    }

    @Test
    void getAppointmentDescription() {
        appointment b = new appointment("13", "12/12/2023", "test");
        assertEquals(b.getAppointmentDescription(),"test");
    }
}
