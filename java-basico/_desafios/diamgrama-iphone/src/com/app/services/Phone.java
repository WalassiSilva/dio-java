package com.app.services;

public interface Phone {
  public void dialContact(String contact);
  public void pickUpCall();
  public void startVoiceMail();
  public void saveContact(String name, String contact);
}
