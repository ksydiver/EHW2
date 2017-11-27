package epamtasks3.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class RusEng {
    static ResourceBundle ResourceBundle;
    static String EnResourceFileName = "eng.properties";
    static String RuResourceFileName = "rus.properties";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(
                    "Choose your locale\\Выберите язык: \nPress 1 for English;\nНажмите 2 для отображения на русском.");
            String  tmpBr    = bufferedReader.readLine();
            Integer localNum = Integer.parseInt(tmpBr);

            if (localNum == 1) {
                doEnChoice(bufferedReader, EnResourceFileName);
            } else if (localNum == 2) {
                doRuChoice(bufferedReader, RuResourceFileName);
            } else {
                doEnChoice(bufferedReader, EnResourceFileName);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * method for english users
     *
     * @param bufferedReader taken from main method's try block
     * @param fileName       automaticaly choosen resource file with needed locale
     * @throws IOException
     */
    private static void doEnChoice(BufferedReader bufferedReader, String fileName) throws IOException {
        ResourceBundle = ResourceBundle.getBundle(EnResourceFileName, Locale.ENGLISH);
        System.out.println("Please input number of question you want to answer for you from 1-3:");
        System.out.println("Question 1 ?");
        System.out.println("Question 2 ?");
        System.out.println("Question 3 ?");
        System.out.println("exit for exit.");

        readIntFromUser(bufferedReader, fileName);

    }

    /**
     *
     * @param bufferedReader taken from main method's try block
     * @param fileName       automaticaly choosen resource file with needed locale
     * @throws IOException
     */
    private static void doRuChoice(BufferedReader bufferedReader, String fileName) throws IOException {
        ResourceBundle = ResourceBundle.getBundle(RuResourceFileName, Locale.forLanguageTag("RUS"));
        System.out.println("Пожалуйста введите номер вопроса, чтобы узнать ответ от 1-3:");
        System.out.println("Вопрос 1 ?");
        System.out.println("Вопрос 2 ?");
        System.out.println("Вопрос 3 ?");

        readIntFromUser(bufferedReader, fileName);
    }

    /**
     *
     * @param bufferedReader taken from do..Choice method
     * @param numQ           - question taken from do..Choice method
     * @throws IOException
     */
    private static void readIntFromUser(BufferedReader bufferedReader, String numQ) throws IOException {
        System.out.println(ResourceBundle.getString(numQ));
    }
}
