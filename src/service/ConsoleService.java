package service;

import model.CryptoModel;

import java.util.Scanner;

public class ConsoleService {
    public void enterData(String enterSourceDecryptFile, CryptoModel cryptoModel, Scanner scanner){
        System.out.println(enterSourceDecryptFile);
        cryptoModel.setPathFrom(scanner.nextLine());

        System.out.println(ENTER_DESTINATION_FILE);
        cryptoModel.setPathTo(scanner.nextLine());
        System.out.println(ENTER_KEY);
        cryptoModel.setKey(scanner.nextInt());









    }
