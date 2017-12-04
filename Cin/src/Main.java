import java.util.Scanner;

public class Main {
	
	   
	    public static void main(String[] args) {
//	    	Scanner sca = new Scanner(System.in);  
//	    	Scanner cin=new Scanner(System.in);// 读入  
//			while(cin.hasNext())   //等同于!=EOF  
//			{  
//			 int n;  
//			 n=cin.nextInt(); //读入一个int;  
//			 System.out.print(n);  
//			}  
//	        System.out.println(result);
	    	
	    	//int[] arr = {3,1,4,1,5,9,2,6,5};
	    	
	    	Scanner s = new Scanner(System.in);  
	    	String str = s.nextLine();  
	    	StringBuffer result = new StringBuffer();  
	    	// 字符串长度  
	    	int count = str.length();  
	    	// 取第一个字符  
	    	char word1 = str.charAt(0);  
	    	// 连续字符的个数  
	    	int sum = 1;  
	    	for (int i = 1; i < count; i++) {  
	    	    // 循环取字符  
	    	    char word2 = str.charAt(i);  
	    	    // 把前一个字符和当前字符比较  
	    	    if (word1 == word2) {  
	    	        // 相同的字符 个数加1  
	    	        sum++;  
	    	        continue;  
	    	    }  
	    	    // 拼接字符  
	    	    result.append(sum).append(word1);  
	    	    // 当前字符变为前一个字符  
	    	    word1 = word2;  
	    	    // 个数清零  
	    	    sum = 1;  
	    	}  
	    	// 加上最后一个字符及个数，并打印输出  
	    	System.out.println("字符串压缩后:" + result.append(sum).append(word1));
	    }
	}

