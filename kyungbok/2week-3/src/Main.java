//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyborad = new Scanner(System.in);
    int radius;
    double 원의면적;

    System.out.println("원의 반지음 입력 (장수형) ? ");
    radius = keyborad.nextInt();

    원의면적 = 3.141592 * radius *radius;

    System.out.print("원의 반지름 : %,d Cm, 원의면적 : %.2f\u33a0\n", radius, 원의면적);
}
