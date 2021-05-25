package com.hendisantika.springbootthymeleafsample.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.boot.actuate.audit.InMemoryAuditEventRepository;
import org.springframework.boot.actuate.audit.listener.AbstractAuditListener;
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
public class AuditEventListener extends AbstractAuditListener {

    private static final Logger LOG = LoggerFactory.getLogger(AuditEventListener.class);

//    private final AuditEventRepository auditEventRepository;

//    public AuditEventListener(AuditEventRepository auditEventRepository) {
//        this.auditEventRepository = auditEventRepository;
//    }

    private final AuditEventRepository auditEventRepository = new InMemoryAuditEventRepository();

    @Override
    protected void onAuditEvent(AuditEvent event) {

        LOG.info("On audit event: timestamp: {}, principal: {}, type: {}, data: {}",
                event.getTimestamp(),
                event.getPrincipal(),
                event.getType(),
                event.getData()
        );

        auditEventRepository.add(event);
    }

}