class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int n : nums) {
            heap.add(n);

            if (heap.size() > k) {
                heap.poll();//remove the root element (lowest of all)
            }
        }
        return heap.peek();//finally heap has k largest elements left with root as the kth largest element
    }
}