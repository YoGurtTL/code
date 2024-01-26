def Node():
    def __int__(self, data):
        self.data = data
        self.next = None

class Linklist:
    def __int__(self):
        self.head = None

    def initlist(self,data_list):
        self.head = Node(data_list[0])
        temp = self.head
        for i in data_list[1:]:
            node = Node(i)
            temp.next = node
            temp = temp.next


    def is_empty(self):
        if self.head==None:
            print('link is empty')
            return True
        else:
            return False


    def get_length(self):
        temp = self.head
        length = 0
        while temp != None:
            length = length+1
            temp = temp.next
        return length


    def insert(self,key,value):
        if key < 0 or key > self.get_length()-1:
            print('error')
        temp = self.head
        i = 0
        while i <key:
            pre = temp
            temp = pre.next
            i = i+1
        node = Node(value)
        pre.next = node
        node.next = temp

    def print_list(self):
        print("linke_like")
        temp = self.head
        while temp is not None:
            print(temp.data)
            temp = temp.next

    def remove(self,key):
        if key < 0 or key > self.get_length()-1:
            print('remove error')
        i = 0
        temp = self.head
        while temp != None:
            pre = temp
            temp = pre.next
            i = i+1
            if i == key:
                pre.next = temp.next
                temp = None
                return True
        pre.next = None

    def reverse(self):
        prev = None
        current = self.head
        while current:
            next_node = current.next
            current.next= prev
            prev=current
            current= next_node
        self.head=prev



