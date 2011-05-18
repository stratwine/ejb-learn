package com.github.ejblearn.service.impl;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.github.ejblearn.service.Messenger;

@Local(Messenger.class)
@Stateless(name="messengerBean")
public class MessengerImpl implements Messenger{

}
