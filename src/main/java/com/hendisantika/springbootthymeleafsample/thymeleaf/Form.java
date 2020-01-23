package com.hendisantika.springbootthymeleafsample.thymeleaf;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/01/20
 * Time: 06.41
 */
public class Form {
    private String name = "spring.io";
    private String url = "http://spring.io";
    private String tags = "#spring #framework #java";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
