package 访问单个节点的删除;
class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class 访问单个节点的删除 {

	public static void main(String[] args) {

	}

	public static boolean removeNode(ListNode pNode) {
		if (pNode.next == null)
			return false;
		else {
			// 指向下一个值
			pNode.val = pNode.next.val;
			// 指向下一个地址
			pNode.next = pNode.next.next;
		}
		return true;
	}
}
