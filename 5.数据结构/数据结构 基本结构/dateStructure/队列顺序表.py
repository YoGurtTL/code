class queue:
    def __init__(self):
        self.data = []

    def destroyQueue(self):
        pass
    def clearQueue(self):
        pass
    def queueEmpty(self):
        pass

    def getHead(self):
        if self.QueueLength() == 0:
            raise IndexError('Queue is empty')
        return self.data[-1]

    def enQueue(self, e):
        self.data.insert(0, e)

    def DeQueue(self):
        if self.QueueLength() == 0:
            raise IndexError('Queue is empty')
        return self.data.pop(0)

    def QueueLength(self):
        return len(self.data)

    def findall(self):
        print(self.data)
ss = queue()
ss.enQueue(12)
ss.enQueue(13)
ss.enQueue(14)

print(ss.DeQueue())
print(ss.DeQueue())
ss.findall()