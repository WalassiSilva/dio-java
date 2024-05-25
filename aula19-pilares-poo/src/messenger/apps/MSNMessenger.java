package messenger.apps;

import messenger.Messenger;

public class MSNMessenger extends Messenger {
  @Override
  public void sendMessage() {
    checkConnection();
    System.out.println("MSN: Message sent.");
  }

  @Override
  public void receiveMessage() {
    System.out.println("MSN: Message received");
  }


}
