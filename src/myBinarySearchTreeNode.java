class myBinarySearchTreeNode {
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;

  myBinarySearchTreeNode(int inValue) {
    // created a new node with empty child pointers
    myValue = inValue;
    left = null;
    right = null;
  }

  myBinarySearchTreeNode(int[] A) {
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    myValue = A[0];
    for (int i = 1; i < A.length; i++) {
      this.insert(A[i]);
    }
  }

  public void insert(int inValue) {
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken. 

    if (inValue > this.myValue) {
      if (right == null) {
        right = new myBinarySearchTreeNode(inValue);
      }
      else {
        right.insert(inValue);
      }
    }
    else if (inValue < this.myValue) {
      if (left == null) {
        left = new myBinarySearchTreeNode(inValue);
      }
      else {
        left.insert(inValue);
      }
    }
    if (inValue == this.myValue) ;

    public int height(){
      // This method recursively calculates the height of the entire (sub)tree.
      // This method will take O(n) time

      int L = 0;
      int R = 0;

      if (left != null) {
        L = left.height();
      }
      if (right != null) {
        R = right.height() + 1;
      }

      return Math.max(L,R);
    }

    public int depth(int search){
      // This method recursively calculates the depth of a given search value.
      // If the given value is not in the tree, this method returns -1.
      // Note that if the tree is a proper BST, this method should complete in O(log n) time.
      // Additionally, remember that the depth is the number of nodes on the path from a node to the root
      // (i.e. the number of the recursive calls).

      if (search < myValue) {
        if (left != null) {
          int leftR = left.depth(search);

          if (leftR == -1)
            return 1 + left.depth(search);
        }
      }
      if (search > myValue) {
        if (right != null) {
          int rightR = right.depth(search);
          if (rightR == -1)
            return 1 + right.depth(search);
        }
      }
      if (search == myValue)
        return size;
    }

    public int size(){
      // This method recursively calculates the number of nodes in the (sub)tree.
      // Iterates over the binary tree to return the size
      int sum = 1;

      if (left != null) {
        sum += left.size();
      }
      if (right != null) {
        sum += right.size();
      }

      return size;
    }

    // Utility function included so you can debug your solution.
    public void print(){
      print("");
    }
    private void print (String prefix){
      System.out.println(prefix + myValue);
      prefix = prefix.replace('\u251C', '\u2502');
      prefix = prefix.replace('\u2514', ' ');
      if (left != null) left.print(prefix + "\u251C ");
      if (right != null) right.print(prefix + "\u2514 ");
    }

  }
}
