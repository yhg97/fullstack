package scoula.todo.command;

import scoula.lib.cli.command.Command;
import scoula.lib.cli.ui.Input;
import scoula.todo.dao.TodoDao;
import scoula.todo.dao.TodoListDao;
import scoula.todo.domain.Todo;

public class DetailTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute(){
        int id = Input.getInt("Todo Id:");
        Todo todo = dao.getTodo(id);

        System.out.println("[Todo 상세 보기]--------------------------");
        System.out.println("설명    : " + todo.getId());
        System.out.println("설명    : " + todo.getTitle());
        System.out.println("설명    : " + todo.getDescription());
        System.out.println("완료여부 : " + todo.isDone());
        System.out.println("등록일   : " + todo.getRegDate());
        System.out.println("[Todo 상세 보기]--------------------------");
        System.out.println();
    }
}
