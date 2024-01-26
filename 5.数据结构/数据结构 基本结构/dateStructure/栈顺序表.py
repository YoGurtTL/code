class stack:
    def __init__(self):
        super().__init__()
        self.data = []

    def __len__(self):
        return len(self.data)

    def is_empty(self):
        return len(self.data) == 0

    def clear(self):
        return self.data.clear()

    def top(self):
        if self.is_empty():
            raise ValueError("statck is Empty")
        return self.data[-1]

    def push(self,value):
        self.data.append(value)

    def pop(self):
        if self.is_empty():
            raise ValueError("statck is Empty")
        return self.data.pop()

