package noibot;

public class NoiBot {
    public void sapxep(int[] list)
    {
        int i,j;
        for (i=0;i<list.length;i++)
            for (j=i+1;j<list.length;j++)
                if (list[i]>list[j])
                {
                    int temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
    }
}
