package scoula.todo.command;

import scoula.lib.cli.command.Command;
import scoula.lib.cli.ui.Input;
import scoula.todo.dao.TodoDao;
import scoula.todo.dao.TodoListDao;
import scoula.todo.domain.Todo;

public class AddTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute(){
        System.out.println("[새 todo 추가]---------------------------------");
        String title = Input.getLine("제목:");
        String description = Input.getLine("설명:");
        System.out.println("----------------------------------------------");

        Todo todo = Todo.builder()
                .title(title)
                .description(description)
                .done(false)
                .build();
        dao.add(todo);
        System.out.println();
    }
}
