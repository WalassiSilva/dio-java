package user;

import com.app.IPhone;

public class User {
  public static void main(String[] args) {
    IPhone ios = new IPhone();

    ios.playMusic();
    ios.controlVolume();
    ios.pauseMusic();

    ios.dialContact("31 99999-8888");
    ios.startVoiceMail();
    ios.pickUpCall();

    ios.showWebPage("https://google.com");
    ios.refreshPage();
    ios.addNewTab();
    ios.showWebPage("https://dio.me");
  }
}
