public class WeightedQuickUnionFind {
    private int[] id;  
    private int[] subtree; 
    private int count;

    public WeightedQuickUnionFind(int n) 
    {
        count = n;
        id = new int[n];
        subtree = new int[n];
        for (int i = 0; i < n; i ++)
         {
            id[i] = i;
            subtree[i] = i;
        }
    }

    public int count() 
    {
        return count;
    }

    public int find(int p) 
    {
        while (p != id[p])
        {
            p = id[p];
        }
        return p;
    }

    public boolean connected(int p, int q) 
    {
        return find(p) == find(q);
    }

    public void union(int p, int q) 
    {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        if (subtree[i] < subtree[j]) 
        {
            id[i] = j; 
            subtree[j] += subtree[i];
        }
        else 
        {
            id[j] = i;
            subtree[i] += subtree[j];
        }
        count --;
    }
}