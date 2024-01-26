class queueLink:
    class Node:
        def __init__(self,e):
            self.e = e
            self.next = None

    def __init__(self):
        self._size = 0
        self.head = None
        self.tail = None

    def destroyQueue(self):
        pass
    def clearQueue(self):
        pass

    def queueEmpty(self):
        return self._size==0

    def getHead(self):
        if self._size==0:
            raise IndexError('Queue is empty')
        return self.head.e

    def enQueue(self, e):
        newset = self.Node(e)
        if self.queueEmpty():
            self.head=newset
        else:
            self.tail.next = newset
        self.tail=newset
        self._size+=1


    def DeQueue(self):
        if self._size==0:
            raise IndexError('Queue is empty')
        returndata = self.head.e
        self.head = self.head.next
        self._size -= 1
        if self.queueEmpty():
            self.tail=None
        return returndata

    def QueueLength(self):
        return self._size

    def findall(self):
        while self.head is not None:
            print(self.head.e)
            self.head = self.head.next


queueLink = queueLink()
queueLink.enQueue(12)
queueLink.enQueue(13)
queueLink.enQueue(14)
print("12"+str(queueLink.DeQueue()))
print("12"+str(queueLink.DeQueue()))
print("12"+str(queueLink.DeQueue()))
queueLink.findall()