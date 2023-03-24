package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloworldController {

    @GetMapping("/time")
    public String time() {
        LocalDateTime nowDate = LocalDateTime.now();
        DateTimeFormatter form =
                DateTimeFormatter.ofPattern("日本の現在時刻yyyy年MM月dd日E曜日 HH時mm分ss秒");
        String formatNowDate = form.format(nowDate);
        return formatNowDate;
    }
}
