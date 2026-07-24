class Solution {
    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        else if (a == 0) {
            return b;
        }
        int carry =  a & b;
        int result = a ^ b;
        while(carry != 0) {
            int shiftedcarry = carry << 1;
            carry = result & shiftedcarry;
            result ^= shiftedcarry;
        }
        return result;
    }
}
