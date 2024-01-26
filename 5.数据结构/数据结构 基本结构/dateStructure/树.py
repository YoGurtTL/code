class Node(object):
    def __init__(self, item):
        self.item = item
        self.left = None
        self.right = None

class tree():

    def __init__(self):
        self.root = Node('root')

    def DestroyTree(self):
        pass

    def CreateTree(self,definition):
        pass

    def ClearTree(self):
        pass

    def TreeEmpty(self):
        return self.root == None

    def TreeDepth(self):
        pass

    def Root(self):
        pass

    def Value(self):
        pass


    def Assign(self):
        pass

# 找到Item的父节点
    def Parent(self, item):
        if self.root == item:
            return None
        temp = [self.root]
        while temp:
            pop_node =temp.pop(0)
            if pop_node.left and pop_node.left.item == item:
                return pop_node
            if pop_node.right and pop_node.right.item == item:
                return pop_node
            if pop_node.right is not None:
                temp.append(pop_node)
            if pop_node.left is not None:
                temp.append(pop_node)
        return None


    def LeftChild(self):
        pass

    def RightSibling(self):
        pass

    def InsertChild(self,item):
        node = Node(item)
        if self.Root is None:
            self.root = node
        else:
            q = [self.root]
            while True:
                pop_node = q.pop(0)
                if pop_node.left is None:
                    pop_node.left = node
                    return
                elif pop_node.right is None:
                    pop_node.right = node
                    return
                else:
                    q.append(pop_node.left)
                    q.append(pop_node.right)

    def DeleteChild(self,item):
        if self.root is None:
            return None
        parent = self.Parent(item)
        if parent:
            del_node = parent.left if parent.left.item ==item else parent.right
            if del_node.left is None:
                if parent.left.ietm == item:
                    parent.left = del_node.right
                else:
                    parent.right = del_node.left
                del del_node
                return True
            elif del_node.right is None:
                if parent.right.item == item:
                    parent.left.item = del_node.left
                else:
                    parent.right = del_node.left
                del del_node
            else:
               tem_pre = del_node
               tem_next = del_node.right
               if tem_next.left is None:
                   tem_pre.right = tem_next.right
                   tem_next.left = del_node.left
                   tem_next.right = del_node.right
               else:
                  while tem_next.left:
                      tem_pre = tem_next
                      tem_next = tem_pre.left
                  tem_pre.left = tem_next.right
                  tem_next.left = del_node.left
                  tem_next.right = del_node.right
               if parent.left.item == item:
                   parent.left = tem_next
               else:
                   parent.right = tem_next
               del del_node
               return True
        else:
            return False

#前序
    def preOrderTraverse(self,node):
        if node.root is None:
            return []
        result = [node.root.item]
        self.preOrderTraverse(node.left)
        self.preOrderTraverse(node.right)
        return result

#后序
    def postorder(self,node):
        if node.root is None:
            return []
        result = [node.root.item]
        self.postorder(node.right)
        self.postorder(node.left)
        return result
