package com.users.ejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_datauser MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-29 12:16:49
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_serialnumber_datauser")
public class SerialnumberDatauser   implements Serializable {
    private static final long serialVersionUID = 1L;    
    @Id
	@Column(name = "fsndusrid")
	private String fsndusrid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "fappcountid")
	private String fappcountid;
    
	@Column(name = "username")
	private String username;
    
	@Column(name = "realname")
	private String realname;
    
	@Column(name = "nickname")
	private String nickname;
    
	@Column(name = "callname")
	private String callname;
    
	@Column(name = "relation")
	private String relation;
    
	@Column(name = "phone")
	private String phone;
    
	@Column(name = "fpassword")
	private String fpassword;
    
	@Column(name = "sex")
	private String sex;
    
	@Column(name = "fstatus")
	private String fstatus;
    
	@Column(name = "createtime")
	private String createtime;
    
	@Column(name = "fmobile")
	private String fmobile;
    
	@Column(name = "femail")
	private String femail;
    
	@Column(name = "address")
	private String address;
    
	@Column(name = "birthday")
	private String birthday;
    
	@Column(name = "height")
	private String height;
    
	@Column(name = "weight")
	private String weight;
    
	@Column(name = "picture")
	private String picture;
    
	@Column(name = "flogcount")
	private Integer flogcount;
    
	@Column(name = "floglasttime")
	private java.sql.Timestamp floglasttime;
    
	@Column(name = "floglaspip")
	private String floglaspip;
    
	@Column(name = "fienabled")
	private Integer fienabled;
    
	@Column(name = "fdatastatus")
	private Integer fdatastatus;
    
	@Column(name = "fisdeleted")
	private Integer fisdeleted;
    
	@Column(name = "fdeletetime")
	private java.sql.Timestamp fdeletetime;
    
	@Column(name = "flockstatus")
	private Integer flockstatus;
    
	@Column(name = "fremark")
	private String fremark;
    
	@Column(name = "furl")
	private String furl;
    
	@Column(name = "faddress")
	private String faddress;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    

	public String getFsndusrid() {
		return fsndusrid;
	}
    
	public void setFsndusrid(String fsndusrid) {		     
         this.fsndusrid = fsndusrid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public String getFappcountid() {
		return fappcountid;
	}
    
	public void setFappcountid(String fappcountid) {		     
         this.fappcountid = fappcountid;
	}
	public String getUsername() {
		return username;
	}
    
	public void setUsername(String username) {		     
         this.username = username;
	}
	public String getRealname() {
		return realname;
	}
    
	public void setRealname(String realname) {		     
         this.realname = realname;
	}
	public String getNickname() {
		return nickname;
	}
    
	public void setNickname(String nickname) {		     
         this.nickname = nickname;
	}
	public String getCallname() {
		return callname;
	}
    
	public void setCallname(String callname) {		     
         this.callname = callname;
	}
	public String getRelation() {
		return relation;
	}
    
	public void setRelation(String relation) {		     
         this.relation = relation;
	}
	public String getPhone() {
		return phone;
	}
    
	public void setPhone(String phone) {		     
         this.phone = phone;
	}
	public String getFpassword() {
		return fpassword;
	}
    
	public void setFpassword(String fpassword) {		     
         this.fpassword = fpassword;
	}
	public String getSex() {
		return sex;
	}
    
	public void setSex(String sex) {		     
         this.sex = sex;
	}
	public String getFstatus() {
		return fstatus;
	}
    
	public void setFstatus(String fstatus) {		     
         this.fstatus = fstatus;
	}
	public String getCreatetime() {
		return createtime;
	}
    
	public void setCreatetime(String createtime) {		     
         this.createtime = createtime;
	}
	public String getFmobile() {
		return fmobile;
	}
    
	public void setFmobile(String fmobile) {		     
         this.fmobile = fmobile;
	}
	public String getFemail() {
		return femail;
	}
    
	public void setFemail(String femail) {		     
         this.femail = femail;
	}
	public String getAddress() {
		return address;
	}
    
	public void setAddress(String address) {		     
         this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
    
	public void setBirthday(String birthday) {		     
         this.birthday = birthday;
	}
	public String getHeight() {
		return height;
	}
    
	public void setHeight(String height) {		     
         this.height = height;
	}
	public String getWeight() {
		return weight;
	}
    
	public void setWeight(String weight) {		     
         this.weight = weight;
	}
	public String getPicture() {
		return picture;
	}
    
	public void setPicture(String picture) {		     
         this.picture = picture;
	}
	public Integer getFlogcount() {
		return flogcount;
	}
    
	public void setFlogcount(Integer flogcount) {		     
         this.flogcount = flogcount;
	}
	public java.sql.Timestamp getFloglasttime() {
		return floglasttime;
	}
    
	public void setFloglasttime(java.sql.Timestamp floglasttime) {		     
         this.floglasttime = floglasttime;
	}
	public String getFloglaspip() {
		return floglaspip;
	}
    
	public void setFloglaspip(String floglaspip) {		     
         this.floglaspip = floglaspip;
	}
	public Integer getFienabled() {
		return fienabled;
	}
    
	public void setFienabled(Integer fienabled) {		     
         this.fienabled = fienabled;
	}
	public Integer getFdatastatus() {
		return fdatastatus;
	}
    
	public void setFdatastatus(Integer fdatastatus) {		     
         this.fdatastatus = fdatastatus;
	}
	public Integer getFisdeleted() {
		return fisdeleted;
	}
    
	public void setFisdeleted(Integer fisdeleted) {		     
         this.fisdeleted = fisdeleted;
	}
	public java.sql.Timestamp getFdeletetime() {
		return fdeletetime;
	}
    
	public void setFdeletetime(java.sql.Timestamp fdeletetime) {		     
         this.fdeletetime = fdeletetime;
	}
	public Integer getFlockstatus() {
		return flockstatus;
	}
    
	public void setFlockstatus(Integer flockstatus) {		     
         this.flockstatus = flockstatus;
	}
	public String getFremark() {
		return fremark;
	}
    
	public void setFremark(String fremark) {		     
         this.fremark = fremark;
	}
	public String getFurl() {
		return furl;
	}
    
	public void setFurl(String furl) {		     
         this.furl = furl;
	}
	public String getFaddress() {
		return faddress;
	}
    
	public void setFaddress(String faddress) {		     
         this.faddress = faddress;
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
