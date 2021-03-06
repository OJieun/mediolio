package com.mediolio.vo;

/*
 *  DB I/O에 사용 - 데이터를 담는 객체 class
 * */

public class PushVO {
	private int m_id, p_id, r_id, author_m_id;
	private String m_studentID, m_name, act_date, p_title, act_type;
	
	public String getM_studentID() {
		return m_studentID;
	}
	public void setM_studentID(String m_studentID) {
		this.m_studentID = m_studentID;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	
	public int getAuthor_m_id() {
		return author_m_id;
	}
	public void setAuthor_m_id(int author_m_id) {
		this.author_m_id = author_m_id;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getAct_date() {
		return act_date;
	}
	public void setAct_date(String act_date) {
		this.act_date = act_date;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getAct_type() {
		return act_type;
	}
	public void setAct_type(String act_type) {
		this.act_type = act_type;
	}

}
