package chapter3basicjava;

public class OMG {
    public static void main(String[] args) {
        String orignalMessage = "oh my god! I lost my high school backpack. " +
                "you may laugh out loud but this a very big deal. in case you didn't know. just for your information.";

        String str1 = orignalMessage.replaceAll("oh my god", "OMG");
        String str2 = str1.replaceAll("high school", "HS");
        String str3 = str2.replaceAll("laugh out loud", "LOL");
        String str4 = str3.replaceAll("Very big deal", "VBD");
        String str5 = str4.replaceAll("in case ypu didn;t know", "INCYDK");
        String str6 = str5.replaceAll("for your infromation", "FYI");
        System.out.println("ORIG " + orignalMessage);
        System.out.println("STR1: " + str1);
        System.out.println("STR2: " + str2);
        System.out.println("STR3: " + str4);
        System.out.println("STR4: " + str5);
        System.out.println("STR5: " + str5);
        System.out.println("STR6: " + str6);
    }

}
