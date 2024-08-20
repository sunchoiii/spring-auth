package org.sparta.springauth;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.springauth.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food;


    @Test
    @DisplayName("Primary 와 Qualifier 우선순위 확인 - Qualifier 위")
    void test1() {
        food.eat();
    }

}
