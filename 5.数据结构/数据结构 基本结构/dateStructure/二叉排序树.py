class BitNode():
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BinaryTree(object):
    def __init__(self):
        self.root = None

    def SearchBST (self, key, Node=None,RETNode=None):
        if  Node == None:
            return None, RETNode
        elif Node.data == key:
            return None, RETNode
        elif Node.data > key:
            return self.SearchBST(key, Node.left, Node)
        else:
            return self.SearchBST(key, Node.right, Node)


    def InsertBST(self,key):
        if self.root==None:
            self.root = BitNode(key)
        else:
            result, node_parent = self.SearchBST(key, Node=self.root)
            if result:
                return True
            elif node_parent.data > key:
                node_parent.left = BitNode(key)
            else:
                node_parent.right = BitNode(key)

    def inOrderTravel(self, bt):
        if bt is not None:
            self.inOrderTravel(bt.left)
            print(bt.data, end=" ")
            self.inOrderTravel(bt.right)


    def printTravel(self):
        print('birinary:', end="")
        self.inOrderTravel(bt=self.root)


data_list = [120,105,70,115]
btree = BinaryTree()
for i in data_list:
    btree.InsertBST(i)
btree.printTravel()

