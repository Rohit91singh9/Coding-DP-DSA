# Approach 1

def getShopingCart(head,queries):
    if queries=='POP_HEAD':
        head=head.next
        return head
    if queries=='PUSH_HEAD':
        y=head 
        head.insert_node(head_item)
        y.next=head
        return y 
    if queries=="PUSH_TAIL":
        y=head 
        if head==None:
            head.next=head.insert_node(head_item) 
        else:
            while y.next!=None:
                y=y.next 
            y.next=head.insert_node(head_item) 
        return head


# Approach 2

class Node:    # Create Node Class
    def __init__(self, value=None):
        self.value = value
        self.next = None
        return
    def isempty(self):
        return self.value == None

class Link():    # Create Link List
    def __init__(self):   # Initializing head & Tail
        self.head = None
        self.tail = None
    def isempty(self):   # Cheacking for Emptyness
        return self.head == None
    def PUSH_HEAD(self,itemName):    # PUsh_HEAD:- Adding element in head of Link list
        curr = self.head 
        self.head = Node(itemName)
        self.head.next = curr
    def PUSH_TAIL(self,itemName):   # PUsh_TAIL:- Adding element in END of Link list 
        curr = self.head
        while (curr.next != None):
            curr = curr.next
        curr.next = Node(itemName)
    def POP_HEAD(self):   # POP_HEAD:- Remuving element from head of Link list
        if self.isempty():
            return 'List is Alredy Empty'
        else:
            curr = self.head
            self.head = self.head.next
            curr = None
    def __str__(self):   # Displaying Result(Link List)
       curr = self.head
       while(curr.next != None):
           print(str(curr.value))
           curr = curr.next
       return str(curr.value)
   
l=Link()
l.PUSH_HEAD('CUP')
l.PUSH_HEAD('PEN')
l.PUSH_TAIL('FAN')
l.PUSH_HEAD('JAM')
l.POP_HEAD()
l.POP_HEAD()

print(l)   #Printing
