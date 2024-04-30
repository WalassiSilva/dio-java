public class SmartTv {
  boolean isOn = false;
  int channel = 1;
  int volume = 25;

  public void turnOn() {
    isOn = true;
  }

  public void turnOff() {
    isOn = false;
  }

  public void increaseVolume() {
    volume++;
  }

  public void decreaseVolume() {
    volume--;
  }

  public void changeChannel(int newChannel) {
    channel = newChannel;
  }

  public void channelUp() {
    channel ++;
  }

  public void channelDown() {
    channel --;
  }
}