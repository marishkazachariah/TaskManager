import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks = new ArrayList<>();

    // add
    public void addTask(Task task) {
        tasks.add(task);
    }

    // view
    public void viewTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.print(i);
            System.out.print(" " + tasks.get(i).toString());
        }
    }

    // edit/updating
//    public void editTask(Task taskYouWantToEdit, Task EditedTask){
//
//    }





    // deleting tasks
}
