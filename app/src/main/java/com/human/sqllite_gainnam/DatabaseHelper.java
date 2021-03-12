package com.human.sqllite_gainnam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/*
DatabaseHelper class는 DB생성  및 테이블 샏성을 처리하는 기능
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    //멤버 변수 생성(아래) - 쿼리구문
    private String CreateTableStudent = "CREATE TABLE student (" +
            "id INTEGER PRIMARY KEY" +
            ",grade INTEGER" +
            ",number INTEGER" +
            ",name TEXT" +
            ")";

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        //아래부분이 신규데이터베이스 생성하는 생성자(현재컨텐츠this, DB명, factory명, 버전)
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    //신규 테이블 만들기
        db.execSQL(CreateTableStudent);//학생테이블
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
