package mypackage;
import java.util.*;
public class LinkedListDemo {
	Node head;//HADE OF List
	static class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next=null;			
		}
		//Method to insert a new node
		public static LinkedListDemo insert(LinkedListDemo list,int data) {
			//create a new node with given data
			Node New_node=new Node(data);
			New_node.next=null;
			// If the Linked List is empty, then make the new node as head 
			if(list.head == null)
			{
				list.head=New_node;
			}
			else {
				// Else traverse till the last node and insert the new_node there 
				Node last =list.head;
			while(last.next != null) {
				last=last.next;
			}// Insert the new_node at last node
			last.next=New_node;			
		}
		return list;
	}
		public static void printList(LinkedListDemo list) {
			Node currNode=list.head;
			System.out.print("LinkedList: "); 
			// Traverse through the LinkedList 
			while(currNode!= null) {
				// Print the data at current node 
				System.out.print(currNode.data + " "); 
				currNode=currNode.next;
			}
			System.out.println();
		}
		// Method to delete a node in the LinkedList by KEY 
		public static LinkedListDemo deleteByKey(LinkedListDemo list,int key) {
			//store head node
			Node currNode=list.head;
			Node prev=null;
			if(currNode!=null && currNode.data==key) {
			    list.head=currNode.next;//change head
			    System.out.println(key+"found and delete");
			    return list;
			}
			while(currNode!=null && currNode.data !=key) {
				prev= currNode;
				currNode=currNode.next;
			}
			if (currNode!=null){
				prev.next=currNode.next;
				System.out.println(key+"found and delete");
			}
			if (currNode==null) {
				System.out.println(key+"not found");				
			}
			return list;
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Start with the empty list. */
		LinkedListDemo list=new LinkedListDemo();
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		list=insert(list,6);
		list=insert(list,7);
		list=insert(list,8);
		list=insert(list,9);
		
		printList(list);
		// Delete node with value 1
		deleteByKey(list,1);
		printList(list);

	}
	
	}

	}
