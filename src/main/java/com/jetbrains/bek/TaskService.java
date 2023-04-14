package com.jetbrains.bek;

import java.util.ArrayList;

/*
    The task service shall be able to add tasks with a unique ID.
    The task service shall be able to delete tasks per task ID.
    The task service shall be able to update task fields per task ID. The following fields are updatable:
     Name
     Description

 */
public class TaskService {
    private final ArrayList<Task> tasks;

    public TaskService()
    {
        tasks = new ArrayList<>();
    }
    public boolean addTask(Task task)
    {
        boolean taskAlready = false;
        for (Task taskList:tasks)
        {
            if (taskList.equals(task)) {
                taskAlready = true;
                break;
            }
        }
        if (!taskAlready)
        {
            tasks.add(task);
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteTask(String taskID)
    {
        for (Task taskList:tasks)
        {
            if (taskList.getTaskID().equals(taskID))
            {
                tasks.remove(taskList);
                return true;
            }
        }
        return false;
    }
    public boolean updateTask(String taskID)
    {
        for (Task taskList:tasks)
        {
            if (taskList.getTaskID().equals(taskID))
            {
                String name = null;
                if(name != null && !(name.length()>20))
                {
                    taskList.setName(name);
                }
                String description = null;
                if(description != null && !(description.length()>50))
                {
                    taskList.setDescription(description);
                }
                return true;
            }
        }
        return false;
    }
//  Used main for testing
    public static void main(String[] args) {

        TaskService ts = new TaskService();

        Task t = new Task("12345",  "BekJohan",  "description");

        System.out.println("Attempting to add a task...");
        boolean result = ts.addTask(t);
        if (result)
            System.out.println("First task added.");
        else
            System.out.println("First task not added!");
    }
}
