class Solution {
    public String reverseWords(String s) {
        // Split the input string into words using one or more spaces as the delimiter
        String[] words = s.trim().split("\\s+");
        
        // Reverse the order of the words using a two-pointer approach
        int left = 0;  // Initialize the left pointer to the beginning of the array
        int right = words.length - 1;  // Initialize the right pointer to the end of the array
        while (left < right) {
            // Swap the words at the left and right pointers
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            
            // Move the pointers towards each other
            left++;
            right--;
        }
        
        // Join the reversed words with a single space between them
        return String.join(" ", words);
    }
}
/*
Example Input: s = " hello world "

1) String[] words = s.trim().split("\\s+");: This line first trims the input string to remove leading and trailing spaces, resulting in "hello world" as the trimmed string. 
Then, it uses the split("\\s+") method to split the trimmed string into an array of words, using one or more spaces as the delimiter. So, the words array will be ["hello", "world"].

2) int left = 0; int right = words.length - 1;: This code initializes two pointers, left and right, to the beginning and end of the words array, respectively. In our example, left is initially 0, and right is 1.

3) while (left < right): This is a while loop that continues as long as left is less than right. It's used to reverse the order of words in the words array.

4) Inside the loop:

String temp = words[left]; stores the word at the left pointer in a temporary variable temp.
words[left] = words[right]; assigns the word at the right pointer to the left position in the array.
words[right] = temp; assigns the value of temp (the word originally at the left position) to the right position.
left++; increments the left pointer, and right--; decrements the right pointer, effectively moving them towards each other.
5) After the loop, the words array will be reversed, so it will be ["world", "hello"].

6) String.join(" ", words); joins the reversed words in the words array with a single space between them, creating the final output string. In our example, it returns "world hello". */