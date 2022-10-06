package LinkedList;

public class Main {
	public static void main(String []args)
	{
		LinkedList list=new LinkedList();
//		Node<Integer>head=list.takeInput();
//		list.print(head);
//		System.out.println("size-> "+list.size(head));
//		head=list.insert(head,80,1);
//		list.print(head);
//		System.out.println("size-> "+list.size(head));
//		head=list.insert(head,80,2);
//		list.print(head);
//		System.out.println("size-> "+list.size(head));
//		head=list.insert(head,80,5);
//		list.print(head);
//		System.out.println("size-> "+list.size(head));
//		head=list.delete(head, 1);
//		list.print(head);
//		System.out.println("size-> "+list.size(head));
//		head=list.delete(head, 2);
//		list.print(head);
//		System.out.println("size-> "+list.size(head));
//		head=list.delete(head, 5);
//		list.print(head);
//		System.out.println("size-> "+list.size(head));
//		head=list.delete(head, 0);
//		list.print(head);
//		System.out.println("size-> "+list.size(head));
		
		LinkedListR listR=new LinkedListR();
		Node<Integer>head;
		head=listR.take();
		System.out.println(listR.size(head));
		listR.print(head);
		System.out.println(listR.size(head));
		head=listR.insert(head,80,2);
		listR.print(head);
		System.out.println(listR.size(head));
		head=listR.insert(head,70,3);
		listR.print(head);
		System.out.println(listR.size(head));
		head=listR.insert(head,90,6);
		listR.print(head);
		System.out.println(listR.size(head));
		head=listR.insert(head,990,5);
		listR.print(head);
		System.out.println(listR.size(head));
		head=listR.delete(head, 1);
		listR.print(head);
		System.out.println(listR.size(head));
		head=listR.delete(head, 2);
		listR.print(head);
		System.out.println(listR.size(head));
		head=listR.delete(head, 5);
		listR.print(head);
		System.out.println(listR.size(head));
		head=listR.delete(head, 3);
		System.out.println(listR.size(head));
//		listR.print(head);
//		listR.print(head);
//		listR.print(head);
//		listR.print(head);
//		listR.print(head);

	}

}
