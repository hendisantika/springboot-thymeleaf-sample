package com.hendisantika.springbootthymeleafsample.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/01/20
 * Time: 06.33
 */
@Component
public class AuditApplicationEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(AuditApplicationEventListener.class);

    private final ApplicationEventPublisher applicationEventPublisher;

    public AuditApplicationEventListener(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
