package messenger;

public abstract class Messenger {

  public abstract void sendMessage();
  public abstract void receiveMessage();

  // public abstract void saveHitoryChat();
  protected void checkConnection() {
    System.out.println("Checking connection state.");
  }
}
/* 
  public abstract void sendMessage() {
    checkConnection();
    System.out.println("Message sent!");
    saveMessages();
  }  

  public void receiveMessage() {
    System.out.println("Receiving message");
  }

  private void checkConnection() {
    System.out.println("Checking connection state.");
  }

  private void saveMessages(){
    System.out.println("Saving messages");
  }*/
