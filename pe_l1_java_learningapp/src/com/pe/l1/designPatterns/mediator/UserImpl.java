package com.pe.l1.designPatterns.mediator;

public class UserImpl extends User {

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg){
		System.out.println("\t"+this.name+": "+msg);
		mediator.sendMessage(msg, this);
	}
	
	@Override
	public void receive(String msg, User user) {
		System.out.println("\t"+this.name+": Received Message from "+user.toString()+": "+msg);
	}

	@Override
	public String toString() {
		return this.name;
	}
}