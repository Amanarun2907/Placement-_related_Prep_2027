public class Circular_queue_implementation_using_Array {
    static class Queue{
        // class is created ...
       static  int arr []; // class level 
       static int size; // class level 
       static int rear; // entry from rear and exit from front always . remember it  in queue 
       static int front ; //1st change  
       // front --> (front+1)%size
       // rear --> (rear+1)%size
       // Entry point ---> rear 
       // exit point ---> front 

       Queue(int n){ // constructor is called 
        arr = new int [n]; 
        size = n;
        rear = -1; // front is on -1 and rear is on -1 
        front  = -1;
       }


       public static boolean isEmpty(){
        return rear==-1 && front == -1;
        // if  rear==-1 && front == -1 --> true ----> empty
        // if  rear==-1 && front == -1 --> false ----> not empty 
        
       }
       public static boolean isfull(){
        return (rear+1)%size==front;
       }


       //add 
       public static void add(int data){
        // if queue is already full then we can not add the element . 
        if(isfull()==true){
            // if queue is full
            System.out.println("Queue is full"); 
            return;

        }
        // rear is the index not element .
        // rear = rear+1; --> not applicable
       // we are updating the value of front whenever we have to remove the element 
       // we are updating the value of rear whenever we have to add the element 

        if(front == -1 ){
            front  = 0;
        }// if i am adding element 1st time 
        rear = (rear+1)%size;
        arr[rear]= data;
       }

       //remove
       public static int remove(){
        // if queue has no element then we can not remove any element from it .
        if(isEmpty()){

            System.out.println("empty queue");
            return -1;
        }
        
        int result  = arr[front];
       
       
        // last element delete
        if(rear==front){
            rear = front = -1;
        }
        else{
        front = (front+1)%size;
        }
        return result;

       }
    public static int  peek (){
        if(isEmpty()){
        System.out.println("empty queue");
        return -1;
        }   
    return arr[front];

    }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3); // object created 
        q.add(1); // adding --> rear = rear+1 and arr[rear] = data 
        q.add(2);
        q.add(3);
        
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (q.isEmpty()!=true){
            System.out.println(q.peek());
            q.remove();// --> int front = arr[0]--> for loop ---> rear = rear-1 --> return front ..........
        }
    }
}
