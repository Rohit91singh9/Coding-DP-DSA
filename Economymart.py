items_list = [] 
view_index = -1   

def insert_item(item_name, price):     
    global items_list     
    items_list.append([item_name, int(price)])  
    
    def view_item(): global items_list, view_index     
    items_list = sorted(items_list, key=lambda x: (x[1], x[0]))     
    if view_index < len(items_list):         
        item, price = items_list[view_index + 1][0], items_list[view_index + 1][1]         
        view_index += 1     
        print('The item is {} and the respective price is {}'.format(item, price))   
        entries = int(input('Enter the number of entries: ')) 
        for i in range(entries):     
            entry, item, price = input().split()     
            if entry == 'INSERT':         
                insert_item(item, price)     
                if entry == 'VIEW':         
                    view_item() 



# This is complete logic of a Program
# Remaining codes are in-built

"""
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
"""