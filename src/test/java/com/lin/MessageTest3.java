package com.lin;

import java.io.IOException;
import java.util.HashMap;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.retry.backoff.Sleeper;

import com.lin.producer.MessageProducer;
import com.lin.producer.Producer;

/**
 * 功能概要：
 * 
 * @author linbingwen
 * @since  2016年1月15日 
 */
public class MessageTest3  {
	public static void main(String[] args) throws IOException {
		Producer producer = new Producer("queue");
	    
//	    for (int i = 0; i < 1000000; i++) {
	        HashMap message = new HashMap();
	        message.put("message number", 5);
	        producer.sendMessage(message);
	        System.out.println("Message Number "+ 5 +" sent.");
//	    }
	}

}
