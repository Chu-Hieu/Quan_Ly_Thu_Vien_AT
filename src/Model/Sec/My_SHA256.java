package Model.Sec;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class My_SHA256 {
	public static String Hash(String input) {
        try {
            // Tạo một đối tượng MessageDigest với thuật toán băm cụ thể, ví dụ: SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Chuyển đổi dữ liệu đầu vào thành mảng byte
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Chuyển đổi mảng byte thành chuỗi hex để hiển thị kết quả hash
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // In ra kết quả hash
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
	public static void main(String[] args) {
		System.out.println(My_SHA256.Hash("Hoa xinh Gái"));
	}
}
