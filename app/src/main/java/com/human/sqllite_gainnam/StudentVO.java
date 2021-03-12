package com.human.sqllite_gainnam;

import androidx.annotation.IntegerRes;

/*
    Student class는 XML, DB, mainactivityJava 와 데이터를 GET/SET하기위해
 */
public class StudentVO {
    //VO클래스의 멤버변수(아래) | 클래스 전역변수
    //cursor id(record id) | record: 한 줄에 해당되는 고유값
    private int mId;
    //학년
    private int mGrade;
    //힉번
    private int mNumber;
    //이름
    private String mName;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getmNumber() {
        return mNumber;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
