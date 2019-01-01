public class Solution{
    public static class MyQueue<T> {
        // Stack newest is reversed
        private Stack<T> stackNewestOnTop = new Stack<T>();
        private Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value){ // Add Item
            stackNewestOnTop.push(value);
        }

        public T peek() { // Get 'Oldest' Item
            // move elements from StackNewest to StackOldest
           return stackOldestOnTop.peek();
            // move elements back
        }

        private void shiftStacks() {
            if(stackOldestOnTop.isEmpty()){
                while(!stackNewestOnTop.isEmpty()){
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

        public T dequeue() { // Get 'Oldest' item and remove it
            // move elements from stackNewest to stackOldest
            return stackOldestOnTop.pop();
            // move elements back
        }
    }
}