public class MainPercobaan4 {
    public static void main(String[] args) {
        Gerbong gerbong = new Gerbong("A", 10);

        Penumpang p = new Penumpang("12345", "Mr. Krab");
        gerbong.setPenumpang(p, 1);

        Penumpang p2 = new Penumpang("54321", "Anto");
        gerbong.setPenumpang(p2, 1);
        System.out.println(gerbong.info());
    }
}
