package scoula.todo.command;

import scoula.lib.cli.command.Command;
import scoula.todo.dao.TodoDao;
import scoula.todo.dao.TodoListDao;
import scoula.todo.domain.Todo;

public class PrintTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute(){
        for (Todo todo: dao.getList()){
            String line = "$2d] %s".formatted(todo.getId(), todo.getTitle());
            System.out.println(line);
        }
        System.out.println();
    }
}
