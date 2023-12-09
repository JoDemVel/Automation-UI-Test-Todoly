package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.Todo;

public class AddNewTodo {
    public static void as(WebDriver webDriver, String email, String password, String todo){
        Login.as(webDriver, email, password);
        Enter.text(webDriver, Todo.todoField, todo);
        Click.on(webDriver, Todo.addBottom);
    }
}
