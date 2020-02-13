package com.pe.l1.designPatterns.mediator;

public class ChatClient {

		public static void runClient() {
			ChatMediator mediator = new ChatMediatorImpl();
			User user1 = new UserImpl(mediator, "Mike");
			User user2 = new UserImpl(mediator, "Lisa");
			User user3 = new UserImpl(mediator, "Liz");
			User user4 = new UserImpl(mediator, "David");
			mediator.addUser(user1);
			mediator.addUser(user2);
			mediator.addUser(user3);
			mediator.addUser(user4);
			
			user1.send("Hi All");
			
			user4.send("What's up?");
			
		}
		
	}
