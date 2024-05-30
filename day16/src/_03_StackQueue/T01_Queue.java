package _03_StackQueue;

import java.util.*;

class Message{
	String command;
	String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	public Message() {
	}
	@Override
	public String toString() {
		return "Message [command=" + command + ", to=" + to + "]";
	}
	
}



public class T01_Queue {

	public static void main(String[] args) {
		Queue<Message>msQueue = new LinkedList<Message>();
		
		msQueue.offer(new Message("sendMail","홍길동"));
		msQueue.offer(new Message("sendSNS","김수한무"));
		msQueue.offer(new Message("sendKakaotalk","거북이"));
		
		System.out.println(msQueue);
		
		while(!msQueue.isEmpty()) {
			Message msg =msQueue.poll();
			switch(msg.command) {
			case "sendMail":
				System.out.println(msg.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSNS"	:
				System.out.println(msg.to+"님에게 메일을 보냅니다.");
				break;
			case "sendKakaotalk"	:
				System.out.println(msg.to+"님에게 메일을 보냅니다.");
				break;
			}
		}
		
		
		
		msQueue.offer(new Message("sendMail","홍길동"));
		msQueue.offer(new Message("sendSNS","김수한무"));
		msQueue.offer(new Message("sendKakaotalk","거북이"));
		
		System.out.println(msQueue.peek());
		System.out.println(msQueue.poll());
		System.out.println(msQueue.poll());
		System.out.println(msQueue.poll());
		System.out.println(msQueue.poll());
		
	}

}
