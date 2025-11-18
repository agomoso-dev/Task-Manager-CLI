package io.github.agomosodev;

interface  TaskService {
    void addTask(Task task);
    void listTasks();
    void deleteTask(int id, Task task);
    void updateTask(int id, Task task);
    Task getTask(int id);
}
