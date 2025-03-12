package Generics;

import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

class Task implements Comparable<Task> {
    private String taskName;
    private int priority;
    private int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public String getTaskName() { return taskName; }
    public int getPriority() { return priority; }
    public int getDuration() { return duration; }

    @Override
    public int compareTo(Task other) {
        if (this.priority != other.priority) {
            return other.priority - this.priority;
        } else {
            return this.duration - other.duration;
        }
    }

    @Override
    public String toString() {
        return taskName + " (Priority: " + priority + ", Duration: " + duration + " mins)";
    }
}

class TaskScheduler {
    private PriorityQueue<Task> taskQueue;
    private Queue<Task> pendingQueue;

    public TaskScheduler() {
        taskQueue = new PriorityQueue<>();
        pendingQueue = new LinkedList<>();
    }

    public void addTask(Task task) {
        taskQueue.add(task);
        System.out.println("Added Task: " + task);
    }

    public void processTask() {
        if (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing Task: " + task);
        } else if (!pendingQueue.isEmpty()) {
            Task task = pendingQueue.poll();
            System.out.println("Processing Pending Task: " + task);
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void delayTask(String taskName) {
        boolean found = false;
        for (Task task : taskQueue) {
            if (task.getTaskName().equals(taskName)) {
                taskQueue.remove(task);
                pendingQueue.add(task);
                System.out.println("Task delayed: " + task);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Task not found: " + taskName);
        }
    }

    public void displayTasks() {
        System.out.println("\nScheduled Tasks (sorted by priority):");
        if (taskQueue.isEmpty()) {
            System.out.println("(No tasks)");
        } else {
            int index = 1;
            for (Task task : taskQueue) {
                System.out.println(index++ + ". " + task);
            }
        }
        displayPendingTasks();
    }

    public void displayPendingTasks() {
        System.out.println("\nPending Tasks (FIFO Order):");
        if (pendingQueue.isEmpty()) {
            System.out.println("(No pending tasks)");
        } else {
            int index = 1;
            for (Task task : pendingQueue) {
                System.out.println(index++ + ". " + task);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new Task("Code Review", 3, 20));
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(new Task("Database Backup", 2, 30));

        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.delayTask("Code Review");
        scheduler.displayTasks();

        scheduler.delayTask("Database Backup");
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.displayTasks();
    }
}
