def BubbleSort(list):
    for i in range(len(list)):
        for j in range(i+1, len(list)):
            if list[i] > list[j]:
                # temp = list[i]
                # list[i] = list[j]
                # list[j] = temp
                list[i],list[j]=list[j],list[i]
    return list

def BubbleSort1(list):
    for i in range(len(list)):
        for j in range(len(list)-1,i,-1):
            if(list[i]>list[j]):
                list[i], list[j] = list[j], list[i]
    return list

def BubbleSort2(list):
    for i in range(len(list)):
        for j in range(len(list)-i-1):
            if(list[j]>list[j+1]):
                list[j], list[j+1] = list[j+1], list[j]
    return list


def SelectSort(list):
    for i in range(len(list)):
        min = i
        for j in range(i+1, len(list)):
            if (list[min] > list[j]):
                list[i], list[j] = list[j],list[i]
    return list

def InsertSort(list):
    for i in range(len(list)):
        for j in range(i+1):
            if (list[i]<list[j]):
                list[i],list[j] = list[j],list[i]
    return list




print(InsertSort([17, 56, 71, 38, 61, 62, 48, 28, 57, 42]))


