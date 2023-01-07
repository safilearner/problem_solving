package com.scaler.bitmanipulation;

public class AddTwoBinaryStrings {

    public static void main(String[] args) {

        AddTwoBinaryStrings add2 = new AddTwoBinaryStrings();
        String A = "1101";
        String B = "101";
        String result = add2.addTwoBinaryStrings(A, B);
        System.out.println(result);
        String result1 = add2.addBinary(A,B);
        System.out.println(result1);
    }

    // First way
    public String addTwoBinaryStrings(String A, String B) {
        // Getting the length of two strings
        int aLength = A.length() - 1;
        int bLength = B.length() - 1;
        int carry = 0;
        String ans = "";

        // Either one is true, repeat the addition operation
        while (aLength >= 0 || bLength >= 0 || carry == 1) {
            int sum = 0;
            if (aLength >= 0) {
                // here subtracting with '0' because charAt will give us ASCII value for corresponding index value character
                sum = sum + A.charAt(aLength) - '0';
                aLength--;
            }
            if (bLength >= 0) {
                sum = sum + B.charAt(bLength) - '0';
                bLength--;
            }
            sum = sum + carry;

            // digit is indirectly performing modulo op which returns the remainder
            int digit = sum % 2;
            // carry is indirectly performing the division op which returns the quotient
            carry = sum / 2;
            ans = digit + ans;
        }
        return ans;
    }

    // Second way
    public String addBinary(String A, String B) {
        // get length of both string
        int aLength = A.length();
        int bLength = B.length();
        int carry = 0;
        String res = "";
        // find max length of the two, so that we can iterate with the max value
        // which means we can iterate till the last element
        int maxLength = Math.max(aLength, bLength);
        for (int i = 0; i < maxLength; i++) {
            // getting the value of the particular index. here we are adding binary values
            // binary is either 1 or 0, charAt will return ASCII value of 1 or 0, which is 49 and 48
            int aIndexValue = i < aLength ? A.charAt(aLength - 1 - i) - '0' : 0;
            int bIndexValue = i < bLength ? B.charAt(bLength - 1 - i) - '0' : 0;

            int tmp = aIndexValue + bIndexValue + carry;

            carry = tmp / 2;
            res = tmp % 2 + res;
        }
        return (carry == 0) ? res : "1" + res;
    }
}
