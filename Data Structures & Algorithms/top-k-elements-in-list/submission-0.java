class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //Initializing all data structures
        int[] result = new int[k];
        HashMap<Integer, Integer> counts = new HashMap<>();
        ArrayList<Integer>[] frequencies = new ArrayList[nums.length + 1];

        for (int i = 0; i < frequencies.length; i++) {
            frequencies[i] = new ArrayList<>();
        }


        //Creating HashMap of Number, Count
        for (int i : nums) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }

        //Essentially sorting by counts
        for (Integer key : counts.keySet()) {
            int count = counts.get(key);
            frequencies[count].add(key);
        }

        int index = 0;
        for (int i = frequencies.length - 1; i >= 0 && index < k; i--) {
            for (int number : frequencies[i]) {
                result[index] = number;
                index++;
                if (index == k) {
                    return result;
                }
            }
        }

        return result;








    }
}
