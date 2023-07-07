public class DrawTriangle {

    public void drawSideTriangle(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        //頂点に達したら１まで減少する
        for (int k = 1; k < height; k++) {
            for (int l = height; l > k; l--) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void drawDownTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= height * 2 - (i * 2) - 2; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void drawUpTriangle(int height) {
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // #の数分ループ
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void drawDiamond(int height) {
// 上向きの三角形と下向きの三角形を合体するイメージ
        for (int i = 0; i < height; i++) {
            // 空白で表示位置を調整
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // #の数分ループ
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < height * 2 - (i * 2) - 3; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
