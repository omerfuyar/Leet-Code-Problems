#include <iostream>
#include <vector>
#include <chrono>
#include <unordered_map>

using namespace std;

vector<int> twoSum_1(vector<int> &nums, int target)
{
    int numCount = nums.size();

    for (int i = 0; i < numCount; i++)
    {
        for (int j = i + 1; j < numCount; j++)
        {
            if (nums[i] + nums[j] == target)
            {
                return {i, j};
            }
        }
    }

    return {0, 0};
}

vector<int> twoSum_2(vector<int> &nums, int target)
{
    unordered_map<int, int> Map{};

    for (int i = 0; i < nums.size(); i++)
    {
        int need = target - nums[i];
        if (Map.find(need) != Map.end())
            return {i, Map[need]};
        Map[nums[i]] = i;
    }

    return {};
}

int main()
{
    vector<int> vctr({1, 2, 3, 4});
    auto CHstart = chrono::high_resolution_clock::now();
    vector<int> output(twoSum_1(vctr, 5));
    auto CHstop = chrono::high_resolution_clock::now();
    auto CHduration = std::chrono::duration_cast<std::chrono::nanoseconds>(CHstart - CHstop);

    std::cout << "Time taken: " << CHduration.count() << " nanoseconds" << std::endl;
    for (int i : output)
        cout << i << " ";

    return 0;
}