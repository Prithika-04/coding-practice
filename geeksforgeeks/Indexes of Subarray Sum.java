class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        int start = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while(sum > target) {
                sum -= arr[start];
                start++;
            }

            if(sum == target) {
                res.add(start + 1);
                res.add(i + 1);
                return res;
            }
        }

        res.add(-1);
        return res;
    }
}
