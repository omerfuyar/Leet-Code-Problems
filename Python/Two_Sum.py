def TwoSum_1(nums, target):
    for i in range(len(nums)):
        for j in range(i+1,len(nums)):
            if nums[i] + nums[j] == target:
                return [i,j]
    return None

qwe = 123

print(qwe)

print(TwoSum_1([1,2,3,5], 5))

def TwoSum_2(nums, target):
    Map = {}
    for i , curNum in enumerate(nums):
        need = target - curNum
        if need in Map:
            return []
        Map[curNum] = i
    return None

print(TwoSum_2([1,2,3,4],5))