// import java.util.Scanner;

// public class ReverseVowels {
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String");
//          String str = sc.nextLine();

//          vowels(str);


// }

// static void vowels(String str){
//     char[] s = str.toCharArray();
    
//     int i= 0;
//     int j= s.length-1;

//     while(i<j){
//         while(s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u'){
//             j--;
//         }
//         if(i>=j){
//             break;
//         }
//         char ch = s[i];
//         s[i] = s[j];
//         s[j] = ch;
//         i++;
//         j--;

//     }
//     for(char ch:s){
//         System.out.print(ch);
//     }

// }
// }



import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        vowels(str);
    }

    static void vowels(String str) {
        char[] s = str.toCharArray();

        int i = 0;
        int j = s.length - 1;

        while (i < j) {

            // move i until vowel found
            while (i < j && !isVowel(s[i])) {
                i++;
            }

            // move j until vowel found
            while (i < j && !isVowel(s[j])) {
                j--;
            }

            if (i < j) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
        }

        // print result
        for (char ch : s) {
            System.out.print(ch);
        }
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}
