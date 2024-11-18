public class StringConcantenation{
    public static String concatenatedStrings(String str1, String str2, String str3){
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        char [] str4 = new char{len1 + len2 + len3};

        int i = 0;
        while (i < len1){
            str3[i] = str1.charAt(j);
            i++;
        }
        int j = 0;
        while (j < len1+len2){
            str3[i] = str2.charAt(j);
            i++;
            j++;
        }
        int k = 0;
        while (k < len1 + len2 + len3){
            str3 [i] = str3.charAt(k);
            i++;
            j++;
            k++
        }

        return new String(str4);
    }
    
    public static void main(String[] args){
        String str1 = "Christian";
        String str2 = "Chavez";
        String str3 = "Sabido";

        String concatenatedString = concatenatedStrings(str1, str2, str3);
        System.out.println("Concatenated String: " + concatenatedString);
        

    }


}