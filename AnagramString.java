import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String str1 = sc.next();
		System.out.println("Enter 2nd string: ");
		String str2 = sc.next();
		
		sc.close();
		
		char[] cArr1 = str1.toCharArray();
		char[] cArr2 = str2.toCharArray();
		
		// sorting char array 1 in ascending order
		for (int i=0; i<cArr1.length-1; i++) {
            for (int j=0; j<cArr1.length-i-1; j++) {
                if (cArr1[j] > cArr1[j+1]) {
                    char temp = cArr1[j];
                    cArr1[j] = cArr1[j+1];
                    cArr1[j+1] = temp;
                }
            }
        }
		
		// sorting char array 2 in ascending order
		for (int i=0; i<cArr2.length-1; i++) {
            for (int j=0; j<cArr2.length-i-1; j++) {
                if (cArr2[j] > cArr2[j+1]) {
                    char temp = cArr2[j];
                    cArr2[j] = cArr2[j+1];
                    cArr2[j+1] = temp;
                }
            }
        }
		
		// converting char array into string
		str1 = String.valueOf(cArr1);
		str2 = String.valueOf(cArr2);
		
		// comparing & checking both sorted string with length
		if(str1.length()== str2.length()) {
			if(str1.equals(str2)) {
				System.out.println("\nStrings are: ANAGRAMS");
			}
		}else {
			System.out.println("\nString are: NOT ANAGRAMS");
		}
		
	}

}

//		Enter 1st string: 
//		bibhuti
//		Enter 2nd string: 
//		hutibib
//		
//		Strings are: ANAGRAMS
