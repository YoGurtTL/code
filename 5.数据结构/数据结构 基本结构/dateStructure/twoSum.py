def if_function(condition, true_result, false_result):
    if condition == True:
        return true_result
    else:
        return false_result


print( if_function(3==2, 'equal', 'not equal'))

def with_if_statement():
    if cond():
        return true_func()
    else:
        return false_func()

def with_if_function():
    return if_function(cond(), true_func(), false_func())

def cond():
    return False;

def true_func():
    print(1)

def false_func():
    print(2)
