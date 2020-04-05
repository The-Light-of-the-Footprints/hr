package com.hr.xxh.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.entity.HumanFileWithBLOBs;
import com.hr.xxh.service.imp.HumanFileServiceImp;

@Controller
@RequestMapping("/HumanFileController")
public class HumanFileController {
	//uuid纯数字生成
	 public static String getUUID(){
	        return UUID.randomUUID().toString().replace("-","");
	    }

	    public static Integer getUUIDInOrderId(){
	        Integer orderId=UUID.randomUUID().toString().hashCode();
	        orderId = orderId < 0 ? -orderId : orderId; //String.hashCode() 值会为空
	        return orderId;
	    }
	
	@Autowired
	HumanFileServiceImp hfs;
	
//	@RequestMapping("/queryAllHumanFile")
//	public String queryAllHumanFile(HttpServletRequest req) {
//		System.out.println("进入了HumanFileController中的query方法....");
//		List<HumanFileWithBLOBs> list = hfs.queryAllHumanFile();
//		int a = list.size();
//		req.setAttribute("Humans", list);
//		req.setAttribute("a", a);
//		return "change_list";
//	}
	
	@RequestMapping("/queryAllHumanFile2")
	public String queryAllHumanFile2(HttpServletRequest req) {
		System.out.println("进入了HumanFileController中的query方法....");
		List<HumanFileWithBLOBs> list = hfs.queryAllHumanFile2();
		int a = list.size();
		req.setAttribute("Humans", list);
		req.setAttribute("a", a);
		return "change_list";
	}
	
	@RequestMapping("/queryAllHumanFile3")
	public String queryAllHumanFile3(HttpServletRequest req) {
		System.out.println("进入了HumanFileController中的query方法....");
		List<HumanFileWithBLOBs> list6 = hfs.queryAllHumanFile3();
		int a = list6.size();
		req.setAttribute("Humans", list6);
		req.setAttribute("a", a);
		return "query_list";
	}
	
	@RequestMapping("/updateHumanFile")
	public String updateByPrimaryKeySelective(HumanFileWithBLOBs hfwb,HttpServletRequest req) {
		System.out.println("进入了HumanFileController中的update方法....");
		System.out.println("修改内容"+hfwb);
		if(hfwb.getFileChangAmount()==null || hfwb.getFileChangAmount() == ' ') {
			hfwb.setFileChangAmount(0);
		}
		hfwb.setFileChangAmount(hfwb.getFileChangAmount()+1);
		System.out.println("变更次数"+hfwb.getFileChangAmount());
		hfs.updateByPrimaryKeySelective(hfwb);
		System.out.println("修改成功!");
		return queryAllHumanFile2(req);
	}
	
	@RequestMapping("/insertHumanFile")
	public String insert(HumanFileWithBLOBs hfwb,HttpServletRequest req) {
		System.out.println("进入了HumanFileController中的insert方法....");
		//修改的时间
		hfwb.setRegistTime(new java.sql.Date(new java.util.Date().getTime()));
		System.out.println();
		//随机生成id
		String ids = "HF"+HumanFileController.getUUIDInOrderId();
		hfwb.setHumanId(ids);
		System.out.println("新增信息:"+hfwb);
		hfs.insert(hfwb);
		System.out.println("添加成功!");
		return queryAllHumanFileByCheck_Stutas(req);
	}
	
	@RequestMapping("/queryAllHumanFileByCheck_Stutas")
	public String queryAllHumanFileByCheck_Stutas(HttpServletRequest req) {
		System.out.println("进入了HumanFileController中的queryCheck_status方法....");
		List<HumanFileWithBLOBs> list2 = hfs.queryAllHumanFileByCheck_Stutas();
		int a = list2.size();
		for (HumanFileWithBLOBs humanFileWithBLOBs : list2) {
			System.out.println(humanFileWithBLOBs);
		}
		req.setAttribute("humanss", list2);
		req.setAttribute("a", a);
		return "check_list";
	}
	//复核通过后
	@RequestMapping("/updateHumanFileCheck")
	public String updateByPrimaryKeySelectiveCheck(HumanFileWithBLOBs hfwb,HttpServletRequest req) {
		System.out.println("进入了HumanFileController中的updateByPrimaryKeySelectiveCheck方法....");
		hfwb.setCheckStatus(1);
		hfwb.setCheckTime(new java.sql.Date(new java.util.Date().getTime()));
		System.out.println("修改内容"+hfwb);
		hfs.updateByPrimaryKeySelective(hfwb);
		System.out.println("修改成功!");
		req.setAttribute("hid", hfwb.getHumanId());
		return "register_choose_picture";
	}
	
	//上传图片
	@RequestMapping("/updateHumanFilePicture")
	public String updatePicture(HumanFileWithBLOBs hfwb,HttpServletRequest req) {
		System.out.println("进入了HumanFileController中的updatePicture方法....");
		System.out.println("上传图片"+hfwb.getHumanPicture()+hfwb.getHumanId());
		hfs.updatePicture(hfwb);
		System.out.println("上传成功!");
		return goUpdateattAchmentNameJsp();
	}
	@RequestMapping("/updateHumanFilePictureJsp")
	public String goupdateHumanFilePictureJsp() {
		return "register_choose_picture";
	}
	
	//上传附件
		@RequestMapping("/updateattAchmentName")
		public String updateattAchmentName(HumanFileWithBLOBs hfwb,HttpServletRequest req) {
			System.out.println("进入了HumanFileController中的updatePicture方法....");
			System.out.println("上传附件"+hfwb.getAttachmentName()+"------"+hfwb.getHumanId());
			hfs.updateattAchmentName(hfwb);
			System.out.println("上传成功!");
			return goupdateHumanFilePictureJsp();
		}
		@RequestMapping("/updateattAchmentNameJsp")
		public String goUpdateattAchmentNameJsp() {
			
			return "register_choose_attachment";
		}
		
	//返回主页
		@RequestMapping("/goIndex")
		public String goIndex(HttpServletRequest req) {
			return queryAllHumanFile2(req);
		}
		//想要删除页面的查询
		@RequestMapping("/queryAllDeleteHumanFile")
		public String queryAllDeleteHumanFile(HttpServletRequest req) {
			System.out.println("进入了HumanFileController中的queryAllDeleteHumanFile方法....");
			List<HumanFileWithBLOBs> list = hfs.queryAllHumanFile2();
			int a = list.size();
			req.setAttribute("Humans", list);
			req.setAttribute("a", a);
			return "delete_list";
		}
		
		//删除档案
		@RequestMapping("/deleteByPrimaryKey")
		public String deleteByPrimaryKey(HumanFileWithBLOBs hfwb,HttpServletRequest req) {
			System.out.println("进入了HumanFileController中的deleteByPrimaryKey方法....");
			System.out.println("删除:"+hfwb);
			hfwb.setCheckStatus(3);
			System.out.println("状态改为已删除:"+hfwb.getCheckStatus());
			hfs.updateDelete(hfwb);
			System.out.println("删除成功!");
			return queryAllDeleteHumanFile(req);
		}
		
		//档案变更模糊查询
		@RequestMapping("/queryAllByName")
		public String queryAllByName(HumanFileWithBLOBs record,HttpServletRequest req) {
			System.out.println("进入了HumanFileController中的queryAllByName方法....");
			List<HumanFileWithBLOBs> list2 = hfs.queryAllByName(record);
			for (HumanFileWithBLOBs humanFileWithBLOBs : list2) {
				System.out.println(humanFileWithBLOBs);
			}
			int a = list2.size();
			req.setAttribute("a", a);
			req.setAttribute("Humans", list2);
			return "change_list";
		}
		//4个模糊查询
		@RequestMapping("/queryAllByCount")
		public String queryAllByCount(HumanFileWithBLOBs record,HttpServletRequest req,String startTime,String endTime){
			System.out.println("进入了HumanFileController中的queryAllByCount方法....");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date startt = null,endt = null;
			try {
				startt = format.parse(startTime);
				endt = format.parse(endTime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(new java.sql.Date(startt.getTime()));
			System.out.println(new java.sql.Date(endt.getTime()));
			List<HumanFileWithBLOBs> list3 = hfs.queryAllByCount(record,new java.sql.Date(startt.getTime()),new java.sql.Date(endt.getTime()));
			for (HumanFileWithBLOBs humanFileWithBLOBs : list3) {
				System.out.println(humanFileWithBLOBs);
			}
			int a = list3.size();
			req.setAttribute("a", a);
			req.setAttribute("Humans", list3);
			return "change_list";
		}
		
		@RequestMapping("/queryAllByQueryLocate")
		public String queryAllByQueryLocate(HumanFileWithBLOBs record,HttpServletRequest req,String startTime,String endTime){
			System.out.println("进入了HumanFileController中的queryAllByQueryLocate方法....");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date startt = null,endt = null;
			try {
				startt = format.parse(startTime);
				endt = format.parse(endTime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(new java.sql.Date(startt.getTime()));
			System.out.println(new java.sql.Date(endt.getTime()));
			List<HumanFileWithBLOBs> list = hfs.queryAllByQueryLocate(record,new java.sql.Date(startt.getTime()),new java.sql.Date(endt.getTime()));
			for (HumanFileWithBLOBs humanFileWithBLOBs : list) {
				System.out.println(humanFileWithBLOBs);
			}
			int a = list.size();
			req.setAttribute("a", a);
			req.setAttribute("Humans", list);
			return "query_list";
		}
		
		@RequestMapping("/queryAllByDeleteLocate")
		public String queryAllByDeleteLocate(HumanFileWithBLOBs record,HttpServletRequest req,String startTime,String endTime){
			System.out.println("进入了HumanFileController中的queryAllByDeleteLocate方法....");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date startt = null,endt = null;
			try {
				startt = format.parse(startTime);
				endt = format.parse(endTime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(new java.sql.Date(startt.getTime()));
			System.out.println(new java.sql.Date(endt.getTime()));
			List<HumanFileWithBLOBs> list = hfs.queryAllByDeleteLocate(record,new java.sql.Date(startt.getTime()),new java.sql.Date(endt.getTime()));
			for (HumanFileWithBLOBs humanFileWithBLOBs : list) {
				System.out.println(humanFileWithBLOBs);
			}
			int a = list.size();
			req.setAttribute("a", a);
			req.setAttribute("Humans", list);
			return "delete_list";
		}
		
		@RequestMapping("/queryAllByRecoveryLocate")
		public String queryAllByRecoveryLocate(HumanFileWithBLOBs record,HttpServletRequest req,String startTime,String endTime){
			System.out.println("进入了HumanFileController中的queryAllByRecoveryLocate方法....");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date startt = null,endt = null;
			try {
				startt = format.parse(startTime);
				endt = format.parse(endTime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(new java.sql.Date(startt.getTime()));
			System.out.println(new java.sql.Date(endt.getTime()));
			List<HumanFileWithBLOBs> list = hfs.queryAllByRecoveryLocate(record,new java.sql.Date(startt.getTime()),new java.sql.Date(endt.getTime()));
			for (HumanFileWithBLOBs humanFileWithBLOBs : list) {
				System.out.println(humanFileWithBLOBs);
			}
			int a = list.size();
			req.setAttribute("a", a);
			req.setAttribute("Humans", list);
			return "recovery_list";
		}
		
		//永久删除
		@RequestMapping("/queryAllHumanFileByCheck_Stutas_delete")
		public String queryAllHumanFileByCheck_Stutas_delete(HttpServletRequest req) {
			System.out.println("进入了HumanFileController中的queryCheck_status方法....");
			List<HumanFileWithBLOBs> list4 = hfs.queryAllHumanFileByCheck_Stutas_delete();
			int a = list4.size();
			for (HumanFileWithBLOBs humanFileWithBLOBs : list4) {
				System.out.println(humanFileWithBLOBs);
			}
			req.setAttribute("humanss", list4);
			req.setAttribute("a", a);
			return "delete_forever_list";
		}
		
		@RequestMapping("/deleteByPrimaryKey2")
		public String deleteByPrimaryKey2(HumanFileWithBLOBs record,HttpServletRequest req) {
			System.out.println("进入了HumanFileController中的deleteByPrimaryKey方法....");
			System.out.println("删除："+record);
			hfs.deleteByPrimaryKey(record.getHumanId());
			System.out.println("删除成功!");
			return queryAllHumanFileByCheck_Stutas_delete(req);
		}
		
		//模糊查询已删除的数据
		@RequestMapping("/queryAllByDelete")
		public String queryAllByDelete(HumanFileWithBLOBs record,HttpServletRequest req) {
			System.out.println("进入了HumanFileController中的queryAllByDelete方法....");
			List<HumanFileWithBLOBs> list5 = hfs.queryAllByDelete(record);
			for (HumanFileWithBLOBs humanFileWithBLOBs : list5) {
				System.out.println(humanFileWithBLOBs);
			}
			int a = list5.size();
			req.setAttribute("a", a);
			req.setAttribute("humanss", list5);
			return "delete_forever_list";
		}
		
		//模糊查询正常数据
				@RequestMapping("/queryAllByQuery")
				public String queryAllByQuery(HumanFileWithBLOBs record,HttpServletRequest req) {
					System.out.println("进入了HumanFileController中的queryAllByDelete方法....");
					List<HumanFileWithBLOBs> list7 = hfs.queryAllByQuery(record);
					for (HumanFileWithBLOBs humanFileWithBLOBs : list7) {
						System.out.println(humanFileWithBLOBs);
					}
					int a = list7.size();
					req.setAttribute("a", a);
					req.setAttribute("Humans", list7);
					return "query_list";
				}
				
				//想要恢复的档案的查询
				@RequestMapping("/queryAllRecovery")
				public String queryAllRecovery(HttpServletRequest req) {
					System.out.println("进入了HumanFileController中的queryCheck_status方法....");
					List<HumanFileWithBLOBs> list8 = hfs.queryAllHumanFileByCheck_Stutas_delete();
					int a = list8.size();
					for (HumanFileWithBLOBs humanFileWithBLOBs : list8) {
						System.out.println(humanFileWithBLOBs);
					}
					req.setAttribute("Humans", list8);
					req.setAttribute("a", a);
					return "recovery_list";
				}
				
				//档案恢复
				@RequestMapping("/humanRecovery")
				public String humanRecovery(HumanFileWithBLOBs hfwb,HttpServletRequest req) {
					System.out.println("进入了HumanFileController中的deleteByPrimaryKey方法....");
					System.out.println("恢复:"+hfwb);
					hfwb.setCheckStatus(1);
					hfwb.setRecoveryTime(new java.sql.Date(new java.util.Date().getTime()));
					System.out.println("状态改为已恢复:"+hfwb.getCheckStatus());
					hfs.updateDelete(hfwb);
					System.out.println("恢复成功!");
					return queryAllDeleteHumanFile(req);
				}
				
				//档案恢复模糊查询
				@RequestMapping("/queryAllByRecovery")
				public String queryAllByRecovery(HumanFileWithBLOBs record,HttpServletRequest req) {
					System.out.println("进入了HumanFileController中的queryAllByDelete方法....");
					List<HumanFileWithBLOBs> list9 = hfs.queryAllByDelete(record);
					for (HumanFileWithBLOBs humanFileWithBLOBs : list9) {
						System.out.println(humanFileWithBLOBs);
					}
					int a = list9.size();
					req.setAttribute("a", a);
					req.setAttribute("Humans", list9);
					return "recovery_list";
				}
}
