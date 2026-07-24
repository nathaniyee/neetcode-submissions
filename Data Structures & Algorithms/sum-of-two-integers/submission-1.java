class Solution {
    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        else if (a == 0) {
            return b;
        }
        return (a ^ b) + ((a & b) << 1);
    }
}
