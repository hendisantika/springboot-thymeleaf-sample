package com.hendisantika.springbootthymeleafsample.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/01/20
 * Time: 06.39
 */
@Controller
@RequestMapping("/text-templates")
public class ThymeleafTextTemplates {

    private TemplateEngine textTemplateEngine;

    public ThymeleafTextTemplates(TemplateEngine textTemplateEngine) {
        this.textTemplateEngine = textTemplateEngine;
    }
}
