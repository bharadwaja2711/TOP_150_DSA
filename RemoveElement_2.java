class RemoveElement_2
{
    public int removeElement(int[] nums, int val)
    {
        int[] sol = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                sol[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = sol[i];
        }
        return j;
    }
}
