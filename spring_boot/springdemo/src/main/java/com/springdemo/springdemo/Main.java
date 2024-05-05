package com.springdemo.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

@RestController
class ApiController {

    @GetMapping("/api")
    public String api() {
        return "This is an API endpoint";
    }

    @GetMapping("/api/data")
    public DataObject apiData() {
        // Assuming DataObject is a class representing your JSON data
        DataObject data = new DataObject();
        data.setValue("example");
        return data;
    }

    static class DataObject {
        private String value;

        // Getters and setters
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
