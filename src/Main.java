import model.CryptoModel;
import service.CryptoService;

import java.util.Scanner;

public class Main {

    public static final String ENTER_KEY = "Введите ключ";
    public static final String ENTER_DESTINATION_FILE = "Введите имя файла куда сложить результат";
    public static final String ENTER_SOURCE_DECRYPT_FILE = "Введите имя файла, который нужно расшифровать ";
    public static final String ENTER_SOURCE_CRYPT_FILE = "Введите имя файла,который нужно зашифровать";


    public static void main(String[] args, int key) {


        CryptoModel cryptoModel = new CryptoModel();
        CryptoService cryptoService = new CryptoService();
        int value = 1;
        Scanner scanner = new Scanner(System.in);
        switch (value) {
            case 1: {
                enterData(ENTER_SOURCE_CRYPT_FILE, cryptoModel, scanner);
                cryptoService.crypt(cryptoModel);

                break;
            }

            case 2: {

                enterData(ENTER_SOURCE_DECRYPT_FILE, cryptoModel, scanner);
                cryptoService.decrypt(cryptoModel);

            }


        }
    }
}

