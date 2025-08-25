package com.pallidamors.springexample.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lifecycle/ex01")

@RestController //@Controller + @ResponseBody
public class Ex01RestController {

    // 직접 만든 클래스 객체를 Response에 담는 페이지
    @RequestMapping("/3")
    public Person personResponse(){
        Person me =  new Person("최정우",24);

        return me;
    }

    @RequestMapping("/4")
    // status code 수정
    public ResponseEntity<Person> statusResponse(){
        Person me =  new Person("최정우",24);

        ResponseEntity<Person> entity = new ResponseEntity<>(me, HttpStatus.INTERNAL_SERVER_ERROR);

        return entity;

    }
}
