class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0; // Intialise one pointer pointing on popped array

        for(int i=0; i < pushed.length; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[j]){// if st.peek() values equal to popped[j];
                stack.pop();// then pop out
                j++;
            }
        }
        return stack.isEmpty();// check if stack is empty return true else false
    }
}