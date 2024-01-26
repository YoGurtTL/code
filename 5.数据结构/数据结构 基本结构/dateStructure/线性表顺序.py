class Ilist():
    sqlist = []
    maxsize = 10

    def __inti__(self,maxsize):
        self.maxsize = maxsize
        self.sqlist = []

    def ListInsert(self, i, e):
        if i < 0 and i > self.maxsize:
            print('insert position error')
            return False
        else:
            self.sqlist.insert(i, e)
            print(self.sqlist)

    def ListDelete(self, i):
        if i < 1 or i > self.maxsize:
            print('delete position error')
            return False
        else:
            self.sqlist.pop(i)
            print(self.sqlist)

    def findelem(self, i):
        if i < 1 or i > self.maxsize:
            print('find position error')
            return False
        else:
            return self.sqlist[i]

    def findelemData(self, e):
        return self.sqlist.index(e)

    def ListLength(self):
        return len(self.sqlist)

list = Ilist()
list.ListInsert(1,2)
list.ListInsert(2,5)
list.ListInsert(3,8)
list.ListInsert(4,9)
list.ListInsert(5,19)

print(list.ListLength())