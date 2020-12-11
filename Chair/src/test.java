public class test {
    public static void main(String[] args) {
        Chair stool = new Chair();
        stool.setTop(1,3);
        stool.setMiddle(5,1.5);
        stool.setBottom(1,4);
        System.out.println("Area : " + stool.getArea());
        System.out.println("Vol : " + stool.getVolume());
    }
}
