package org.comstudy.myweb.model;

import java.util.List;

public class MemoDAO {
	
	public List<Memo> getAllMemos() {
		System.out.println(">>>> getAllMemos() ...");
		return null;
	}

	public Memo getMemoById(int id) {
		System.out.println(">>>> getMemoById() ...");
		return null;
	}

	public void addMemo(Memo memo) {
		System.out.println(">>>> addMemo() ...");
	}

	public void updateMemo(Memo updatedMemo) {
		System.out.println(">>>> updateMemo() ...");
	}

	public void deleteMemo(int id) {
		System.out.println(">>>> deleteMemo() ...");
	}
	
	public static void main(String[] args) {
		MemoDAO dao = new MemoDAO();
		List<Memo> list = dao.getAllMemos();
		System.out.println(list);
	}
}