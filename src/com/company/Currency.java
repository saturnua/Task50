package com.company;

import java.io.IOException;
import java.net.URL;
import java.util.List;


import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Currency {

    public void getCurrencys() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Comment> comments = mapper.readValue(new URL("https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=11"), new TypeReference<List<Comment>>(){});
        System.out.println(comments);
    }
}