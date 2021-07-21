public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(12345678);
        timsPhone.powerOn();
        timsPhone.callPhone(12345678);
        timsPhone.answer();

        timsPhone = new MobilePhone(2456789);
//        timsPhone.powerOn();
        timsPhone.callPhone(2456789);
        timsPhone.answer();
    }
}
