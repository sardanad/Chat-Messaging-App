package com.example.chatmessagingapp;

import com.example.chatmessagingapp.utilities.EncryptionManager;

import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptionManagerTest {

    private final EncryptionManager manager = new EncryptionManager();

    @Test
    public void testHelloWorld() {
        String original = "Hello, World!";
        String encrypted = manager.encryptMessage(original);
        String decrypted = manager.decryptMessage(encrypted);
        assertEquals(original, decrypted);
    }

    @Test
    public void testNonAlphabeticCharacters() {
        String original = "1234567890!@#$%^&*()";
        String encrypted = manager.encryptMessage(original);
        String decrypted = manager.decryptMessage(encrypted);
        assertEquals(original, decrypted);
    }

    @Test
    public void testMixedCaseAlphabets() {
        String original = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        String encrypted = manager.encryptMessage(original);
        String decrypted = manager.decryptMessage(encrypted);
        assertEquals(original, decrypted);
    }

    @Test
    public void testWrapAroundAlphabet() {
        String original = "xyzXYZ";
        String encrypted = manager.encryptMessage(original);
        String decrypted = manager.decryptMessage(encrypted);
        assertEquals(original, decrypted);
    }
}
