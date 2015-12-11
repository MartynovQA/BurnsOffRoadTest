package common.tools;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by matcievskiy on 16.04.2015.
 */
public class Randomizer {

    public static char [] chars =  "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static String randomEmail(int length){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String random_email = null;
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];

            random_email = sb.append(c).toString();
        }
        return random_email.concat("@"+random_email+".com");
    }

    public static String randomString(int length){

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String random_string= null;
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];

            random_string = sb.append(c).toString();
        }
        return random_string;

    }

    public static String randomPhoneNumber(){

        Random rand = new Random();
        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(10000);

        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
        DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

        String phoneNumber = df3.format(num1) + "-" + df3.format(num2) + "-" + df4.format(num3);
        return  phoneNumber;
    }


    public static int randomNumber(int length){

        Random rand = new Random();
        int random_index = rand.nextInt((length-1)+1);
        return  random_index;
    }
}
