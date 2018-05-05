package src;

public class MasterCardMask {

	public static String maskify(String str) {
		
		StringBuilder masked = new StringBuilder(str);
		int idx = 0;
		if (masked.length() > 4) {
			int limit = masked.length() - 4; 
			while (idx < limit) {
			masked.setCharAt(idx, 'X');
			idx++;
			}
		}
        return masked.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MasterCardMask.maskify("testing"));

	}

}
