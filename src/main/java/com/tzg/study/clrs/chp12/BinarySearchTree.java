package com.tzg.study.clrs.chp12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 二叉查找树
 * 不允许元素重复
 */
public class BinarySearchTree<T extends Comparator> {

    private Node root;

    /**
     * 构造一棵空树
     */
    public BinarySearchTree(){}

    /**
     * 构造一棵指定了根节点的树
     * @param root  树的根
     */
    public BinarySearchTree(Node<T> root){
        if(root == null)
            throw new NullPointerException("根节点不能为空!");
        if(hasRoot())
            throw new RuntimeException("已经存在根节点了!");
        this.root = root;
    }

    private boolean hasRoot(){
        return root == null;
    }

    public Node getRoot(){
        if(!hasRoot())
            throw new NullPointerException("根节点不存在!");
        return this.root;
    }

    /**
     * 插入节点
     * @param key   节点的key
     * @return      新插入的节点
     */
    public Node insert(T key){

        Node node = new Node(key);
        return node;
    }

    /**
     * 删除节点
     * @param key  待删除节点的key
     * @return      返回删除后的节点
     * @throws NullPointerException
     */
    public Node delete(T key){
        if(key == null)
            throw new NullPointerException("key不能为空!");
        return null;
    }

    //TODO
    /**
     * 更新树节点的key
     * @param expected    期望的节点key
     * @param update      更新后的值
     * @return            更新结果
     */
    public boolean update(T expected,T update){
        return false;
    }

    /**
     * 根据key找出对应节点：节点不存在则返回null
     * @param key   待查找的节点的key
     * @return      查找的节点
     */
    public Node search(T key){
        return null;
    }

    /**
     * 最小key节点
     * @return
     */
    public Node minNode(){
        if(!hasRoot())
            return null;
        return null;
    }

    /**
     * 最大key节点
     * @return
     */
    public Node maxNode(){
        if(!hasRoot())
            return null;
        return null;
    }

    /**
     * 先序遍历树
     * @return  返回先序遍历树的节点集合，如果树为空树，则集合长度为0.
     */
    public List<Node<T>> preOrderTreeWalk(){
        List<Node<T>> preList = new ArrayList<>();
        return preList;
    }

    /**
     * 中序遍历
     * @return
     */
    public List<Node<T>> inOrderTreeWalk(){
        List<Node<T>> inOrderList = new ArrayList<>();
        return inOrderList;
    }

    /**
     * 后序遍历
     * @return
     */
    public List<Node<T>> postOrderTreeWalk(){
        List<Node<T>> postList = new ArrayList<>();
        return postList;
    }

    /**
     * 生成随机树
     */
    public void createTree(){

    }

    public static class Node<T>{
        private Node parent;
        private Node left;
        private Node right;
        private T key;

        public Node() {
        }

        public Node(T key) {
            this.key = key;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }

    }
}
