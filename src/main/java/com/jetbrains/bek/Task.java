package com.jetbrains.bek;

public class Task {
    /*
    1. The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID
    shall not be null and shall not be updatable.
    2. The task object shall have a required name String field that cannot be longer than 20 characters. The
    name field shall not be null.
    3. The task object shall have a required description String field that cannot be longer than 50 characters.
    The description field shall not be null.
     */

    private String taskID;
    private String name;
    private String description;

    Task(String taskID, String name, String description) {
        setTaskID(taskID);
        setName(name);
        setDescription(description);
    }

    public String getTaskID() { return taskID;}
        void setTaskID(String taskID) {
        validateTaskID(taskID);
        this.taskID = taskID;
    }

    public String getName() { return name;}
     void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public String getDescription() { return this.description;}
        void setDescription(String description) {
        validateDescription(description);
        this.description = description;
    }

    private void validateTaskID(String taskID) {
        if (taskID == null) {
            throw new RuntimeException("Task ID cannot be null or empty!");
        }
        if (taskID.length() > 10)
            throw new RuntimeException("Contact ID must have 10 characters or less!");
    }

    private void validateName(String name) {
        if (name == null) {
            throw new RuntimeException("Name cannot be null or empty!");
        }
        if (name.length() > 20)
            throw new RuntimeException("Name must have 20 characters or less!");
    }

    private void validateDescription(String description) {
        if (description == null) {
            throw new RuntimeException("Name cannot be null or empty!");
        }
        if (description.length() > 50)
            throw new RuntimeException("Description must have 50 characters or less!");
    }

//        Using main to test
    public static void main(String[] args) {

        Task task = new Task( "12345",  "BekJohan",  "description");
        System.out.println(task.getTaskID());
        System.out.println(task.getName());
        System.out.println(task.getDescription());


    }
}
