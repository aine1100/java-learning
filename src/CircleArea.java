public class CircleArea {
    public static  void main(String[] args){
        double area=AreaOfCircle(30);
        System.out.println(area);
    }
    private static  double AreaOfCircle(double radius){
        double area=Math.PI * radius*radius;
        return area;
    }
}
