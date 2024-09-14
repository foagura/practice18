public class Practice18 {
    public static void main(String[] args){
        /* ネスト時のbreak文 */
        int num = 0;

        for (int i = 0 ; i < 5 ; i++) {
            switch (i % 2) {
                case 0:
                    num++;
                    break;    // このbreak文で抜けるのはあくまでswitch文の為、for文は継続で実行される
                case 1:
                    break;    // このbreak文で抜けるのはあくまでswitch文の為、for文は継続で実行される
            }
        }
        System.out.println("numの値は" + num);
    }
}
