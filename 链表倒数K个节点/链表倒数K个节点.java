package 链表倒数K个节点;

class ListNode {
	public int val;
	ListNode next = null;

	public ListNode(int val) {
		this.val = val;
	}
}

public class 链表倒数K个节点 {

	public static void main(String[] args) {
		
	}

	public static ListNode FindKthToTail(ListNode head, int k) {
		ListNode cur = head;

		if (head == null || k < 1)
			return head;

		while (cur != null) {
			k--;
			cur = cur.next;
		}

		if (k == 0)
			return head.next;

		if (k < 0) {
			cur = head;
			while (++k != 0)
				cur = cur.next;
		}
		return cur.next;
	}

}
