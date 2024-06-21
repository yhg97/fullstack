package ch08.sec04;

public class Audio implements RemoteControl {
    private int Volume;

    @Override
    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
        if(volume > RemoteControl.MIN_VOLUME){
            this.Volume = RemoteControl.MIN_VOLUME;
        } else if(volume < RemoteControl.MAX_VOLUME){
            this.Volume = RemoteControl.MAX_VOLUME;
        } else {
            this.Volume = volume;
        }
        System.out.println("현재 Audio 볼륨" + volume);
    }
}
