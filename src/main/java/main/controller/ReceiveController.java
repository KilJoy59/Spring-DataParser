package main.controller;

import main.service.RabbitMqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Project DataParser
 * Created by End on янв., 2020
 */
@Controller
public class ReceiveController {

    @Autowired
    RabbitMqSender rabbitMqSender;


}
