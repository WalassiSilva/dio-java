package messenger;

import messenger.apps.Facebook;
import messenger.apps.MSNMessenger;
import messenger.apps.Telegram;

public class PcPedrinho {
  public static void main(String[] args){

    Messenger chat = null;

    String choosenChat="facebook";

    if(choosenChat.equals("msn")){
      chat = new MSNMessenger();
    }else if(choosenChat.equals("facebook")){
      chat = new Facebook();
    } else if(choosenChat.equals("telegram")){
      chat = new Telegram();
    }

    chat.sendMessage();
    chat.receiveMessage();
    // MSNMessenger msn = new MSNMessenger();
    // msn.sendMessage();
    // msn.receiveMessage();

    // Facebook fb = new Facebook();
    // fb.sendMessage();
    // fb.receiveMessage();
    
    // Telegram telegram = new Telegram();
    // telegram.sendMessage();
    // telegram.receiveMessage();
  }
}
