package queue;

public class ArrayQueue {

	public static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
		
	}
	
	/**
	 * Enqueues (adds) an item to the back of the queue.
	 *
	 * @param item the integer element to be added to the queue
	 * @throws IllegalStateException if the queue is at its capacity
	 */
	public void queueEnqueue (int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		} else {
			queue[rear]=item;
			rear++;
		}
		
	}
	/**
	 * Dequeues (removes) the element at the front of the queue and returns its value.
	 *
	 * @return the integer value of the first element in the queue, or 0 if the queue is empty
	 * @throws IllegalStateException if the queue is already empty
	 */
	public int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		}else {
			
		
		 firstElement =  queue[front];
		
		for (int i = 0; i < (rear-1); i++) {
			 queue[i] = queue[i+1];
			 
		}
		if(rear < capacity) {
			queue [rear] = 0;
		}
		rear--;
	}
	return firstElement;

}
	/**
	 * Displays the contents of the queue.
	 */
	public void queueDisplay() {
		if(front == rear) {
			System.out.println("Queue is empty!");
		} else {
			for(int i = front; i < rear; i++){
				System.out.println(i);
			}
		}
	}
	
	/**
	 * Returns the value of the first element in the queue without removing it.
	 *
	 * @return the integer value of the first element, or 0 if the queue is empty
	 */
	public int queueFront() {
		// TODO erstes Element ohne Löschen zurückgeben
	
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue is empty!");
		}else {
			firstElement = queue[front];
		}
		return firstElement;
	}

	//HÜ: ArrayQueueTest - alle Methoden von ArrayQueue testen
	// JAVA DOC - KOmmentare
	// Kaptiel 5 nochmals durcharbeiten
}

