import ch08.sec02.RemoteControl;

public class Television implements RemoteControl {
    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
}
