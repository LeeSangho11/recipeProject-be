package kr.recipeProject.study.vo.todo;

import java.time.LocalDateTime;
import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;


public class TodoModel {

	private int noticeNo;
	private String loginId;
	private String ntcCtg;
	private String noticeTitle;
	private String noticeContent;
	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd", timezone = "Asia/Seoul")
	private Date noticeRegdate;
	private String file_name;
	private String logical_path;
	private String phygical_path;
	private String file_size;
	private String file_ext;
	
	public int getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getNtcCtg() {
		return ntcCtg;
	}
	public void setNtcCtg(String ntcCtg) {
		this.ntcCtg = ntcCtg;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public Date getNoticeRegdate() {
		return noticeRegdate;
	}
	public void setNoticeRegdate(Date noticeRegdate) {
		this.noticeRegdate = noticeRegdate;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getLogical_path() {
		return logical_path;
	}
	public void setLogical_path(String logical_path) {
		this.logical_path = logical_path;
	}
	public String getPhygical_path() {
		return phygical_path;
	}
	public void setPhygical_path(String phygical_path) {
		this.phygical_path = phygical_path;
	}
	public String getFile_size() {
		return file_size;
	}
	public void setFile_size(String file_size) {
		this.file_size = file_size;
	}
	public String getFile_ext() {
		return file_ext;
	}
	public void setFile_ext(String file_ext) {
		this.file_ext = file_ext;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
