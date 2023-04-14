package com.jetbrains.bek;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    @DisplayName( "The Task object shall have a required unique task ID string that cannot be longer than 10 characters.")
        void TestGetTaskID() {
        Task task = new Task("12345", "BekJohan", "description");
        assertEquals(task.getTaskID(), "12345");
    }

    @Test
    @DisplayName( "The Name object shall have a required unique name string that cannot be longer than 20 characters.")
        void TestGetName() {
        Task task = new Task("12345", "BekJohan", "description");
        task.setName("BekJohan");
        assertEquals(task.getName(), "BekJohan");
    }

    @Test
    @DisplayName( "The Name object shall have a required unique name string that cannot be longer than 20 characters.")
        void getDescription() {
        Task task = new Task("12345", "BekJohan", "description");
        task.setDescription("description");
        assertEquals(task.getDescription(), "description");
    }




}