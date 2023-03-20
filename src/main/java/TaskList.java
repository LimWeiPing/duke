import java.util.ArrayList;
import java.util.Collection;

public class TaskList {

    protected static ArrayList<Task> tasksArray;
    protected int size;

/*
    public TaskList(ArrayList A){
        for (Object i: A) {
            this.tasksArray.add((Task) i);
        }
    }

 */
    public TaskList(ArrayList t){
        this.tasksArray = new ArrayList<>((Collection) t);
        this.size = tasksArray.size();
    }

    public int getSize() {
        return size;
    }


    public TaskList() {

    }

    public void add(ToDo todo) {
        tasksArray.add(todo);
        size ++;
    }

    public void add(Deadline deadline) {
        tasksArray.add(deadline);
        size ++;
    }

    public void add(Event event) {
        tasksArray.add(event);
        size ++;
    }

    public Task get(int taskNumber) {
        return tasksArray.get(taskNumber);
    }


    public void remove(int i) {
        tasksArray.remove(tasksArray.get(i));
        size --;
    }
}
