import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов

        double x = 0.4d;

        String str5 = ";" + 124124 + x + ";";

        String str6 = str1.concat(String.valueOf(x));

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come
        System.out.println(str5);
        System.out.println(str6);

        System.out.println(String.join(str5, str1, str3, str4, str6));

        String str7 = "Hello World";
        String str8 = "I work";
        boolean result = str7.regionMatches(true,6, str8, 2, 3);
        System.out.println(result); // true

        String text = "FIFA will never regret it";
        String[] words = text.split("e");
        System.out.println(words[1]);
        for(String word : words){
            if (word.equals("v")) {
                System.out.println("ГОООЛ");
            }
            System.out.println(word);
        }

        String text1 = "FIFA wi?ll!never,regret.it";
        String[] words1 = text1.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words1){
            System.out.println(word);
        }

        String input = "++12343454556";
        boolean results = input.matches("(\\+)\\d{11}");
        if(results){
            System.out.println("It is a phone number");
        }
        else{
            System.out.println("It is not a phone number!");
        }

        String inputText = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("Java(\\w*)");
        Matcher matcher = pattern.matcher(inputText);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }




        String newStr = matcher.replaceAll("HTML");
        System.out.println(newStr); // Hello HTML! Hello HTML! HTML 8.

        String myStr = inputText.replaceAll("Java(\\w*)", "HTML");
        System.out.println(myStr); // Hello HTML! Hello HTML! HTML 8.

        Pattern patternNew = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] wordsNew = patternNew.split(inputText);
        for(String word:wordsNew)
            System.out.println(word);


        // TODO: проверить почему не выполняется условие
        String inputEx = "a";
        boolean resultsEX = Pattern.matches("a-z && [\\^bc]", inputEx);
        if(resultsEX){
            System.out.println("Слово корректно");
        }
        else{
            System.out.println("Слово некорректно!");
        }



    }
}
