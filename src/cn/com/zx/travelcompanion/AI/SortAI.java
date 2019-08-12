package cn.com.zx.travelcompanion.AI;

public class SortAI {
	public String[] sort(double[] recommd,String[] user){
		String[] s=new String[10];
		int record=0;
		double max=-1;
		for(int j=0;j<10;j++)
		{
			for (int i = 0; i < recommd.length-1; i++) {
				if(max<recommd[i]){
					record=i;
					max=recommd[i];
				}
			}
			recommd[record]=-1;
			s[j]=user[record];
			max=-1;
			record=0;
			
		}
		for (String string : s) {
			System.out.print(string+",");
		}
		return s;
	}

}
