def pp(n: int): #convert int to 16 bits
    ans = ''
    for t in range(4):
        for _ in range(4):
            n, i = divmod(n, 2)
            ans += str(i)
        if t < 3:
            ans += ' '
    return ''.join(reversed(ans))

def dc(n: str): #get obratnij code
    return 2**16 - (int(n.replace(' ', ''), base=2) % 2**16)

def a(b: str): #16 bits to |int|
    return int(b.replace(' ', ''), base=2)

def d(n: str): #16bits to int
    if n[0] == '1':
        return (-1) * dc(n)
    else:
        return a(n)
        

    
A = 5567
C = 26281
X1 = A
X2 = C
X3 = A + C
X4 = A + C + C
X5 = C - A
X6 = 65536 - X4
X7 = -X1
X8 = -X2
X9 = -X3
X10 = -X4
X11 = -X5
X12 = -X6

B1 = pp(X1)
B2 = pp(X2)
B3 = pp(X3)
B4 = pp(X4)
B5 = pp(X5)
B6 = pp(X6)
B7 = pp(X7)
B8 = pp(X8)
B9 = pp(X9)
B10 = pp(X10)
B11 = pp(X11)
B12 = pp(X12)
