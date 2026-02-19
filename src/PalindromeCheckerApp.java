public class PalindromeCheckerApp {
    public static void main(String args[]) {
        System.out.println("jai shree ram,\n" +
                "Welcome to the Palindrome Checker App\nSystem Intialised Successfully");
        String str = "dad";
        int n = str.length();
        int flag = 0;
        for(int i = 0;i<n/2;i++) {
            if (str.charAt(i)!=str.charAt(n-1-i)){
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("String is not the Palindrome ");
        }
        else {
            System.out.println("String is the Palindrome");

        }

    }
