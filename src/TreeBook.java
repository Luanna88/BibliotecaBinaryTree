public class TreeBook {
  public Node head;

  public void add(Book book) {
    this.head = insert(this.head, book);
  }

  private Node insert(Node node, Book book) {
    if (node == null) {
      return new Node(book);
    }

    if (book.name.compareTo(node.value.name) < 0) {
      node.left = insert(node.left, book);
    } else {
      node.right = insert(node.right, book);
    }

    return node;
  }

  public void travel() {
    preOrder(this.head);
  }

  private void preOrder(Node node) {
    if (node == null) {
      return;
    }

    System.out.println(node.value.name);
    preOrder(node.left);
    preOrder(node.right);
  }

  public void remove(Book book) {
    this.head = delete(this.head, book);
  }

  private Node delete(Node node, Book book) {
    if (node == null) {
      return null;
    }

    if (book.name.compareTo(node.value.name) < 0) {
      node.left = delete(node.left, book);
    } else if (book.name.compareTo(node.value.name) > 0) {
      node.right = delete(node.right, book);
    } else {
      if (node.left == null && node.right == null) {
        return null;
      } else if (node.left == null) {
        return node.right;
      } else if (node.right == null) {
        return node.left;
      } else {
        Node min = findMin(node.right);
        node.value = min.value;
        node.right = delete(node.right, min.value);
      }
    }

    return node;
  }

  private Node findMin(Node node) {
    while (node.left != null) {
      node = node.left;
    }

    return node;
  }
}
