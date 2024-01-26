def BubbleSort1(list):
    for i in range(len(list)):
        for j in range(i+1,len(list)):
            if list[i]>list[j]:
                temp = list[i]
                list[i] = list[j]
                list[j] = temp
    return list




def BubbleSort2(list):
    for i in range(len(list)):
        for j in range(len(list)-1,i,-1):
            if(list[j]>list[i]):
                temp = list[j]
                list[j]=list[i]
                list[i] = temp

    return list

def BubbleSort3(list):
    flag = True
    for i in range(len(list)):
        if flag is True:
            flag=False
            for j in range(len(list)-2,i,-1):
                if list[min]>list[j]:
                    temp = list[j]
                    list[j] = list[j+1]
                    list[j+1] = temp
                    flag=True
    return list


def SelectSort(list):
    for i in range(len(list)):
        min = i
        for j in range(i+1, len(list)):
            if(list[min] > list[j]):
                min = j
        if i != min:
            temp = list[min]
            list[min] = list[i]
            list[i] = temp
    return list

def InserSort(list):
    for i in range(1,len(list)):
        if(list[i]<list[i-1]):
           temp = list[i]
           j = i-1
           while j>= 0 and list[j] > temp:
                list[j+1] = list[j]
                j -=1
           list[j+1] = temp
    return list


def shellSort(list):
    length = len(list)
    dist = length // 2
    while dist > 0:
        for i in range(dist, length):
            temp = list[i]
            j = i
            while j >= dist and temp < list[j-dist]:
                list[j]=list[j-dist]
                j -= dist
            list[j] = temp
        dist = dist // 2
    return list

# 快速排序
def QuickSort(arr):
    QSort(arr,0,len(arr))

def Partition(arr,low,high):
    pivotkey = arr[low]
    j = low
    for i in range(low+1,high):
        if arr[i] <=pivotkey:
            j+=1
            arr[j],arr[i]=arr[i],arr[j]
    arr[low],arr[j]= arr[j],arr[low]
    return j

def QSort(List, low, high):
   if high-low <=1:
       return
   m=Partition(List,low,high)
   QSort(List, low, m-1)
   QSort(List, m+1, high)

# 归并排序
def msort (arr1,arr2):
    result = []
    while arr1 and arr2:
        if arr1[0]<arr2[0]:
            result.append(arr1.pop(0))
        else:
            result.append(arr2.pop(0))
    if arr1:
        result += arr1
    if arr2:
        result += arr2
    return result

def msort_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr)//2
    return msort(msort_sort(arr[:mid]),msort_sort(arr[mid:]))

print(BubbleSort1([17, 56, 71, 38, 61, 62, 48, 28, 57, 42]))


