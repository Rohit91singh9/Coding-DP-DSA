from typing import List


def getSmallestInefficiencies(nums: List[int], k: int) -> int:
    def possible(guess: int) -> bool:
        # Is there k or more pairs with distance <= guess?
        count = left = 0
        for right in range(1, len(nums)):
            while nums[right] - nums[left] > guess:
                left += 1
            count += right - left
        return count >= k

    nums.sort()
    lo = 0
    hi = nums[-1] - nums[0]
    while lo < hi:
        mi = (lo + hi) // 2
        if possible(mi):
            hi = mi
        else:
            lo = mi + 1

    def getAns(kth: int) -> List[int]:
        # Get k pairs with distance <= kth
        count = left = 0
        ans = []
        for right in range(1, len(nums)):
            while nums[right] - nums[left] > kth:
                left += 1
            ans.append(nums[right] - nums[left])
        return sorted(ans[:k])

    return getAns(lo)

def main():
    e = getSmallestInefficiencies([6, 9, 1], 2)
    print(e)
    e = getSmallestInefficiencies([6, 9, 1, 2, 4, 7, 9, 10], 4)
    print(e)
    e = getSmallestInefficiencies([9,10,7,10,6,1,5,4,9,8], 18)
    print(e)

if __name__ == "__main__":
    main()