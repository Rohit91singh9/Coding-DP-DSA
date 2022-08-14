from collections import Counter

def solution(word):
    charsCount = Counter(word)
    mostCommonChars = charsCount.most_common()

    keyPad = [[] for i in range(9)]
    totalClickCounts = 0
    currKeypadIndex = 1
    for char, occ in mostCommonChars:
        keyPad[currKeypadIndex - 1].append(char)
        buttonPosition = keyPad[currKeypadIndex - 1].index(char) + 1 # since lists are 0-indexed and to avoid zero multiplication

        totalClickCounts += occ * buttonPosition
        currKeypadIndex = (currKeypadIndex + 1) % 9

    print(keyPad)
    return totalClickCounts

word1 = "abacadefghibj"
word2 = "abcghdiefjoba"

print(f"Min num of clicks (1) : {solution(word1)}" )
print(f"Min num of clicks (2) : {solution(word2)}" )