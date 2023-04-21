package task2;


public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        root = null;
    }


    public String find(int id) {
            Node current = root;
            while (current != null) {
                if (current.data == id) {
                    return "yees, value " + id + " found in the tree.";
                } else if (current.data > id) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
            return "noo, value " + id + " not found in the tree.";
    }


    public boolean delete(int id) {
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current.data != id) {
            parent = current;
            if (current.data > id) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild == true) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.left != null && current.right != null) {

            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    private Node getSuccessor(Node deleteNode) {
        Node successsor = null;
        Node successsorParent = null;
        Node current = deleteNode.right;
        while (current != null) {
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }
        if (successsor != deleteNode.right) {
            successsorParent.left = successsor.right;
            successsor.right = deleteNode.right;
        }
        return successsor;
    }

    public void insert(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (id < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    public Node search(int id) {
        Node current = root;
        while (current != null) {
            if (current.data == id) {
                return current;
            } else if (current.data > id) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}