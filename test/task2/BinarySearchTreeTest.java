package task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task2.BinarySearchTree;


public class BinarySearchTreeTest {

    private BinarySearchTree tree;

    @BeforeEach
    public void init() {
        // Initialize the Tree with some values
        tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

    }

    @Test
    public void testInsert() {
        // Test insertion of new values
        tree.insert(15);
        tree.insert(35);

        Assertions.assertTrue(tree.find(15).contains("yees"));
        Assertions.assertTrue(tree.find(35).contains("yees"));
        Assertions.assertFalse(tree.find(1).contains("yees"));
    }

    @Test
    public void testDelete() {
        // Test deletion of existing values
        tree.delete(20);
        tree.delete(50);
        //Node node = tree.search(20);
        //Assertions.assertFalse(node.data, 20);

        Assertions.assertFalse(tree.find(20).contains("yees"));
        Assertions.assertFalse(tree.find(50).contains("yees"));
    }

    @Test
    public void testFind() {
        // Test searching for existing and non-existing values
        Node node = tree.search(20);
        Assertions.assertEquals(node.data, 20);

        node = tree.search(50);
        Assertions.assertEquals(node.data, 50);

        node = tree.search(90);
        Assertions.assertNull(node);
    }
}
