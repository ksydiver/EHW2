package epamtasks4.task1;

import java.util.Map;

public class JavaByteKeyWordsParser {
    String[] reservedJavaWords;

    public static void main(String[] args) {
        // declare & initiate filenames
        String reservedJavaWordsFileName = "javareservedwords.txt";
        String javaFileName              =  JavaKeyWordsInFileParser.class.getName();
        String outputFileName            = "outputFile.txt";

        // initiate my parserPlus class object
        JavaKeyWordsInFileParser parserPlus = new  JavaKeyWordsInFileParser();

        // store map with keywords & theirs count
        Map<String, Integer> resultInformation =
                parserPlus.transmitJavaWordsCount(reservedJavaWordsFileName, outputFileName, javaFileName);
        for (Map.Entry entry : resultInformation.entrySet()) {
            String tmpStr = "В файле " + javaFileName + " встречается " + entry.getValue() + " ключевое слово " +
                    entry.getKey();
            System.out.println(tmpStr);
        }
    }
}
