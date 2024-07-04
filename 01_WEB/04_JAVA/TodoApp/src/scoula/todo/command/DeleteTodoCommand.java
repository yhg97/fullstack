package scoula.todo.command;

import scoula.lib.cli.command.Command;
import scoula.lib.cli.ui.Input;
import scoula.todo.dao.TodoDao;
import scoula.todo.dao.TodoListDao;

public class DeleteTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute(){
        int id = Input.getInt("삭제할 Todo Id:");
        dao.delete(id);

        System.out.println();
    }
}
