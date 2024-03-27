class RemoveDuplicatesfromSortedArray_3
{
    public int removeDuplicates(int[] nums)
    {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        for(int x : nums)
        {
            st.add(x);
        }
        int i = 0;
        for(int val : st)
        {
            nums[i++] = val;
        }
        return st.size();
    }
}
