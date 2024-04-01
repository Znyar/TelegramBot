package com.znyar.SpringBot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class BotConfiguration {

    @Value("${bot.name}")
    String botName;
    @Value("${bot.token}")
    String token;

}
