package com.jetbrains.bek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
class TaskServiceTest {


    @Test
    void addTask() {
        {
            TaskService ts = new TaskService();
            Task t = new Task("12345", "BekJohan", "description");

            assertTrue(ts.addTask(t));
            assertFalse(ts.addTask(t));
        }
    }

    @Test
    void deleteTask() {
        TaskService ts = new TaskService();
        Task task = new Task("12345", "BekJohan", "description");
        ts.addTask(task);

        assertTrue(ts.deleteTask("12345"));
        assertTrue(ts.addTask(task));
    }

    @Test
    void updateTask() {
        TaskService ts = new TaskService();
        Task task = new Task("12345", "BekJohan", "description");
        ts.addTask(task);

        assertTrue(ts.updateTask("12345"));
        assertFalse(ts.updateTask(String.valueOf(task)));
    }
}