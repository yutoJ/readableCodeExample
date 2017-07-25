package ex2;

public class Exe2 {

    public static void main(String[] args) {
        String telephoneNumber = "09812345678";
        Telephone telephone = new Telephone(telephoneNumber);

        String IllegalTelephoneNumber = "098123456789999";
        Telephone illegalTelephone = new Telephone(IllegalTelephoneNumber);
    }
}
