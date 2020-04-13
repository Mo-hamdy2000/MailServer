package Classes;

import java.util.Date;
import java.util.UUID;

import Interfaces.IFilter;
import Interfaces.IMail;

public class Mail implements IMail {
	/*
	 * ID member is  a unique ID identifies each mail
	 * */
	private String				ID;
	/*
	 * Text member is  a string field carrying the body message of the mail
	 * */
	private String				text;
	/*
	 * Title member is  a string field the title of the mail
	 * */
	private String				Title;
	/*
	 * SenderID member to identify mail's sender
	 * */
	private int					senderID;
	/*
	 * SenderName member to facilitate sender recognition
	 * */
	private String				senderName;
	/*
	 * RecieverID member to identify mail's reciever
	 * */
	private int					recieverID;
	/*
	 * Attachments member carries mail attachments
	 * */
	private SinglyLinkedList	attachments;
	/*
	 * Date member stores mail sending date
	 * */
	private Date 				date;
	/*
	 * Filter member stores mail filter
	 * */
	private IFilter 			filter;
	/*
	 * Priority member stores mail priority
	 * */
	private int 				priority;
	// Adding Replies
	
	public Mail(String title, int senderID, String senderName, Date date, int priority) {
		this.ID = UUID.randomUUID().toString();
		this.Title = title;
		this.senderID = senderID;
		this.senderName = senderName;
		this.date = date;
		this.setPriority(priority);
	}
	
	public Mail(String ID, String title, int senderID, String senderName, Date date, int priority) {
		this.ID = ID;
		this.Title = title;
		this.senderID = senderID;
		this.senderName = senderName;
		this.date = date;
		this.setPriority(priority);
	}
	
	public String getID() {
		return ID;
	}
	
	
	public String getText() {
		return text;
	}
	public void setText(String mailText) {
		this.text = mailText;
	}
	
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	
	
	public int getSenderID() {
		return senderID;
	}
	public void setSenderID(int senderID) {
		this.senderID = senderID;
	}
	
	
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	
	
	public int getRecieverID() {
		return recieverID;
	}
	public void setRecieverID(int recieverID) {
		this.recieverID = recieverID;
	}
	
	
	public SinglyLinkedList getAttachments() {
		return attachments;
	}
	public void setAttachments(SinglyLinkedList attachments) {
		this.attachments = attachments;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public IFilter getFilter() {
		return filter;
	}

	public void setFilter(IFilter filter) {
		this.filter = filter;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
}