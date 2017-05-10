package com.wrh.controller;

import org.junit.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * HelloController Tester.
 *
 * @author <Authors name>
 * @since <pre>五月 10, 2017</pre>
 * @version 1.0
 */
public class HelloControllerTest {

    /**
     *
     * Method: sayHello()
     *
     */
    @Test
    public void testSayHello() throws Exception {
//TODO: Test goes here...
        HelloController helloController = new HelloController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/hello.do")).andExpect(view().name("hello"));
    }


}
