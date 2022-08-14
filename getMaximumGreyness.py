# Approach 1

def getMaximumGreyness(pixels):
	x = []

	for i in pixels:
		temp = []
		for j in i:
			if j == "0":
				temp.append(0)
			else:
				temp.append(1)
		x.append(temp)

	m, n = len(x), len(x[0])

	p = [[0] * m] * n

	hmap = {}
	R, C = [0]*m, [0]*n

	for i in range(m):
		for j in range(n):
			R[i] += x[i][j]

	for j in range(n):
		for i in range(m):
			C[j] += x[i][j]


	max_ = float("-INF")
	for i in range(m):
		for j in range(n):
			x[i][j] = (R[i] + C[j]) - ((m + n) - (R[i] + C[j]))
			max_ = max(x[i][j], max_)

	return max_


# Approach 2

def grey_value(image):

    white_pixels = 0

    rows = len(image)

    cols = len(image[rows - 1])

    total_pixels = rows * cols

    for i in range(0, rows):

        for j in range(0, cols):

            if image[i][j] == 1:

                white_pixels = 1

    grey_value_of_image = white_pixels / total_pixels

    return grey_value_of_image


if __name__ == "__main__":

    im = [[0, 1, 1, 0], [1, 0, 1, 1], [1, 0, 1, 0], [1, 1, 0, 0]]

    print(grey_value(im))


# Approach 3

def getMaximumGreyness(pixels):

l=[]
for i in range(len(pixels)):
    l.append(list(map(int,pixels[i])))
row_1=[]
for i in range(len(l)):
    k=sum(l[i])
    row_1.append(k)
col_1=[]
for i in range(len(l[0])):
    c=0
    for j in range(len(l)):
        c+=l[j][i]
    col_1.append(c)
m=len(l)
n=len(l[0])
ans=[[0]*n]*m
res=-float("inf")
for i in range(len(l)):
    for j in range(len(l[0])):
        x=row_1[i]
        y=col_1[j]
        ans[i][j]=2*(x+y)-(m+n)
        res=max(res,ans[i][j])
return res
pixels=["011","101","001"]
print(getMaximumGreyness(pixels))


# If any testcases fail let me know i will update as per the suitable approach





# This is complete logic of a Program in Python
# Remaining codes are in-built

# NOTE_

#    I completed this Assessment during Amazon Hackerrank 1st Round 

#   If you can figure out any other Approach to solve this problem, feel free to share me the code 
#   which will help other candidates
#   I would love to hear from you if you've cracked the Interview.
#   beingactual@gmail.com