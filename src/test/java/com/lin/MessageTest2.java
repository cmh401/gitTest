package com.lin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import com.lin.consumer.QueueConsumer;
import com.lin.producer.Producer;
 
public class MessageTest2 {
    public MessageTest2() throws Exception{
         
        QueueConsumer consumer = new QueueConsumer("queue");
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
         
//        Producer producer = new Producer("queue");
         
        for (int i = 0; i < 1000000; i++) {
//            HashMap message = new HashMap();
//            message.put("message number", i);
//            producer.sendMessage(message);
//            System.out.println("Message Number "+ i +" sent.");
        }
    }
     
    /**
     * @param args
     * @throws SQLException
     * @throws IOException
     */
    public static void main(String[] args) throws Exception{
      new MessageTest2();
    }
}