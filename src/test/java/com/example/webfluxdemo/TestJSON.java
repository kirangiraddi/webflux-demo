package com.example.webfluxdemo;


import com.example.webfluxdemo.model.Object;
import com.example.webfluxdemo.model.Slide;
import com.example.webfluxdemo.model.Slideshow;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebFluxTest(ServicesImpl.class)
public class TestJSON {


    @InjectMocks
    private ServicesImpl service = new ServicesImpl();

    @Test
    public void testjson() {

        ArrayList<Slide> slides = new ArrayList<>();
        ArrayList<String> items = new ArrayList<>();
        items.add("Why <em>WonderWidgets</em> are great");
        items.add("Who <em>buys</em> WonderWidgets");
        slides.add(new Slide("Wake up to WonderWidgets!", "all", null));
        slides.add(new Slide("Overview", "all", items));
        Slideshow slideshow = new Slideshow("Yours Truly", "date of publication", slides, "Sample Slide Show");
        Object json = new Object(slideshow);


        Object json2 = service.displayhttpjson();
        assertEquals(json.toString(),json2.toString());


    }


}
