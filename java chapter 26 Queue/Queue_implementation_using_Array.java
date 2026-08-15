public class Queue_implementation_using_Array{
    static class Queue{
        // class is created ...
       static  int arr []; // class level 
       static int size; // class level 
       static int rear; // entry from rear and exit from front always . remember it  in queue 
       // First element of the array = arr[0] and Last element of the array is arr[n-1]; 
       // Front is always on 0th index and pointing toward arr[0]. 
       Queue(int n){ // constructor is called 
        arr = new int [n]; 
        size = n;
        rear = -1; // front is on 0 and rear is on -1 
       }


       public static boolean isEmpty(){
        return rear==-1; // answer only in true and false 
        // if rear == -1 --> queue is empty ---> return true;
        // if rear != -1 --> queue is not empty ---> return false;
       }


       //add 
       // rear and points are basically value of the index 
       public static void add(int data){
        // if queue is already full then we can not add the element . 
        if(rear==size-1){
            // if queue is full
            System.out.println("Queue is full"); 

        }
        // rear is the index not element .
        rear = rear+1;
        arr[rear]= data;
       }

       //remove
       public static int remove(){
        // if queue has no element then we can not remove any element from it .
        if(isEmpty()){

            System.out.println("empty queue");
            return -1;
        }
        int front = arr[0]; // storing the element which i have to remove 
        for(int i = 0 ;i<rear;i++){
            arr[i] = arr[i+1];  // shifting the element to the left side 
        }
        rear = rear-1; // shifting the rear pointer to left side
        return front; // returning the element 

       }
    public static int  peek (){
        if(isEmpty()==true){
        System.out.println("empty queue");
        return -1;
        }   
    return arr[0];

    }
    }
    public static void main(String[] args) {
        // Object creation : class_name object_name = new class_name();
        Queue q = new Queue(5); // object created 
        q.add(1); // adding --> rear = rear+1 and arr[rear] = data 
        q.add(2);
        q.add(3);


        while (q.isEmpty()!=true){
            System.out.println(q.peek());
            // arr[0] is the first element
            q.remove();// --> int front = arr[0]--> for loop ---> rear = rear-1 --> return front ..........
        }
    }
}