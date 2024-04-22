package com.example.bizservicedemo.controller;

import com.example.bizservicedemo.common.base.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/getUser")
    public R getUser() {
        waitFor();
        return R.ok().data("action", "getUser");
    }

    @GetMapping("/getUser2")
    public R getUser2() {
        waitFor();
        return R.ok().data("action", "getUser2");
    }

    @GetMapping("/getUser3")
    public R getUser3() {
        waitFor();
        return R.ok().data("action", "getUser3");
    }

    private void waitFor() {
       try {
           Thread.sleep( 10 * 1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

    }


}
