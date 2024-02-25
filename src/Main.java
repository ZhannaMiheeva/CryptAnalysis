import model.CryptoModel;
import service.ConsoleService;
import service.CryptoService;

import java.util.Scanner;

import static consts.Consts.ENTER_SOURCE_DECRYPT_FILE;

public class Main {
    public static void main(String[] args, int key) {
          Scanner scanner = new Scanner(System.in);
        ConsoleService consoleService = new ConsoleService(scanner);
        CryptoModel cryptoModel = new CryptoModel();
        CryptoService cryptoService = new CryptoService();
        int value = 1;

        switch (value) {
            case 1: {
            consoleService.enterData(ENTER_SOURCE_DECRYPT_FILE, cryptoModel, scanner);
            cryptoService.crypt(cryptoModel);
                break;
            }
            case 2: {
            consoleService.enterData(ENTER_SOURCE_DECRYPT_FILE, cryptoModel, scanner);
            cryptoService.decrypt(cryptoModel);
            break;
            }


            default:
                throw new IllegalStateException("Unexpected value: " + value);
        }
    }
}

