package day08;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		char[] answer=generate(5);
		System.out.println(answer);
		Scanner scanner=new Scanner(System.in);
		int num=0,loc=0,score=600;
		do{
			System.out.print("请猜吧：");
			String str=scanner.nextLine();
			char[] input=str.toCharArray();
			System.out.println(input);
			int[] val=check(input, answer);
			num=val[0];
			loc=val[1];
			System.out.println("你猜中了"+num+"个字符！其中"+loc+"个字符位置正确！");
			score-=200;
			if(score==0){
				System.out.println("继续努力！");
				break;
			}	
		}while(num!=5 || loc!=5);
		System.out.println(score);
	}
	
	//生成5个不重复的大写用文字符
	public static char[] generate(int n){
		char[] letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P'
				,'Q','R','S','T','U','V','W','X','Y','Z'};
		boolean[] flags=new boolean[letters.length];
		char[] buf=new char[n];
		Random random=new Random();
		for(int i=0;i<n;i++){
			int index;
			while(true){
				index=random.nextInt(letters.length);
				if(!flags[index]){
					break;
				}	
			}
			char ch=letters[index];
			buf[i]=ch;
			flags[index]=true;
		}
		return buf;
	}
	
	//检查输入与答案之间的关系，返回值为检查的结果
	public static int[] check(char[] input,char[] answer){
		int num=0,loc=0;
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<input.length;j++){
				if(answer[i]==input[j]){
					num++;
					if(i==j){
						loc++;
					}
					break;//跳出j=0这次循环，然后j加1继续判断，再又跳出，又判断
				}
			}
		}
		return new int[]{num,loc};
	}

}
