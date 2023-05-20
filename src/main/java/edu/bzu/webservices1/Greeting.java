package edu.bzu.webservices1;

import lombok.Data;

@Data
public class Greeting {
    long id;
    String content;

    public Greeting(long l, String format) {
        id = l;
        content = format;
    }
}
