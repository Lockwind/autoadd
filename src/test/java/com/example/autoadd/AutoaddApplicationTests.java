package com.example.autoadd;

import com.example.autoadd.domain.buoy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoaddApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(new buoy());
    }

}
