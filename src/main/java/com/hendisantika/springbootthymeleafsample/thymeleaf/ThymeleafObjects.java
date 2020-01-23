package com.hendisantika.springbootthymeleafsample.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/01/20
 * Time: 06.37
 */
@Controller
class ThymeleafObjects {

    @ModelAttribute("messages")
    List<String> messages() {
        return Arrays.asList("Message 1", "Message 2", "Message 3");
    }
}
