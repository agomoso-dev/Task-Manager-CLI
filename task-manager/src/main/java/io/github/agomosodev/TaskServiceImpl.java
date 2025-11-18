package io.github.agomosodev;

import java.util.HashMap;
import java.util.Map;

public class TaskServiceImpl implements TaskService {

    private Map<Integer, Task> tasks = new HashMap<>();
    private static int idCounter = 1; // To generate unique IDs


    @Override
    public void addTask(Task task) {
        if(task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        task.setId(idCounter++);
        tasks.put(task.getId(), task);
    }

    @Override
    public void listTasks() {
        if(tasks.isEmpty()) {
            System.out.println("No tasks available.");
        }else {
            tasks.values().forEach(task -> {
                System.out.println("ID: " + task.getId());
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
                System.out.println("State: " + task.getState());
                System.out.println("Due Date: " + task.getDueDate());
                System.out.println("Completed: " + task.isCompleted());
                System.out.println("---------------------------");
            });
        }
    }

    @Override
    public void deleteTask(int id, Task task) {
        if(!taskExists(id)) {
            NotExistsMessage(id);
        }else {
            tasks.remove(id);
            System.out.println("Task with ID " + id + " has been deleted.");
        }
    }

    @Override
    public void updateTask(int id, Task task) {
        if(!taskExists(id)) {
            NotExistsMessage(id);
        }else {
            task.setId(id);
            tasks.put(id, task);
            System.out.println("Task with ID " + id + " has been updated.");
        }
    }

    @Override
    public Task getTask(int id) {
        if(!taskExists(id)) {
            NotExistsMessage(id);
        }else{
            return tasks.get(id);
        }
        return null;
    }

    // Helper methods
    public boolean taskExists(int id) {
        return  tasks.containsKey(id);
    }

    public void NotExistsMessage(int id) {
        System.out.println("Task with ID " + id + " does not exist.");
    }
}
