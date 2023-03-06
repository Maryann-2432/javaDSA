 //Question One
public class MmustLinkedIn {
    private class Node{
        private string data;
        private Node next;
     public Node(string data){
         this.data=data;
         this.next=null;
     }
     setData(newData){
       next=nextvalue;
    }
    private Node head;
    public MmustLinkedIn(){
        this.head=null;
    }
    public void addNode(string data){
        Node newNode=newNode(data);
        if(this.head==null)
            this.head=newNode;
        Node currentNode=this.head;
        while(currentNode.next!=null)
            currentNode=currentNode.next;
        currentNode.next=newNode;
    }
   public void removeNode(string data){
       if(this.head==null)
           return;
       if(this.head.data.equals(data)){
           this.head=this.head.next;
       return;
}
 currentNode=currentNode.next;
   }
}
//The big Oh notation for this code is O(1)
    
//Question 2 

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   class stack{
       Node top;
       public boolean isEmpty(){
           return top==null;
       }
       public int push(int data){
           Node newNode=new Node(data);
         newNode.next= top;
         top=newNode;
       }
     public int pop(){
         if(isEmpty())
             throw  stackEmptyException;
         int data=top.data;
         top=top.next;
         return data;
     }
       public int peek(){
           if(isEmpty())
           throw  stackEmptyException;
           return top.data;
       }
   }
//The big Oh notation for this class is O(1)
   
//QUESTION 3
   
 class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
 class queue{
     Node front;
     Node rear;
   public boolean isEmpty(){
       return front=null;    
   }
   public void enqueue(int data){
       Node newNode=newNode(data);
       if(rear==null){
           front=rear=newNode;
           return;
   }
       rear.next=newNode;
       rear=newNode;
   }
   public int dequeue(){
       if(isEmpty())
           throw queueEmptyException;
       int data=front.data;
       front=front.next;
       if(front==null){
           rear=null;
       }
       return data;
   }
   public int peek(){
       if(isEmpty())
           throw queueEmptyException;
       return front.data;
   }
 }
 //the big O for this class is also O(1) since execution time is constant and there is no loop involved