public class detectCycle {
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // 🔁 Creating cycle: 5 → 3
        head.next.next.next.next.next = head.next.next;

        boolean result = hasCycle(head);
        System.out.println("Cycle exists: " + result);
    }
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
            return true;
        }
        
        }
        return false;
    }
}
