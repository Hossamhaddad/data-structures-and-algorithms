# Trees

### A Tree is a non-linear data structure where data objects are organized in terms of hierarchical relationship

## Challenge

### to implement binarytree data structure and binarytree search class

## Approach & Efficiency

### I created a Node class that contains of the Node value and a left and right node, the binarytree contains of root node and that root node poiniting to left and right node ,i used recursion to traverse the binarytree in inoredr , preorder and postorder

## API

### BinaryTree

#### 1. preOrder : a method to traverse tree in this traversal method, the root node is visited first, then the left subtree and finally the right subtree .

#### 2. inOrder : a method to traverse tree First, visit all the nodes in the left subtree · Then the root node · Visit all the nodes in the right subtree .

#### .. postOrder : a method to traverse tree First we traverse the left subtree, then the right subtree and finally the root node.

### BinarySearchTree

#### 1. add(Integer value) : a method to add nodes to the tree if the node value is less than the root this node will be added to the left, if the node value is larger than the root this node will be added to the right, if the root is null the root will be equal to this node .

#### 2. contains(Integer value) : a method to check if the tree contains a specific value if the value is bigger than the root it will search the right part if the value is less than the root it will search the left part .
