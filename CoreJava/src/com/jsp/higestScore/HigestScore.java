package com.jsp.higestScore;

public class HigestScore {
	public static void main(String[] args) {
		
		String s1="team A score 4500 marks"; 
		String s2="team B score 60 marks";
		String s3="team C score 55 marks";
		String s4="team D score 100 marks";
		String s5="team E score 900 marks";
		String[] arr= {s1,s2,s3,s4,s5};
		int[] ac=new int[arr.length];
	
		for (int i = 0; i < arr.length; i++) 
		{
			char[] a=arr[i].toCharArray();
			String tv="";
			for (int j = 0; j < a.length; j++) 
			{
				if(a[j]>=48 && a[j]<=57)
				{
					tv=tv+a[j];
					
				}
				
			}
			int nVar=Integer.parseInt(tv);
			ac[i]=nVar;
		}
		int big=ac[0];
		for (int i = 1; i < ac.length; i++) {
			if(ac[i]>big)
			{
				big=ac[i];
			}
		}
		for (int i = 0; i < ac.length; i++) {
			if(ac[i]==big)
			{
				System.out.println(" The higest is "+ arr[i]);
			}
		}
	}

}
