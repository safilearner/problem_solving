package com.scaler.Arrays;

import java.util.ArrayList;

public class EquilibriumIndex {
    public static void main(String[] args) {
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        ArrayList<Integer> input = new ArrayList<>();
        //A=[-7, 1, 5, 2, -4, 3, 0]
        input.add(-7);
        input.add(1);
        input.add(5);
        input.add(2);
        input.add(-4);
        input.add(3);
        input.add(0);
        //int result = equilibriumIndex.solveBruteForce(input);
        //System.out.println(result);
        //int result1 = equilibriumIndex.solve(input);
        //System.out.println(result1);
        int[] inputArr = {-9567, 4282, -8150, -507, -4368, 7650, 7834, 5994, 6029, 5977, -8131, 8327, 3421, 9402, -4050,
                7917, -5939, -942, -6335, -2009, 5579, 2814, -2182, 2974, 6038, -7243, -9261, 8571, -74, 5663,
                -1680, -1180, -7929, -5241, -4283, -7102, 8716, -2030, 9839, 4754, 7722, -4286, 3694, 109, -59,
                -7893, -8036, 8136, 704, -7362, 6050, 5782, 1408, -9171, -2858, 9037, -9765, -8160, -8906, 1405, 2724, -1525,
                -3142, -2331, -6559, -6712, 5717, 6692, -2836, 4884, -9282, -8093, -1108, -4037, -6764, 6636, 1113,
                2372, 2314, -863, 5107, 1962, 332, 9255, -952, -3059, -763, -1010, -8148, -4187, -6949, -9266, -6649,
                -1086, -1823, 1172, 7468, 3576, -2651, -2810, 1327, -4869, -2638, -194, 1668, 4050, 4008, 4203, -8614, -4107,
                3707, -4164, 759, -3964, 4149, -8391, -5467, 5070, 6646, 2723, 904, 5479, -3756, 4658, 4062, -9748, -7888, 3846,
                5479, -1837, 9681, 7306, -6371, -8648, -9198, 8204, 1090, -1853, 405, -1200, -4693, 3426, 548, -442, 9966, 9007,
                -4362, 1204, -1166, -8452, -9174, 3597, -2045, -2079, -3192, 4880, -7953, -2939, 7343, 1277, -2347, -2526, 7729,
                -7062, -3200, 9711, -8148, -5192, 2015, -9040, 4451, -2866, -9280, -1428, 1601, -3913, -7821, 2407, -8553, 3208,
                -8036, 5504, 230, 5581, 2992, 4554, -1305, 5040, 1350, 6145, -8674, 1838, -8340, 5663, 5000, 6941, -3385, -4323,
                5479, 5561, 2765, 7494, 2773, 3704, -3010, -636, -3644, -4567, 2449, 3915, -353, -8880, -370, 2873, 9045, 8600,
                6881, 9702, 4767, -587, 4684, 2002, 3471, -6580, -5013, -8027, -3364, -3163, 2114, -6655, 4191, -5744, -4798,
                7604, -2697, -2367, -3678, -4537, -7843, 748, 910, 2253, 2549, -4975, 7251, -2691, 9460, -19, 338, -1454, 4184,
                -4846, 9527, -9705, 6109, -5078, 3366, 5740, -1281, -5422, 6854, 4534, 2823, 9693, -8986, -6408, 4579, -4497,
                -6209, -8900, 5450, -4754, -3622, -3314, -1627, 265, 5987, 8514, -9536, -324, 6247, 1841, 2614, 9397, 3512, -7554,
                1691, 4304, -1112, 3789, 8212, -4595, -729, 5671, -3167, -3448, 6861, -2790, 5387, 2572, -4657, -6065, 565, -2281,
                -8854, -8131, 7003, 5690, 2997, 4270, 1647, 405, -9540, -3289, -8486, -9280, -4131, 1922, 2244, 6311, -3125, 3156,
                -2776, -7586, 6614, 4065, -3392, 336, -5931, -4488, -967, -7013, -1896, 4905, 3854, -352, -2333, 3925, -4450, -2947,
                3731, 3545, -7588, 3047, 7058, -652, -3031, 9708, -5050, 9896, -1990, 7437, 2033, 1836, 1020, 1184, -1879, 6986,
                -1442, 3706, 5075, -3121, -9057, -2218, -3482, 4503, 3820, -6814, -5543, 2953, 5419, -4234, 5083, -7989, -9044,
                4759, 5001, -4816, -1455, -8982, 6230, 3789, 2067, 8913, -7197, -5700, -9605, -8917, 1602, 9068, 6983, -9851, 6490,
                -3681, -4583, 7416, -9859, -4794, -7003, -5078, -6571, 2147, -3032, -3745, 4378, 552, -6223, 1308, 3407,
                -2074, -8225, -9206, -811, 3335, -8321, -2336, -9302, -8629, 1250, 876, -2147, -9869, -684, -4668, 5552,
                1592, -1862, -2060, -6691, 7282, -231, -6022, -8175, 3090, 23, -1629, 4508, -777, 6424, 9660, 5148, 487,
                -8604, -9050, -8296, -5051, 1232, 2182, -5361, -2854, 1218, -7355, -6655, -1729, -5164, -1944, -306,
                -4147, 8714, -6277, 1108, -9160, 7330, -6345, 4768, 2387, 1281, 2193, 9069, 5224, -1424, -5967, -5322,
                8263, 7794, -7210, 4531, 1829, 4972, -3197, 2109, 1927, -7533, -4550, 6185, 4942, 6430, -2290, 9205,
                2406, 4109, 4017, 8010, -4812, 287, 7817, -9775, 8070, 3510, 5722, -7001, -9778, 1177, -7398, 7125,
                -9041, -8945, 8841, 4140, 8770, 1732, 4705, -9492, 2868, -9211, -3526, -4864, -9068, -4073, -5433,
                6376, 7314, 7935, 8647, 2811, -2688, 2510, -1002, -3529, -8859, -3419, 9237, -4087, -9237, 6027,
                -5347, -5957, -3261, -9781, -905, 405, -8287, 2930, -1011, -9123, -7448, -482, 3555, -5767, 9878,
                -7135, 8479, -3306, -6033, 9624, 5480, -3615, 1633, 8225, -1602, 4878, 3622, -7586, -2040, 7472,
                3912, -1787, 4356, 4270, -3100, -3538, -4678, -588, 3346, 6, -8615, -7688, -5733, -6071, -9479,
                9312, 7716, -9107, -9610, -1293, 914, -5513, 7474, -2969, -8765, -8385, -5457, -1915, -5540, -3095,
                -8457, 6298, -8301, 8233, 1029, -4112, 2573, 2999, 9666, -809, 2257, 2203, -3387, 570, 6012, 5346,
                -3049, -9127, -1107, -8724, 6999, -1803, 6059, -7293, 3701, 9062, 4683, -936, 7469, -4921, 4463, -7966,
                6283, 4111, -7324, 2921, -6848, -7417, -4208, 4091, 4538, -5774, 4881, -7206, 5092, -5863, -8729, -4802,
                9619, -2294, 8733, 4161, 7050, -2423, -9985, -2006, 1193, -9158, -3103, 3704, -9680, 5482, 3379, 7462,
                -7796, 7093, -7317, -7236, -1509, -4516, -7529, -5514, 7038, 3530, 5514, 6408, 2528, 3836, 2356, -6926,
                -5410, -5950, -8132, 2058, -6010, -978, -4080, -5457, 4366, -6540, 9812, -5810, 6537, -9194, -5296, 6306, -5225,
                -3031, -7157, 9866, 3675, 9126, -7522, 5244, -295, -5015, -2796, -6973, -2139, 7290, -3673, -2610,
                -7329, -810, 8879, 3250, -6699, 500, -960, 5795, -6513, 6157, -5470, 8876, -3657, 2257, 2402, -7110,
                5820, -7334, 2321, -3148, 6831, -7754, 2049, -6758, 5024, 6154, -6541, -6987, -7337, 7168, 546,
                -8561, 4313, 7753, 2398, -7691, -3355, 5309, 6411, -5404};
        ArrayList<Integer> aList = new ArrayList<>();
        System.out.println(inputArr.length);
        for (int X : inputArr) {
            aList.add(X);
        }
        int result2 = equilibriumIndex.solve3(aList);
        System.out.println(result2);
    }

    //O(N*N)
    //Sum of elements before i and sum of elements after i should be equal
    public int solveBruteForce(ArrayList<Integer> A) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            int left_sum = 0;
            int right_sum = 0;
            for (int j = 0; j <= i; j++) {
                left_sum += A.get(j);
            }
            for (int k = i; k < N; k++) {
                right_sum += A.get(k);
            }
            if (left_sum == right_sum) {
                return i;
            }
        }
        return -1;
    }

    // TODO: 10/16/2022 Not Working
    //Time Complexity - O(N)
    //Space Complexity - O(N)
    // Need to check this
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        //Creating Prefix Sum from L-R
        ArrayList<Integer> leftPrefixSum = new ArrayList<>();
        leftPrefixSum.add(0, A.get(0));
        for (int i = 1; i < N; i++) {
            leftPrefixSum.add(i, leftPrefixSum.get(i - 1) + A.get(i));
        }
        ArrayList<Integer> rightPrefixSum = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            rightPrefixSum.add(0);
        }
        //Creating Prefix Sum from R-L
        rightPrefixSum.set(N - 1, A.get(N - 1));
        System.out.println(rightPrefixSum.get(N - 1));
        for (int i = N - 2; i >= 0; i--) {
            rightPrefixSum.set(i, rightPrefixSum.get(i + 1) + A.get(i));
        }
        for (int i = 0; i < N; i++) {
            if (leftPrefixSum.get(i) == rightPrefixSum.get(i)) {
                return i;
            }
        }
        return -1;
    }

    // TODO: 10/16/2022
    // Scaler TA Solution
    //Need to understand this prefix solution
    //O(N)TC and O(N) SC because of prefix array
    public int solve2(ArrayList<Integer> A) {
        int N = A.size();
        //Creating Prefix Sum from L-R
        ArrayList<Integer> leftPrefixSum = new ArrayList<>();
        leftPrefixSum.add(0, A.get(0));
        for (int i = 1; i < N; i++) {
            leftPrefixSum.add(i, leftPrefixSum.get(i - 1) + A.get(i));
        }
        // Finding right sum, from 1 to N-1, if the sum is zero,then return zero
        // because for index 0, sum on the left is considered 0 for equilibrium index
        if ((leftPrefixSum.get(N - 1) - leftPrefixSum.get(0)) == 0) {
            return 0;
        }
        // If N - 2 is zero after performing prefix sum
        // which will be equal to sum on the right side of N-1, so return N - 1
        // Here we are doing left sum
        if (leftPrefixSum.get(N - 2) == 0) {
            return N - 1;
        }
        //Iterating from i = 1, because to avoid edge case
        for (int i = 1; i < N - 1; i++) {
            // To check equilibrium in a prefix sum, we can check the value of i-1th index and
            // value of (N-1 - i) should be equal
            int sum_right = leftPrefixSum.get(N - 1) - leftPrefixSum.get(i);
            int sum_left = leftPrefixSum.get(i - 1);
            if (sum_right == sum_left) {
                return i;
            }
        }
        return -1;
    }

    //Another Solution
    //Preferred
    //O(N) TC and O(1) SC
    public int solve3(ArrayList<Integer> A) {
        int N = A.size();
        int sum = 0;
        int left_sum = 0;
        //find total sum
        for (int i = 0; i < N; i++) {
            sum = sum + A.get(i);
        }
        for (int i = 0; i < N; i++) {
            // subtract the current element from sum,
            // so that we can check whether the index of current element is equilibrium index or not
            // subtracting the current element will give the sum of previous element
            sum = sum - A.get(i);
            if (left_sum == sum) {
                return i;
            }
            left_sum = left_sum + A.get(i);
        }
        return -1;
    }

}
