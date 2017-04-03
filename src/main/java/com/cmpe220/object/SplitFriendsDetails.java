package com.cmpe220.object;

public class SplitFriendsDetails {
	int friendId;
	double amt;
	
	public SplitFriendsDetails(int friendId, double amt) {
		super();
		this.friendId = friendId;
		this.amt = amt;
	}
	
	
	public SplitFriendsDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
}
