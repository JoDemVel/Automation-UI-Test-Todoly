import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddNewTodo;
import ui.Todo;

public class TodoTest extends BaseTest {
    @Test
    public void addTodo(){
        AddNewTodo.as(webDriver, "josue.test1@gmail.com", "Passwd123", "Tarea completada");
    }
}
