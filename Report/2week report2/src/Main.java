
void main() {

    Scanner keyborad = new Scanner(System.in);

    int radius;
    double boxArea;
    double circleArea;
    double Area;

    System.out.println("원의 반지름: ");
    radius = keyborad.nextInt();
    System.out.println("정사각형 면적: ");
    boxArea = (radius)*2 * (radius)*2;
    System.out.println("원의 면적: ");
    circleArea = radius * radius * 3.14;
    System.out.println("구하는 면적: ");
    Area= (boxArea-circleArea);

    System.out.println("정사각형 면적: "+boxArea+ "Cm²");
    System.out.println("원의 면적: "+ circleArea +"Cm²");
    System.out.println("구하는 면적: "+ Area +"Cm²");
}
