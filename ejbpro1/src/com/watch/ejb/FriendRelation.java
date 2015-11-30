package com.watch.ejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_friend_relation MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-22 16:58:55
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_friend_relation")
public class FriendRelation   implements Serializable {
    @Id
	@Column(name = "FRelationID")
	private String frelationid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FUserIDStr")
	private String fuseridstr;
    
	@Column(name = "FFriendID")
	private String ffriendid;
    
	@Column(name = "FCategory")
	private Integer fcategory;
    
	@Column(name = "FOrder")
	private Integer forder;
    
	@Column(name = "FLevel")
	private Integer flevel;
    
	@Column(name = "FIsDelete")
	private Integer fisdelete;
    
	@Column(name = "FStatus")
	private Integer fstatus;
    
	@Column(name = "FStatusTime")
	private java.sql.Timestamp fstatustime;
    
	@Column(name = "FAttachText")
	private String fattachtext;
    
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
	
	private String friendname;
	
	private String fmobile;
	
	private String fusername;
	

	private String fusermobile;
	private String frompic;
	private String topic;
	
	public String getFrompic() {
		return frompic;
	}

	public void setFrompic(String frompic) {
		this.frompic = frompic;
	}
	

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getFusername() {
		return fusername;
	}

	public void setFusername(String fusername) {
		this.fusername = fusername;
	}

	
	public String getFusermobile() {
		return fusermobile;
	}

	public void setFusermobile(String fusermobile) {
		this.fusermobile = fusermobile;
	}

	public String getFmobile() {
		return fmobile;
	}

	public void setFmobile(String fmobile) {
		this.fmobile = fmobile;
	}

	public String getFriendname() {
		return friendname;
	}

	public void setFriendname(String friendname) {
		this.friendname = friendname;
	}

	public String getFrelationid() {
		return frelationid;
	}
    
	public void setFrelationid(String frelationid) {		     
         this.frelationid = frelationid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public String getFuseridstr() {
		return fuseridstr;
	}
    
	public void setFuseridstr(String fuseridstr) {		     
         this.fuseridstr = fuseridstr;
	}
	public String getFfriendid() {
		return ffriendid;
	}
    
	public void setFfriendid(String ffriendid) {		     
         this.ffriendid = ffriendid;
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
	public Integer getFstatus() {
		return fstatus;
	}
    
	public void setFstatus(Integer fstatus) {		     
         this.fstatus = fstatus;
	}
	public java.sql.Timestamp getFstatustime() {
		return fstatustime;
	}
    
	public void setFstatustime(java.sql.Timestamp fstatustime) {		     
         this.fstatustime = fstatustime;
	}
	public String getFattachtext() {
		return fattachtext;
	}
    
	public void setFattachtext(String fattachtext) {		     
         this.fattachtext = fattachtext;
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

