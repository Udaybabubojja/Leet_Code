/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> a = new ArrayList<>();
        porder(root, a);
        return a;
    }
    public static void porder(Node root, ArrayList a){
        if(root==null) return;
        if (root.children != null) {
            for (Node child : root.children) {
                porder(child, a);
            }
        }
        
        // Visit the root node itself
        a.add(root.val);
        
    }
}