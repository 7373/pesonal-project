import java.util.Scanner;

public class Main {
	
	   
	    public static void main(String[] args) {
//	    	Scanner sca = new Scanner(System.in);  
//	    	Scanner cin=new Scanner(System.in);// ����  
//			while(cin.hasNext())   //��ͬ��!=EOF  
//			{  
//			 int n;  
//			 n=cin.nextInt(); //����һ��int;  
//			 System.out.print(n);  
//			}  
//	        System.out.println(result);
	    	
	    	//int[] arr = {3,1,4,1,5,9,2,6,5};
	    	
	    	Scanner s = new Scanner(System.in);  
	    	String str = s.nextLine();  
	    	StringBuffer result = new StringBuffer();  
	    	// �ַ�������  
	    	int count = str.length();  
	    	// ȡ��һ���ַ�  
	    	char word1 = str.charAt(0);  
	    	// �����ַ��ĸ���  
	    	int sum = 1;  
	    	for (int i = 1; i < count; i++) {  
	    	    // ѭ��ȡ�ַ�  
	    	    char word2 = str.charAt(i);  
	    	    // ��ǰһ���ַ��͵�ǰ�ַ��Ƚ�  
	    	    if (word1 == word2) {  
	    	        // ��ͬ���ַ� ������1  
	    	        sum++;  
	    	        continue;  
	    	    }  
	    	    // ƴ���ַ�  
	    	    result.append(sum).append(word1);  
	    	    // ��ǰ�ַ���Ϊǰһ���ַ�  
	    	    word1 = word2;  
	    	    // ��������  
	    	    sum = 1;  
	    	}  
	    	// �������һ���ַ�������������ӡ���  
	    	System.out.println("�ַ���ѹ����:" + result.append(sum).append(word1));
	    }
	}

