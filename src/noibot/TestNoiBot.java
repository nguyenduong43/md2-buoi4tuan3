package noibot;

public class TestNoiBot {
    public static void main(String[] args) {
        NoiBot noibot = new NoiBot();
        int[] list = {3,4,1,8,9,7,6};
        noibot.sapxep(list);
        for (int x : list) {
            System.out.print(x+" ");
        }

    }
}
