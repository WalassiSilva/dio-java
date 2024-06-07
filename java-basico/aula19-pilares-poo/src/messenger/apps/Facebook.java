package messenger.apps;

import messenger.Messenger;

public class Facebook extends Messenger {
  @Override
  public void sendMessage(){
    checkConnection();
    System.out.println("Facebook: Message sent.");
  }
  
  @Override
  public void receiveMessage(){
    System.out.println("Facebook: Message received");
  }
}
