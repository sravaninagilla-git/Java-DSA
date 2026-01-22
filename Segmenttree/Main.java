class SegmentTreeNode {
    int start, end;
    int sum;
    SegmentTreeNode left, right;

    public SegmentTreeNode(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
        this.left = null;
        this.right = null;
    }
}

class SegmentTree {
    private SegmentTreeNode root;

    public SegmentTree(int[] nums) {
        root = buildTree(nums, 0, nums.length - 1);
    }

    private SegmentTreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        SegmentTreeNode node = new SegmentTreeNode(start, end);
        if (start == end) {
            node.sum = nums[start];
        } else {
            int mid = start + (end - start) / 2;
            node.left = buildTree(nums, start, mid);
            node.right = buildTree(nums, mid + 1, end);
            node.sum = node.left.sum + node.right.sum;
        }
        return node;
    }

    public int rangeSum(int i, int j) {
        return rangeSum(root, i, j);
    }

    private int rangeSum(SegmentTreeNode node, int start, int end) {
        if (node == null || start > node.end || end < node.start) {
            return 0;
        }
        if (start <= node.start && end >= node.end) {
            return node.sum;
        }
        return rangeSum(node.left, start, end) + rangeSum(node.right, start, end);
    }

    public void update(int index, int val)

    {
        update(root, index, val);
    }

    private void update(SegmentTreeNode node, int index, int val) {
        if (node.start == node.end) {
            node.sum = val;
            return;
        } 
            int mid = node.start + (node.end - node.start) / 2;
            if (index <= mid) {
                update(node.left, index, val);
            } else {
                update(node.right, index, val);
            }
            node.sum = node.left.sum + node.right.sum;
        }
    }

    public class Main {
        public static void main(String[] args) {
                int[] nums = {3,1,2,7,1};
                SegmentTree segmentTree = new SegmentTree(nums);
                System.out.println("Range Sum ( 0 , 2): " + segmentTree.rangeSum(0,2));
                System.out.println("Range Sum(0 , 1): " + segmentTree.rangeSum(0,1));
                segmentTree.update(1,5);
                System.out.println("After Update:");
                System.out.println("Range Sum (0,2):"+ segmentTree.rangeSum(0,2));
            }
    }


