package queue;

public class main {
	public static void main(String args[])
	{
//		queue queue=new queue(2);
//		System.out.println();
//		try{
//			queue.enqueue(20);
//		}
//		catch(queuefullexception e){
//			System.out.println("full");
//		}
//		
//		System.out.println(queue.front());
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		try{
//			queue.enqueue(30);
//		}
//		catch(queuefullexception e){
//			System.out.println("full");
//		}
//		
//		System.out.println(queue.front());
//		try{
//			queue.enqueue(700);
//		}
//		catch(queuefullexception e){
//			System.out.println("full");
//		}
//		
//		System.out.println(queue.front());
//		try{
//			queue.enqueue(800);
//		}
//		catch(queuefullexception e){
//			System.out.println("full");
//		}
//		
//		System.out.println(queue.front());
//		try{
//			queue.dequeue();
//		}
//		catch(queueemptyexception e)
//		{
//			System.out.println("empty");
//		}
//		
//		System.out.println(queue.front());
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		try{
//			queue.enqueue(40);
//		}
//		catch(queuefullexception e){
//			System.out.println("full");
//		}
//		
//		try{
//			queue.dequeue();
//		}
//		catch(queueemptyexception e)
//		{
//			System.out.println("empty");
//		}
//		
//		System.out.println(queue.front());
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		try{
//			queue.dequeue();
//		}
//		catch(queueemptyexception e)
//		{
//			System.out.println("empty");
//		}
//		try{
//			queue.dequeue();
//		}
//		catch(queueemptyexception e)
//		{
//			System.out.println("empty");
//		}
//		try{
//			queue.dequeue();
//		}
//		catch(queueemptyexception e)
//		{
//			System.out.println("empty");
//		}
		QueueUsing2stacks q=new QueueUsing2stacks();
		System.out.println(q.isEmpty());
		q.enqueue(10);
		System.out.println(q.isEmpty());
		q.size();
		q.enqueue(20);
		System.out.println(q.isEmpty());
		q.size();
		q.enqueue(30);
		System.out.println(q.isEmpty());
		q.size();
		q.enqueue(40);
		System.out.println(q.isEmpty());
		q.size();
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		q.size();
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		q.size();
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		q.size();
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		q.size();
	
	}

}
