package utils;

public class EncryptedPasswordGeneratedClass {
	public static void main(String args[]) {

		String plainPassword = "July@123";
		String encryptedPassword = EncryptionUtil.encrypt(plainPassword);
		System.out.println("Encrypted Password: " + encryptedPassword);
	}
}
