package com.sample.BehaviorTracker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

    @RestController
    public class BehaviorController {

        @RequestMapping("/")
        public String index() {
            return "Hello World!";
        }

    }
}
