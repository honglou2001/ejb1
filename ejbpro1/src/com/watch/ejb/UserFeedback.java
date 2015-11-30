package com.watch.ejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_user_feedback MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-22 14:54:50
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_user_feedback")
public class UserFeedback   implements Serializable {
    @Id
	@Column(name = "FFeedBackID")
	private String ffeedbackid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FParentID")
	private String fparentid;
    
	@Column(name = "FUserIDStr")
	private String fuseridstr;
    
	@Column(name = "FContent")
	private String fcontent;
    
	@Column(name = "FCategory")
	private Integer fcategory;
    
	@Column(name = "FOrder")
	private Integer forder;
    
	@Column(name = "FLevel")
	private Integer flevel;
    
	@Column(name = "FIsDelete")
	private Integer fisdelete;
    
	@Column(name = "FIsAnswer")
	private Integer fisanswer;
    
	@Column(name = "FDataStatus")
	private Integer fdatastatus;
    
	@Column(name = "FFieldStatus")
	private Integer ffieldstatus;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    

	public String getFfeedbackid() {
		return ffeedbackid;
	}
    
	public void setFfeedbackid(String ffeedbackid) {		     
         this.ffeedbackid = ffeedbackid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public String getFparentid() {
		return fparentid;
	}
    
	public void setFparentid(String fparentid) {		     
         this.fparentid = fparentid;
	}
	public String getFuseridstr() {
		return fuseridstr;
	}
    
	public void setFuseridstr(String fuseridstr) {		     
         this.fuseridstr = fuseridstr;
	}
	public String getFcontent() {
		return fcontent;
	}
    
	public void setFcontent(String fcontent) {		     
         this.fcontent = fcontent;
	}
	public Integer getFcategory() {
		return fcategory;
	}
    
	public void setFcategory(Integer fcategory) {		     
         this.fcategory = fcategory;
	}
	public Integer getForder() {
		return forder;
	}
    
	public void setForder(Integer forder) {		     
         this.forder = forder;
	}
	public Integer getFlevel() {
		return flevel;
	}
    
	public void setFlevel(Integer flevel) {		     
         this.flevel = flevel;
	}
	public Integer getFisdelete() {
		return fisdelete;
	}
    
	public void setFisdelete(Integer fisdelete) {		     
         this.fisdelete = fisdelete;
	}
	public Integer getFisanswer() {
		return fisanswer;
	}
    
	public void setFisanswer(Integer fisanswer) {		     
         this.fisanswer = fisanswer;
	}
	public Integer getFdatastatus() {
		return fdatastatus;
	}
    
	public void setFdatastatus(Integer fdatastatus) {		     
         this.fdatastatus = fdatastatus;
	}
	public Integer getFfieldstatus() {
		return ffieldstatus;
	}
    
	public void setFfieldstatus(Integer ffieldstatus) {		     
         this.ffieldstatus = ffieldstatus;
	}
	public java.sql.Timestamp getFaddtime() {
		return faddtime;
	}
    
	public void setFaddtime(java.sql.Timestamp faddtime) {		     
         this.faddtime = faddtime;
	}
	public java.sql.Timestamp getFupdatetime() {
		return fupdatetime;
	}
    
	public void setFupdatetime(java.sql.Timestamp fupdatetime) {		     
         this.fupdatetime = fupdatetime;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
}
