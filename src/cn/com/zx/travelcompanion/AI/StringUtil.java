package cn.com.zx.travelcompanion.AI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import cn.com.zx.travelcompanion.bean.IntAndInt;

/**
 * @author cj
 *
 */
public class StringUtil {
	public static int StringArrayDistinctedSize(String[] strings) {
		HashSet<String> strSet = new HashSet<String>();
		for (String string : strings) {
			String[] splited = string.split("\\s+");
			Collections.addAll(strSet, splited);
		}
		return strSet.size();
	}

	public static TreeSet<String> StringArrayDistincted(String[] strings) {
		TreeSet<String> strSet = new TreeSet<String>();
		for (String string : strings) {
			String[] splited = string.split("\\s+");
			Collections.addAll(strSet, splited);
		}
		return strSet;
	}

	public static String[] StringtoArray(String str) {
		TreeSet<String> strSet = new TreeSet<String>();
		String[] splited = str.split("\\s+");
		Collections.addAll(strSet, splited);
		return splited;
	}

	public static String[] ListToString(List<IntAndInt> list) {
		String[] str = new String[1024];
		int j = 0;
		String c = null;
		IntAndInt iti = new IntAndInt();
		int lasti = 0;
		for (int i = 0; i < list.size(); i++) {
			iti = (IntAndInt) list.get(i);
			if (i == 0) {
				c = "\"" + iti.getJ();
				lasti = iti.getI();
			} else if (lasti == iti.getI()) {
				c = c + " " + iti.getJ();
				lasti = iti.getI();
			}else {
				c = c + "\"";
				str[j] = c;
				j++;
				c = "\"" + iti.getJ();
				lasti = iti.getI();
			}
			if (i == (list.size() - 1)) {
				c = c + "\"";
				str[j] = c;
				j++;
			} 
		}
		return str;
	}

	public static void main(String[] args) {
		IntAndInt a1 = new IntAndInt();
		IntAndInt a2 = new IntAndInt();
		IntAndInt a3 = new IntAndInt();
		IntAndInt a4 = new IntAndInt();
		IntAndInt a5 = new IntAndInt();
		IntAndInt a6 = new IntAndInt();
		a1.setI(1);
		a2.setI(1);
		a3.setI(3);
		a4.setI(3);
		a5.setI(3);
		a6.setI(2);
		a1.setJ(1);
		a2.setJ(1);
		a3.setJ(1);
		a4.setJ(1);
		a5.setJ(1);
		a6.setJ(1);
		List<IntAndInt> list = new ArrayList<IntAndInt>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		String[] str = StringUtil.ListToString(list);
		for (String string : str) {
			if (string == null) {
				break;
			}
			System.out.println(string);

		}
	}
	   public static String[] deleteArrayNull(String string[]) {
	        String strArr[] = string;

	        // step1: 定义一个list列表，并循环赋值
	        ArrayList<String> strList = new ArrayList<String>();
	        for (int i = 0; i < strArr.length; i++) {
	        	System.out.println(strArr[i]);
	            strList.add(strArr[i]);
	        }

	        // step2: 删除list列表中所有的空值
	        while (strList.remove(null));
	        while (strList.remove(""));

	        // step3: 把list列表转换给一个新定义的中间数组，并赋值给它
	        String strArrLast[] = strList.toArray(new String[strList.size()]);

	        return strArrLast;
	    }
}
