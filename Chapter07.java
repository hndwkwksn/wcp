public class Chapter07 {
    public static void main(String[] args) {
        int distance = 16;
        if (distance <= 5) {
            System.out.println(distance + "はとても近いです");
        } else if (distance <=10) {
            System.out.println(distance + "は近いです");
        } else if (distance <= 15) {
            System.out.println(distance + "は遠いです");
        } else {
            System.out.println(distance + "とても遠いです");
        }

        String color = "green";
        switch (color) {
            case "red":
                System.out.println("赤信号です");
                break;
            case "yellow":
                System.out.println("黄色信号です");
                break;
            case "blue":
                System.out.println("青信号です");
                break;
            default:
                System.out.println("信号の色ではありません");
        }
    }
}