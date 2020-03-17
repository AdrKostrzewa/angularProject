package com.testapp.korepetycjedom.book;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http:localhost:8080 /books
@Api
@RestController
@RequestMapping("/books")
public class BookController {

    // sluzy do pobierania danych
    @GetMapping
    public String getALlBooks(){
        return "ten endpoint zwraca wszytskie ksiazki";
    }

    // sluzy do dodawania danych
    @PostMapping
    public String get(){
        return "post";
    }
}
