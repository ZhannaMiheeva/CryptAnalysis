package consts;

import java.nio.file.StandardOpenOption;

public class Consts {

    public static final String ENTER_KEY = "Введите ключ";
    public static final String ENTER_DESTINATION_FILE = "Введите имя файла куда сложить результат";
    public static final String ENTER_SOURCE_DECRYPT_FILE = "Введите имя файла, который нужно расшифровать ";
    public static final String ENTER_SOURCE_CRYPT_FILE = "Введите имя файла,который нужно зашифровать";
    public static final char[] ALPHABET =
            {'а', 'б', 'в', 'г', 'д', 'е',
            'ж', 'з', 'и','к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т',
            'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я','0','1','2','3','4','5','6','7'
                    ,'8','9',' ','!','@','#','$','%'
                    ,'^','&','*','(',')','<','>','?'};
    public static final StandardOpenOption[] FILE_WRITE_OPTIONS = {StandardOpenOption.CREATE, StandardOpenOption.APPEND};
}

