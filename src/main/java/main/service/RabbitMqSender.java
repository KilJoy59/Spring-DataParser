package main.service;

import org.apache.tomcat.jni.File;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

/**
 * Project DataParser
 * Created by End on янв., 2020
 */
@Service
public class RabbitMqSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${sample.rabbitmq.exchange}")
    private String exchange;

    @Value("${sample.rabbitmq.routingkey}")
    private String routingkey;


    public void send(byte[] message) {
        rabbitTemplate.convertAndSend(exchange, routingkey, message);
        /*System.out.println("Send msg to consumer= " + CustomMessage + " ");*/
    }
}