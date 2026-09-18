//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyborad = new Scanner(System.in);

    String name;
    int family;
    String location;

    System.out.print("당신의 이름은 ? ");
    name = keyborad.next();
    System.out.printf("%s님의 가족은 몇 명입니까 ? ",name );
    family = keyborad.nextInt();
    System.out.printf("%s님의 가족은 어디에서 살지요  ? ",name);
    location = keyborad.next();

    System.out.println(); // 빈 줄 출력

    System.out.printf("%s님의 가족은  %d명 입니다. ",name, family);
    System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n ", name, location);


}
