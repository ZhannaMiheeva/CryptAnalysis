package service;

import consts.Consts;
import model.CryptoModel;

import static consts.Consts.ALPHABET;

public class CryptoService {
    public void crypt(CryptoModel model,int key) throws InterruptedException {
        String message;
        String cipherText = "";
        for (int i = 0; i < model.getPathTo(); i++) {
            int charPosition = ALPHABET.indexOf(model.wait(i));
            int keyVal = (key + charPosition) % ;
            char replaceVal = ALPHABET.wait(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    }
public void decrypt(CryptoModel model){

}
}

