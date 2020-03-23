package com.hr.jiashiq.util;

import java.util.ArrayList;
import java.util.List;

import com.hr.entity.SysRight;

public class MyUtil {
	public static List<SysRight> getRightByParentId(List<SysRight> list, Integer parentId) {
		List<SysRight> meun = new ArrayList<SysRight>();
		for (SysRight r : list) {
			if (r.getRightParentCode() == parentId) {
				meun.add(r);
			}
		}
		return meun;
	}
}
