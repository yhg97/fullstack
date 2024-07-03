package org.scoula.lib.cli.Exception;

public class BadMenuException extends Exception{
    public BadMenuException(){
        super("잘못된 메뉴 선택입니다");
    }
    public BadMenuException(String message){
        super(message);
    }
}
