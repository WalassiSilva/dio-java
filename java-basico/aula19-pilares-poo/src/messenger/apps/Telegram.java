package messenger.apps;

import messenger.Messenger;

public class Telegram extends Messenger {
  @Override
  public void sendMessage() {
    checkConnection();
    System.out.println("Telegram: Message sent.");
  }

  @Override
  public void receiveMessage() {
    System.out.println("Telegram: Message received");
  }
}
