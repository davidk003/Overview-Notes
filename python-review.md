
# Python Quick Review
Interpreted language (although can be optimized through JIT compilers, cython or C/C++ wrappers)

Easy dynamic typing

Excellent community
## Data type
Integers: 1,45,-1

Float: decimals (32423.62526)

Strings: “bob”, “2342jngjwjw”, “”

Boolean: True/False

## Arithmetic operations
*  +,-,*,/,%,**(power)
* Increments/Decrements: `i+=1`, `i-=1`, `i*=2`, `i/=2`
* other functions provided in the math module

## Comparison operators
* <,>,<=,>=,==,!=

## Logical operators
* `and`, `or`, `not`, `^`

```python

```

## Conditionals


## IO
file io:

console io:
input()
print()

## Lists

## Loops
* reminder that generally `for thing in something` format loops are preferred as it is "pythonic"
```python
i = 0
while i < 100:
    print(i)

for x in range(100):
    print(x)

things = ["car", "potato", "bee", "cloud"]
for thing in things:
    print(thing)
```

## Behind the range() function
```python
range(start, stop, step)
```

## Function Definitions
```python
//
def functionName():
    #do thing
def doThing(arg1):
    #do thing
def doThing2(arg1):
    return arg1+4
```

## The `is` operator:

```python
# From https://www.geeksforgeeks.org/difference-between-and-is-not-operator-in-python/
a = 10
b = 10
  
print(a is not b) 
print(id(a), id(b)) 
  
c = "Python"
d = "Python"
print(c is not d) 
print(id(c), id(d)) 
  
e = [1,2,3,4] 
f = [1,2,3,4] 
print(e is not f) 
print(id(e), id(f)) 
```
### Output:
```
False
140733278626480 140733278626480
False
2693154698864 2693154698864
True
2693232342792 2693232342600
```
## Common builtin function
len(), range(), abs(), 

## Dictionaries
* A key value pair system. Every key must be associated with a value. No duplicate keys.
```python
car = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
```

They are very important for speed when you need it especially for anything search/lookup related.
```python
import time
import random

# Create a large list and dictionary
size = 1000000
data_list = list(range(size))
data_dict = {i: i for i in range(size)}

# Function to search in list
def search_list(data, target):
    return target in data

# Function to search in dictionary
def search_dict(data, target):
    return target in data

# Number of searches to perform
num_searches = 1000

# Test list search
start_time = time.time()
for _ in range(num_searches):
    search_list(data_list, random.randint(0, size-1))
list_time = time.time() - start_time

# Test dictionary search
start_time = time.time()
for _ in range(num_searches):
    search_dict(data_dict, random.randint(0, size-1))
dict_time = time.time() - start_time

print(f"Time taken for {num_searches} searches:")
print(f"List: {list_time:.6f} seconds")
print(f"Dictionary: {dict_time:.6f} seconds")
print(f"Dictionary is {list_time / dict_time:.2f}x faster")
```

## Python exceptions
try and catch

## Useful tricks and shorthands
### fstrings
* prepend any normal string with f, and any time you use `{}` you can inline your values!
* javascript equivalent would be using backticks and `${}`
```python
name = "Alice"
age = 30

# Using f-string for string interpolation
message = f"My name is {name} and I am {age} years old."
print(message)  # Output: My name is Alice and I am 30 years old.
```

### List comprehension
```python
nums = [x for x in range(100)]
evens = [x*2 for x in range(100)]
squares  = [x*x for x in range(100)]
```
### lambda functions
* A quick way to write small one liner functions, and an argument for many filter style, comparison functions.

```python
# Basic lambda function
square = lambda x: x ** 2
print(square(5))  # Output: 25

# Lambda with multiple arguments
add = lambda x, y: x + y
print(add(3, 4))  # Output: 7

# Lambda with conditional expression
is_even = lambda x: True if x % 2 == 0 else False
print(is_even(4))  # Output: True
print(is_even(7))  # Output: False

# Using lambda with built-in functions
numbers = [1, 2, 3, 4, 5]
squared_numbers = list(map(lambda x: x ** 2, numbers))
print(squared_numbers)  # Output: [1, 4, 9, 16, 25]

# Using lambda with filter()
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(even_numbers)  # Output: [2, 4]

# Using lambda with sorted()
pairs = [(1, 'one'), (3, 'three'), (2, 'two'), (4, 'four')]
sorted_pairs = sorted(pairs, key=lambda x: x[1])
print(sorted_pairs)  # Output: [(4, 'four'), (1, 'one')
```

### How to use common builtin functions
sum(), min(), max(), 
* join()
* sort()
* 
### 
Syntax basics overview:


### Python decorators
Functions in python can be passed around like objects in python (in javascript as well)

## OOP in python
classes
`__init__()`
` __str__() and __repr__()`
`self` and `super`
private members



## External python things to know
python environments, pip, python3, 

Challenge: Implement a linked list in python!