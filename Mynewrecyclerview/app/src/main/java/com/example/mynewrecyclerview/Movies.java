package com.example.mynewrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable {
    private String course_name;
    private String keterangan;
    private int course_image;
//constructor
    public Movies(String course_name, String keterangan, int course_image) {
        this.course_name = course_name;
        this.keterangan = keterangan;
        this.course_image = course_image;
    }
// getter setter
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getCourse_image() {
        return course_image;
    }

    public void setCourse_image(int course_image) {
        this.course_image = course_image;
    }

//parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.course_name);
        dest.writeString(this.keterangan);
        dest.writeInt(this.course_image);
    }

    public void readFromParcel(Parcel source) {
        this.course_name = source.readString();
        this.keterangan = source.readString();
        this.course_image = source.readInt();
    }

    protected Movies(Parcel in) {
        this.course_name = in.readString();
        this.keterangan = in.readString();
        this.course_image = in.readInt();
    }

    public static final Creator<Movies> CREATOR = new Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies(source);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };
}
