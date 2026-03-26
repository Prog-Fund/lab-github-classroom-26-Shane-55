package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagePostTest {
    MessagePost messagePost1;
    MessagePost messagePost2;
    MessagePost messagePost3;


    @BeforeEach
    void setUp() {
       messagePost1 = new MessagePost("Mary", "Hi there.");
       messagePost2 = new MessagePost("John", "I'm on my way.");
       messagePost3 = new MessagePost("aa", "long message.");
    }

    @AfterEach
    void tearDown() {
        messagePost1 = null;
        messagePost2 = null;
        messagePost3 = null;
    }

    @Test
    void setMessage() {
        assertEquals("Hi there." ,messagePost1.getMessage());
        assertEquals("I'm on my way." ,messagePost2.getMessage());
        assertEquals("example of a long message" ,messagePost3.getMessage());

        messagePost1.setMessage("Bye Bye");
        messagePost2.setMessage("Wait.. Wait..");
        messagePost3.setMessage("this message is too longgggggggggg");
        assertEquals("Bye Bye", messagePost1.getMessage());
        assertEquals("Wait.. Wait..", messagePost2.getMessage());
      }
}