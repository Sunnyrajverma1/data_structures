package LinkedList;
import java.util.*;
public class LinkedList {
	public static Node<Integer> takeInput()
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1)
		{
			Node<Integer> curr=new Node<Integer> (data);
			if(head==null)
			{
				head=curr;
				tail=curr;
			}
			else
			{
				tail.next=curr;
				tail=tail.next;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public Node<Integer> insert(Node<Integer>head,int data,int pos)
	{
		Node<Integer>curr=new Node<Integer>(data);
		Node<Integer>temp=head;
		int count =0;
		if(pos==1)
		{
			curr.next=head;
			head=curr;
			return head;
		}
		while(count<pos-1&&temp!=null)
		{
			count++;
			temp=temp.next;
		}
		if(temp==null)
			return head;
		if(count==pos-1)
		{
			curr.next=temp.next;
			temp.next=curr;
		}
		
		
		return head;
	}
	public Node<Integer> delete(Node<Integer>head,int pos)
	{
		int count=0;
		Node<Integer>temp=head;
		if(pos==0)
		{
			head=head.next;
			return head;
		}
		while(count<pos-1&&temp!=null)
		{
			count++;
			temp=temp.next;
		}
		if(temp==null)
			return head;
		temp.next=temp.next.next;
		
		return head;
	}
	public int size(Node<Integer>head)
	{
		int count=0;
		if(head==null)
			return count;
		Node<Integer>temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	public void print(Node<Integer>head){
		if(head==null)
			return;
		Node<Integer> tail=head;
		while(tail!=null){
			System.out.print(tail.data+"-->  ");
			tail=tail.next;
		}
		System.out.println("");
	}

}
