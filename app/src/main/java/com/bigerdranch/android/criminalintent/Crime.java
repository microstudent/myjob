package com.bigerdranch.android.criminalintent;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.UUID;



public class Crime {
    public UUID getID() {
        return mID;
    }

    private UUID mID;
    private String mTitle;
    private Date mDate;
    private DateFormat mDateFormat;
    private String dateString;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private boolean mSolved;


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }


    public String getmDate() {
        return dateString;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Crime(){
        //生成唯一标识符
        mID = UUID.randomUUID();
        mDate = new Date();
        mDateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        dateString = mDateFormat.format(new Date());
    }
}
