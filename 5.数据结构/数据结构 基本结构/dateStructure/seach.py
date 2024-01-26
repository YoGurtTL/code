# 顺序表查找算法
def sequential_Search(list_arr,n,key):
    list_arr[0]
    for i in range(n):
        if(list_arr[i]==key):
            return i

    return 0

# 优化顺序表
def sequential_Search2(list_arr,n,key):
    list_arr[0] = key
    i=n
    while(list_arr[i]!=key):
        i -= 1
    return i


def Binary_Search(list_arr,n,key):
    high = n
    mid = 0
    low = 0
    while(low <= high):
        mid = int((high+low)/2)
        if(key < list_arr[mid]):
            high = mid-1
        elif(key > list_arr[mid]):
            low=mid+1
        else:
            return mid
    return 0

def Fibonacci_Search(list_arr,n,key):
    low=0
    high = n
    k = 0
    F=[0,1,1,2,3,5,8,13,21,34]
    while n>F[k]-1:
        k+=1
    for i in range(n,len(F)-1):
        list_arr.append(list_arr[n])
    while(low<=high):
        mid= low+F[k-1]-1
        if (key < list_arr[mid]):
            high=mid-1
            k=k-1
        elif (key > list_arr[mid]):
            low=mid+1
            k=k-2
        else:
            if(mid<=n):
                return mid
            else:
                return n
    return 0

i = Fibonacci_Search([1,2,3,4,55,88,101],6,55)
print(i)

