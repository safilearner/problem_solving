package com.samples;

public class TC1 {
    public static void solve() {
        int i = 1;
        int n = 5;
        while (i < n) {
            int x = i;
            while (x-- > 0) {
                System.out.println(x--);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
