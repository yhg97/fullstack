package ch08.sec04;

public interface RemoteControl {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
