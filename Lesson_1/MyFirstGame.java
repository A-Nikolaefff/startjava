public class MyFirstGame {
    public static void main(String[] args) {
        int answer = 67;
        int bottomLimit = 1;
        int upperLimit = 100;
        int attempt = (bottomLimit + upperLimit) / 2;
        while (attempt != answer) {
            if (attempt < answer) {
                System.out.println("����� " + attempt + " ������ ����, ��� ������� ���������");
                bottomLimit = attempt;
            } else {
                System.out.println("����� " + attempt + " ������ ����, ��� ������� ���������");
                upperLimit = attempt;
            }
            attempt = (bottomLimit + upperLimit) / 2;
        }
        System.out.println("�� ��������!");
    }
}