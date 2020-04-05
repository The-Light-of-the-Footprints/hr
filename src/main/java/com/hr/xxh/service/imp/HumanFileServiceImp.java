package com.hr.xxh.service.imp;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.HumanFileWithBLOBs;
import com.hr.xxh.mapper.HumanFileMapper;
import com.hr.xxh.service.HumanFileService;
@Service
public class HumanFileServiceImp implements HumanFileService {
	
	@Autowired
	HumanFileMapper hfm;

	@Override
	public List<HumanFileWithBLOBs> queryAllHumanFile() {
		return hfm.queryAllHumanFile();
	}

	@Override
	public int updateByPrimaryKeySelective(HumanFileWithBLOBs record) {
		return hfm.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int insert(HumanFileWithBLOBs record) {
		return hfm.insert(record);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllHumanFileByCheck_Stutas() {
		return hfm.queryAllHumanFileByCheck_Stutas();
	}

	@Override
	public int updatePicture(HumanFileWithBLOBs record) {
		return hfm.updatePicture(record);
	}

	@Override
	public int updateattAchmentName(HumanFileWithBLOBs record) {
		return hfm.updateattAchmentName(record);
	}

	@Override
	public int updateDelete(HumanFileWithBLOBs record) {
		return hfm.updateDelete(record);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllByName(HumanFileWithBLOBs record) {
		return hfm.queryAllByName(record);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllHumanFile2() {
		return hfm.queryAllHumanFile2();
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllHumanFileByCheck_Stutas_delete() {
		return hfm.queryAllHumanFileByCheck_Stutas_delete();
	}

	@Override
	public int deleteByPrimaryKey(String humanId) {
		return hfm.deleteByPrimaryKey(humanId);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllByDelete(HumanFileWithBLOBs record) {
		return hfm.queryAllByDelete(record);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllHumanFile3() {
		return hfm.queryAllHumanFile3();
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllByQuery(HumanFileWithBLOBs record) {
		return hfm.queryAllByQuery(record);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllByCount(HumanFileWithBLOBs record,Date startTime, Date endTime) {
		return hfm.queryAllByCount(record,startTime, endTime);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllByQueryLocate(HumanFileWithBLOBs record, Date startTime, Date endTime) {
		return hfm.queryAllByQueryLocate(record, startTime, endTime);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllByDeleteLocate(HumanFileWithBLOBs record, Date startTime, Date endTime) {
		return hfm.queryAllByDeleteLocate(record, startTime, endTime);
	}

	@Override
	public List<HumanFileWithBLOBs> queryAllByRecoveryLocate(HumanFileWithBLOBs record, Date startTime, Date endTime) {
		return hfm.queryAllByRecoveryLocate(record, startTime, endTime);
	}

}
