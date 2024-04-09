package queue;

public class test {

	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(5);
		
		queue.queueEnqueue(2);
		queue.queueEnqueue(5);
		
		queue.queueDequeue();
		
		queue.queueDequeue();
		
		queue.queueFront();

	}

}
