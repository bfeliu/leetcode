public class InvertBinTree_226 {
    public static TreeNode invertTree(TreeNode root) {
        TreeNode left;
        if(root == null) return root;
        else {
            left = root.left;
            root.left = root.right;
            root.right = left;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String[] args){
        //System.out.println(findLatestStep(arr, m));
        TreeNode root = new TreeNode(4,
                            new TreeNode(2, 
                                 new TreeNode(1),
                                 new TreeNode(3)),
                            new TreeNode(7, 
                                new TreeNode(6),
                                new TreeNode(9)));
        System.out.println(invertTree(root));                        
        System.out.println("picha grande");
    }
}