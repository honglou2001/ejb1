package com.users.ejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_notify_info MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-30 14:25:06
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_notify_info")
public class NotifyInfo   implements Serializable {
    @Id
	@Column(name = "FNotifyID")
	private String fnotifyid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FNotifyType")
	private Integer fnotifytype;
    
	@Column(name = "FTitle")
	private String ftitle;
    
	@Column(name = "FDescription")
	private String fdescription;
    
	@Column(name = "FUserID")
	private String fuserid;
    
	@Column(name = "FSNID")
	private String fsnid;
    
	@Column(name = "FName")
	private String fname;
    
	@Column(name = "FVal1")
	private String fval1;
    
	@Column(name = "FVal2")
	private String fval2;
    
	@Column(name = "FVal3")
	private String fval3;
    
	@Column(name = "FDataStatus")
	private Integer fdatastatus;
    
	@Column(name = "FFieldStatus")
	private Integer ffieldstatus;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    
	@Column(name = "FRemark")
	private String fremark;
    

	public String getFnotifyid() {
		return fnotifyid;
	}
    
	public void setFnotifyid(String fnotifyid) {		     
         this.fnotifyid = fnotifyid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public Integer getFnotifytype() {
		return fnotifytype;
	}
    
	public void setFnotifytype(Integer fnotifytype) {		     
         this.fnotifytype = fnotifytype;
	}
	public String getFtitle() {
		return ftitle;
	}
    
	public void setFtitle(String ftitle) {		     
         this.ftitle = ftitle;
	}
	public String getFdescription() {
		return fdescription;
	}
    
	public void setFdescription(String fdescription) {		     
         this.fdescription = fdescription;
	}
	public String getFuserid() {
		return fuserid;
	}
    
	public void setFuserid(String fuserid) {		     
         this.fuserid = fuserid;
	}
	public String getFsnid() {
		return fsnid;
	}
    
	public void setFsnid(String fsnid) {		     
         this.fsnid = fsnid;
	}
	public String getFname() {
		return fname;
	}
    
	public void setFname(String fname) {		     
         this.fname = fname;
	}
	public String getFval1() {
		return fval1;
	}
    
	public void setFval1(String fval1) {		     
         this.fval1 = fval1;
	}
	public String getFval2() {
		return fval2;
	}
    
	public void setFval2(String fval2) {		     
         this.fval2 = fval2;
	}
	public String getFval3() {
		return fval3;
	}
    
	public void setFval3(String fval3) {		     
         this.fval3 = fval3;
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
	public String getFremark() {
		return fremark;
	}
    
	public void setFremark(String fremark) {		     
         this.fremark = fremark;
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
