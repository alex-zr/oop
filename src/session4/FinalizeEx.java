package session4;

public class FinalizeEx {
    private int[] vector = new int[10000];
    public static void main(String[] args) {
        for (int i = 0; i < 1_000; i++) {
            new FinalizeEx();
        }
    }

    @Override
    public void finalize() {
        System.out.println("Evacuated");
    }
}
