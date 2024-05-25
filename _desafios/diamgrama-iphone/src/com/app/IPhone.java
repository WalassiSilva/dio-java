package com.app;

import com.app.services.Browser;
import com.app.services.MusicPlayer;
import com.app.services.Phone;

public class IPhone implements Browser, MusicPlayer, Phone {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    @Override
    public void dialContact(String contact) {
      System.out.println("discando para " + contact);
    }

    @Override
    public void pickUpCall() {
      System.out.println("Someone is calling. Picking up call.");
    }

    @Override
    public void startVoiceMail() {
      System.out.println("Recording voice mail");
    }

    @Override
    public void saveContact(String name, String contact) {
      System.out.printf("Saving contact name: %s - contact number %s", name, contact);
    }

    @Override
    public void selectMusic() {
      System.out.println("Selecting music");
    }

    @Override
    public void controlVolume() {
      System.out.println("Controlling volume");
    }

    @Override
    public void playMusic() {
      System.out.println("Playing music");
    }

    @Override
    public void pauseMusic() {
      System.out.println("Music has been paused.");
    }

    @Override
    public void showWebPage(String url) {
      System.out.println("Entering " + url);
    }

    @Override
    public void addNewTab() {
      System.out.println("New tap created.");
    }

    @Override
    public void refreshPage() {
      System.out.println("Page refreshed successfully.");
    }

}
