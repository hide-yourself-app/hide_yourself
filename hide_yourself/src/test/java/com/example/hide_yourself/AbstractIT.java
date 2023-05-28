package com.example.hide_yourself;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HideYourselfApplication.class)
@AutoConfigureWebTestClient
@ActiveProfiles("test")
public abstract class AbstractIT {
    @BeforeEach
    void setUp() {

    }
}
