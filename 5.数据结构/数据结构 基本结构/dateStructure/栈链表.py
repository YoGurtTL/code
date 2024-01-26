class SinglyLinkedNode:
    class Node:
        def __init__(self, e):
            self.element = e
            self.next = None

    def __init__(self):
        self._size = 0
        self.head = None

    def size(self):
        return self._size

    def is_empty(self):
        return self._size == 0

    def push(self, e):
        newest = self.Node(e)
        newest.next = self.head
        self.head = newest
        self._size += 1

    def pop(self):
        if self.is_empty():
            raise IndexError('stack is empty')
        returnDate = self.head.element
        self.head = self.head.next
        self._size -= 1
        return returnDate

    def peek(self):
        if self.is_empty():
            raise IndexError('Statck is empty')
        return self.head.element



ss = SinglyLinkedNode()
ss.push(12)
ss.push(13)
print(ss.peek())