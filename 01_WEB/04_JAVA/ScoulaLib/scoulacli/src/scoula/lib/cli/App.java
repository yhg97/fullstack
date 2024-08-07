package scoula.lib.cli;

import scoula.lib.cli.command.Command;
import scoula.lib.cli.command.ExitCommand;
import scoula.lib.cli.ui.Menu;
import scoula.lib.cli.ui.MenuItem;

public class App {
    Menu menu;
    public App() {
    }
    public void init() {
        menu = new Menu();
        createMenu(menu);
        menu.add(new MenuItem("종료", new ExitCommand()));
    }
    public void createMenu(Menu menu) {
    }
    public void run() {
        init();
        while(true) {
            try {
                menu.printMenu();
                Command command = menu.getSelect();
                command.execute();
            }catch (Exception e) {
                e.printStackTrace();
                System.out.println("에러: "+e.getMessage());
            }
        }
    }

}
