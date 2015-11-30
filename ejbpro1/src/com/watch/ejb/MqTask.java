package com.watch.ejb;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_mq_task MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-8-16 13:19:22
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_mq_task")
public class MqTask   implements Serializable {
    @Id
	@Column(name = "FMQID")
	private String fmqid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FCmd")
	private String fcmd;
    
	@Column(name = "FCmdType")
	private Integer fcmdtype;
    
	@Column(name = "FSrcTable")
	private String fsrctable;
    
	@Column(name = "FSrcColumn")
	private String fsrccolumn;
    
	@Column(name = "FParam")
	private String fparam;
    
	@Column(name = "FTryCount")
	private Integer ftrycount;
    
	@Column(name = "FPriority")
	private Integer fpriority;
    
	@Column(name = "FSendData")
	private String fsenddata;
    
	@Column(name = "FExcTime")
	private java.sql.Timestamp fexctime;
    
	@Column(name = "FExcResult")
	private Integer fexcresult;
    
	@Column(name = "FPlanTime")
	private java.sql.Timestamp fplantime;
    
	@Column(name = "FUserID")
	private String fuserid;
    
	@Column(name = "FSNID")
	private String fsnid;
    
	@Column(name = "FState")
	private Integer fstate;
    
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
    

	public String getFmqid() {
		return fmqid;
	}
    
	public void setFmqid(String fmqid) {		     
         this.fmqid = fmqid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public String getFcmd() {
		return fcmd;
	}
    
	public void setFcmd(String fcmd) {		     
         this.fcmd = fcmd;
	}
	public Integer getFcmdtype() {
		return fcmdtype;
	}
    
	public void setFcmdtype(Integer fcmdtype) {		     
         this.fcmdtype = fcmdtype;
	}
	public String getFsrctable() {
		return fsrctable;
	}
    
	public void setFsrctable(String fsrctable) {		     
         this.fsrctable = fsrctable;
	}
	public String getFsrccolumn() {
		return fsrccolumn;
	}
    
	public void setFsrccolumn(String fsrccolumn) {		     
         this.fsrccolumn = fsrccolumn;
	}
	public String getFparam() {
		return fparam;
	}
    
	public void setFparam(String fparam) {		     
         this.fparam = fparam;
	}
	public Integer getFtrycount() {
		return ftrycount;
	}
    
	public void setFtrycount(Integer ftrycount) {		     
         this.ftrycount = ftrycount;
	}
	public Integer getFpriority() {
		return fpriority;
	}
    
	public void setFpriority(Integer fpriority) {		     
         this.fpriority = fpriority;
	}
	public String getFsenddata() {
		return fsenddata;
	}
    
	public void setFsenddata(String fsenddata) {		     
         this.fsenddata = fsenddata;
	}
	public java.sql.Timestamp getFexctime() {
		return fexctime;
	}
    
	public void setFexctime(java.sql.Timestamp fexctime) {		     
         this.fexctime = fexctime;
	}
	public Integer getFexcresult() {
		return fexcresult;
	}
    
	public void setFexcresult(Integer fexcresult) {		     
         this.fexcresult = fexcresult;
	}
	public java.sql.Timestamp getFplantime() {
		return fplantime;
	}
    
	public void setFplantime(java.sql.Timestamp fplantime) {		     
         this.fplantime = fplantime;
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
	public Integer getFstate() {
		return fstate;
	}
    
	public void setFstate(Integer fstate) {		     
         this.fstate = fstate;
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