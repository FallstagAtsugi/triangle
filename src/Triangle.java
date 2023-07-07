import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("三角形の高さを入力してください(1~10の整数)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int height = Integer.parseInt(input);
        //範囲を確認
        if (height > 10 || height <= 0) {
            System.out.println("入力が不正です");
        } else {
            System.out.println("「" + height + "」が入力されました");
        }

        DrawTriangle drawTriangle = new DrawTriangle();

        drawTriangle.drawSideTriangle(height);
        drawTriangle.drawDownTriangle(height);
        drawTriangle.drawUpTriangle(height);
        drawTriangle.drawDiamond(height);
    }
}
