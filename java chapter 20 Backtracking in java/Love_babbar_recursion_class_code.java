public class Love_babbar_recursion_class_code {
    // Recursion class 1
    // factorial
    // counting from 1 to n
    // counting from n to 1
    // fibonacci series
    // 2^(x) = 2*2^(x-1)
    // Sum of First n natural number

    // ................................................................................................
    // Head recursion
    // Tail recursion
    // print elements of array using Recursion
    // search of a element in an array
    // minimum element of an array
    // maximum element of an array
    // Print all odd numbers in an array
    // print all even numbers in an array
    // binary search
    // print all the digits of the number
    // array is sorted or not
    // ................................................................................

    // sum of n natural number
    public static int get_sum(int n) {
        // it will provide me the sum of first n natural number
        // base case
        if (n == 1) {
            return 1;
        } else {
            // recursive call
            int recursion_ka_ans = get_sum(n - 1);
            int final_ans = n + recursion_ka_ans;
            return final_ans;
            // processing
        }
    }

    // Maximum element of an array
    public static int Max_of_an_array(int arr[], int si, int maxi) {
        int n = arr.length; // length of an array
        if (si == n - 1) { // base case
            return maxi;
        }
        maxi = Math.max(arr[si], maxi);
        int ans = Max_of_an_array(arr, si + 1, maxi);
        return ans;
    }

    // Minimum element of an array
    public static int Min_of_an_array(int arr[], int si, int mini) {
        int n = arr.length; // length of an array
        if (si == n - 1) { // base case
            return mini;
        }
        mini = Math.min(arr[si], mini);
        int ans = Min_of_an_array(arr, si + 1, mini);
        return ans;
    }

    // odd number
    public static void print_odd_number(int arr[], int si) {
        if (si == arr.length) {
            return;
        }

        if (arr[si] % 2 != 0) {
            System.out.print(arr[si] + " ");
        }

        print_odd_number(arr, si + 1);
    }

    // even number
    public static void print_even_number(int arr[], int si, int arr1[], int siarr1) {
        if (si == arr.length) {
            return;
        }

        if (arr[si] % 2 == 0) {
            // System.out.print(arr[si]+" ");
            arr1[siarr1] = arr[si];
            siarr1++;

        }

        print_even_number(arr, si + 1, arr1, siarr1);
    }

    // binary search using recursion
    public static int binary_search_using_recursion(int arr[], int si, int ei, int target) {
        if (si > ei) {
            // element not found
            return -1;
        }
        int mid = (si + ei) / 2; // middle element of an array
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) { // movement is in right direction
            return binary_search_using_recursion(arr, mid + 1, ei, target);
        } else {
            // left
            return binary_search_using_recursion(arr, si, mid - 1, target);
        }
    }

    // print all the digits of the number
    public static void print_digits(int num) {
        if (num == 0) {
            return; // base case of recursion
        }
        int digit = num % 10; // we get the digit here
        // System.out.println(digit);
        num = num / 10;
        print_digits(num);
        System.out.print(digit + " ");

    }

    // Function to check wheather the array is sorted or not
    public static boolean check_arr_sort_or_not(int arr[], int i) {
        // base case
        if (i == arr.length - 1) { // last element of an array is aT index arr.length-1
            // array with single element is considered as sorted in nature ............
            return true;
        }
        // recursion
        if (arr[i] > arr[i + 1]) { // array is not sorted
            return false;
        } else {
            return check_arr_sort_or_not(arr, i + 1);
        }
    }

    // i have to print all the subsequence of the string that is my task
    public static void print_subsequences(String str, int i, String output) {

        // base case
        if (i == str.length()) {
            if (output.equals("")) { // Equals function
                System.out.println("NULL");
            }
            System.out.println(output);
            return;
        }

        char ch = str.charAt(i);

        // include the character ch
        // output = output+ch;
        print_subsequences(str, i + 1, output + ch);

        // exclude the character ch
        // output = output
        print_subsequences(str, i + 1, output);
    }

    // House robber
    public static int house_robber(int arr[], int i) {
        // base case
        if (i >= arr.length) {
            return 0;
        }
        // include
        int includeAns = arr[i] + house_robber(arr, i + 2);
        // exclude
        int excludeAns = 0 + house_robber(arr, i + 1);
        // Maximum money
        int finalAns = Math.max(includeAns, excludeAns);
        return finalAns;
    }

    // Minimum no of coins required for the amount
    public static int min_coins(int coin[], int amount) {
        // if the amount is equal to 0 then 0 coins are required
        if (amount == 0) {
            return 0; // base case
        }
        // we need to find the minimum no of coins
        int min_coins = Integer.MAX_VALUE; // conventional method
        // for each amount we need to travel to entire arr of coin
        for (int i = 0; i < coin.length; i++) {
            int coins = coin[i];
            // int amt = amount ;
            // Always the amount is greater than the value of the coin
            // if(amount>=coin value )then we need to call the recursive function
            // if(amount<coin value )then we need not to call the recursive function
            if (amount >= coin[i]) {
                int recursion_ans = min_coins(coin, amount - coin[i]);
                // valid answer
                if (recursion_ans != Integer.MAX_VALUE) {
                    int ans = 1 + recursion_ans;
                    min_coins = Math.min(ans, min_coins);
                }
            }
        }
        return min_coins;
    }

    public static int coint_problem(int arr[], int amount) {
        int ans = min_coins(arr, amount);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }
    // This works correctly when there are no valid combinations. However, your
    // recursive approach might incorrectly return 0 in cases where no combination
    // is possible because you're not handling scenarios where amount - nums[i]
    // becomes negative.

    public static void main(String[] args) {
        // System.out.println(get_sum(5)); // 5+4+3+2+1= 15
        // int arr[]={100,20,30,50,40};
        // System.out.println(Max_of_an_array(arr, 0,arr[0])); // 5+4+3+2+1= 15
        // System.out.println(Min_of_an_array(arr, 0, arr[0])); // 5+4+3+2+1= 15
        // int arr1[] = {1,2,3,4,5,6,7,8,9,10}; // monotonic array is must for binary
        // search
        // int arr_store[] = new int [arr1.length/2+1];
        // print_odd_number(arr1, 0);
        // System.out.println();
        // print_even_number(arr1, 0,arr_store,0);
        //
        // System.out.println(binary_search_using_recursion(arr1, 0, arr1.length-1, 9));
        // // 8
        // System.out.println(binary_search_using_recursion(arr1, 0, arr1.length-1, 8));
        // // 7
        // System.out.println(binary_search_using_recursion(arr1, 0, arr1.length-1, 7));
        // // 6
        // System.out.println(binary_search_using_recursion(arr1, 0, arr1.length-1, 6));
        // // 5
        // System.out.println(binary_search_using_recursion(arr1, 0, arr1.length-1, 5));
        // // 4
        // System.out.println(binary_search_using_recursion(arr1, 0, arr1.length-1, 4));
        // // 3
        // System.out.println(binary_search_using_recursion(arr1, 0, arr1.length-1,
        // 40)); // -1

        // print_digits(321);

        // int arr[] = {1,2,3,4,4};
        // System.out.println(check_arr_sort_or_not(arr,0)); // false

        // String str = "abc";
        // String output = "";
        // print_subsequences(str,0,output);

        // int arr[] = {2,7,9,3,1};
        // System.out.println(house_robber(arr, 0)); // 12

        int arr[] = { 1, 2, 5 };
        System.out.println(coint_problem(arr, 11));

    }
}