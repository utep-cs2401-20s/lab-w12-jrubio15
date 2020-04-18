import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class myBinarySearchTreeNodeTester {
    @Test
    public void testerTree1() {
        
        myBinarySearchTreeNode T = new myBinarySearchTreeNode(new int[]{7, 1, 3});
        // create tree here, root = new myBinarySearchTreeNode
        T.print();
        assertEquals(3, T.size());
        assertEquals(1, T.depth(1));
        assertEquals(2, T.depth(3));
        assertEquals(3, T.height());
    }
    @Test
    public void testerTree2() {

        
        myBinarySearchTreeNode T = new myBinarySearchTreeNode(new int[]{7, 2, 4, 8, 1, 9});
        // create tree here, root = new myBinarySearchTreeNode
        T.print();
        assertEquals(6, T.size());
        assertEquals(3, T.depth(9));
        assertEquals(2, T.depth(4));
        assertEquals(4, T.height());
    }
    @Test
    public void testerTree3() {
        
        myBinarySearchTreeNode T = new myBinarySearchTreeNode(new int[]{25, 0, 20, 5, 19, 12});
        // create tree here, root = new myBinarySearchTreeNode
        T.print();
        assertEquals(6, T.size());
        assertEquals(5, T.depth(12));
        assertEquals(4, T.depth(19));
        assertEquals(6, T.height());
    }
    @Test
    public void testerTree4() {
        
        myBinarySearchTreeNode T = new myBinarySearchTreeNode(new int[]{10, 2, 19, 17, 3, 4, 5, 14});
        // create tree here, root = new myBinarySearchTreeNode
        T.print();
        assertEquals(8, T.size());
        assertEquals(3, T.depth(4));
        assertEquals(2, T.depth(5));
        assertEquals(3, T.height());
    }
    @Test
    public void testerTree5() {
        
        myBinarySearchTreeNode T = new myBinarySearchTreeNode(new int[]{33, 65, 18, 4, 89, 60, 23});
        // create tree here, root = new myBinarySearchTreeNode
        T.print();
        assertEquals(7, T.size());
        assertEquals(3, T.depth(60));
        assertEquals(2, T.depth(23));
        assertEquals(4, T.height());
    }
}
