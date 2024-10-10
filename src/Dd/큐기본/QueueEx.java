package Dd.큐기본;

// Queue는 FIFO(first In First Out)
// 자바에서 Queue는 LinkedList를 활용하여 생성해야 하므로 Linked List가 import되어야 함
//

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQue = new LinkedList<>();
        // offer 는 객체를 queue에 추가, 실패시 false를 반환
        msgQue.offer(new Message("Mail","장원영"));
        msgQue.offer(new Message("SMS","안유진"));
        msgQue.offer(new Message("Kakao","이서"));

        while (!msgQue.isEmpty()) {
            Message msg = msgQue.poll(); // 객체를 꺼내서 반환
            switch (msg.getCommand()) {
                case "Mail" :
                    System.out.println(msg.getTo() + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.getTo() + "에게 문자를 보냅니다.");
                    break;
                case "Kakao" :
                    System.out.println(msg.getTo() + "에게 카톡을 보냅니다.");
                    break;
            }
        }

    }

}

class Message {
    private String command;
    private String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setTo(String to) {
        this.to = to;
    }
}