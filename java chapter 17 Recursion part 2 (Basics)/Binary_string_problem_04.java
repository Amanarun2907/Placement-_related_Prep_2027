public class Binary_string_problem_04 {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        // we are using string for this not string builder for this .........
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // as we have to print binary string so the return type of the function is void
        if (lastPlace == 0) {
            // str.append("0"); // adding "0" to the string
            // sit 0 on chair n
            // with 0 both the option are available as we take 1 or 0
            printBinStrings(n - 1, 0, str + "0");
            printBinStrings(n - 1, 1, str + "1");
        } else {
            printBinStrings(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        printBinStrings(3, 0, "");
    }
}
// problem statement : Print all the binary String of size n without consicutive ones
// paytm
// Creation of binary string 
