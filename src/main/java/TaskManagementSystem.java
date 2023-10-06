public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.addTask(new Task("Finish task", "test descr", 9, "not complete"));
        taskList.addTask(new Task("Finish exercise 3", "test descr", 2, "in progress"));
        taskList.addTask(new Task("Clean Kitchen", "mop floors", 5, "not started"));

        taskList.viewTasks();
    }
}
