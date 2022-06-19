package org.itstep.springthymeleafusers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SampleEncoding {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10); // Strength set as 10
        String encodedPassword = encoder.encode("guest");
        System.out.println(encodedPassword);
    }
}
