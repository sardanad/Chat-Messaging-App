package com.example.chatmessagingapp.utilities;

public class EncryptionManager {
    private final int shift = 4;

    private char shiftCharacter(char character, int shift) {
        if (Character.isLetter(character)) {
            char base = Character.isUpperCase(character) ? 'A' : 'a';
            int alphabetSize = 26;

            // Correctly calculate the new character considering the case and ensuring it wraps around the alphabet
            return (char) ((character - base + shift + alphabetSize) % alphabetSize + base);
        }
        return character; // Non-alphabetic characters are not changed
    }

    public String encryptMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new RuntimeException("Message cannot be null or empty");
        }

        StringBuilder encryptedMessage = new StringBuilder();
        for (char character : message.toCharArray()) {
            encryptedMessage.append(shiftCharacter(character, shift));
        }

        return encryptedMessage.toString();
    }

    public String decryptMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new RuntimeException("Message cannot be null or empty");
        }

        StringBuilder decryptedMessage = new StringBuilder();
        for (char character : message.toCharArray()) {
            decryptedMessage.append(shiftCharacter(character, -shift));
        }

        return decryptedMessage.toString();
    }
}
