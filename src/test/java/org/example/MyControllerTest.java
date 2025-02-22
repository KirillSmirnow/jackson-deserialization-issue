package org.example;

import jakarta.servlet.ServletException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@SpringBootTest
@AutoConfigureMockMvc
public class MyControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @SneakyThrows
    public void givenRequestObject_whenSendRequest_thenInternalServerError() {
        Exception exception = assertThrows(ServletException.class, () -> {
            mvc.perform(post("/abc").contentType(MediaType.APPLICATION_JSON).content("{}"))
                    .andExpect(status().isInternalServerError());
        });
        exception.printStackTrace();
    }
}
