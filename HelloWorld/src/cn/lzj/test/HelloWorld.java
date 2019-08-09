package cn.lzj.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {

	public static String getDatePoor(Date endDate, Date nowDate) {

		long nd = 1000 * 24 * 60 * 60;
		long nh = 1000 * 60 * 60;
		long nm = 1000 * 60;
		// long ns = 1000;
		// 获得两个时间的毫秒时间差异
		long diff = endDate.getTime() - nowDate.getTime();
		// 计算差多少天
		long day = diff / nd;
		// 计算差多少小时
		long hour = diff % nd / nh;
		// 计算差多少分钟
		long min = diff % nd % nh / nm;
		// 计算差多少秒//输出结果
		// long sec = diff % nd % nh % nm / ns;
		return day + "-" + hour + "-" + min + "-";
	}

	public static List<String> getList(List<String> adds) {

		Map<String, Boolean> map = new HashMap<String, Boolean>();
		List<String> oldList = new ArrayList<String>();

		boolean flag;

		for (String string : adds) {
			flag = false;
			if (oldList.size() == 0) {
				oldList.add(string);
				continue;
			} else {
				map.clear();
				for (int i = 0; i < oldList.size(); i++) {

					if (oldList.get(i).equals(string)) {
						map.put("a" + i, true);
					} else {
						map.put("a" + i, false);
					}

				}
				int i = 0;
				for (String s : map.keySet()) {

					if (map.get(s).equals(true)) {
						break;
					}

					i++;

					if (i == map.size()) {
		flag = true;
	}
}

				if (flag) {
					oldList.add(string);
				}
			}
		}

		return oldList;
	}

	public static void change(int i) {
		i = 1;
	}
	
	public static void main(String[] args) {
		int i = 2;
	}
}
