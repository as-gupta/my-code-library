'''
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
'''

s=0
e=5
for i in range (5):
    for j in range (s):
        print(end=" ")
    for j in range (e):
        print(end="* ")
    s=s+2
    e=e-1
    print()