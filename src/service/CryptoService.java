package service;

import exception.FileProcessingException;
import exception.FileProcessor;
import model.CryptoModel;

import static consts.Consts.ALPHABET;


public class CryptoService {
    public void crypt(CryptoModel model) throws FileProcessingException {
        StringBuilder encryptedMessage = new StringBuilder();
        FileProcessor fileProcessor = new FileProcessor();
        String message = fileProcessor.readFile(model.getPathFrom());
        int index, encryptedIndex;
        for (char c : message.toCharArray()) {
            index = indexOfChar(c);
            if (index != -1) {
                encryptedIndex = (index + model.getKey()) % ALPHABET.length;
                encryptedMessage.append(ALPHABET[encryptedIndex]);
            } else {
                encryptedMessage.append(c);
            }
            fileProcessor.writeFile(model.getPathTo(), encryptedMessage.toString());
        }
    }

    public void decrypt(CryptoModel model) throws FileProcessingException {
        int key = model.getKey();
        model.setKey(-key + ALPHABET.length);
        crypt(model);
        model.setKey(key);
    }


    private static int indexOfChar(char c) {
        for (int i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == c) {
                return i;
            }
        }
        return -1;
    }



    public  String bruteForce(CryptoModel model) throws FileProcessingException {
        int spaceCounter = 1,
                spaceMax = 1,
                keyResult = 1;
        char[] charArr;
        FileProcessor fileProcessor = new FileProcessor();
        String decryptMessage  = fileProcessor.readFile(model.getPathFrom());
        int key = 0;

        for ( key = 0; key < ALPHABET.length; key++) {
            decryptMessage = decrypt();

            charArr = decryptMessage.toCharArray();

            for (char c : charArr) {
                if (c == ' ') {
                    spaceCounter++;
                }
            }
            if (spaceCounter > spaceMax) {
                spaceMax = spaceCounter;
                keyResult = key;
            }
            spaceCounter = 0;
        }
        decryptMessage = fileProcessor.writeFile(model.getPathTo(),keyResult);
        return decryptMessage;

    }
}


