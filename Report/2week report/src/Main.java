//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyborad = new Scanner(System.in);
    String age;
    int weight;
    double height;

    System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요 ");

    age = keyborad.nextLine();
    weight = keyborad.nextInt();
    height = keyborad.nextDouble();

    System.out.println("당신의 나이는"+ age + "살 입니다");
    System.out.println("당신의 체중은"+ weight + "kg 입니다");
    System.out.println("당신의 신장은"+ height + "cm 입니다");

}
