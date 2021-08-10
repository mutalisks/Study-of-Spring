package com.luv2code.hibernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {
    //annotate the class as an entity and map to db table

    //define the fields

    //annotate the fields with db column names

    //create constructors
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "youtube_channel")
    private String youtubeChannel;
    @Column(name = "hobby")
    private String hobby;

    //add new field for instructor
    @OneToOne(mappedBy = "instructorDetail", cascade = {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private Instructor instructor;
    public InstructorDetail(){}
    public InstructorDetail(String youtubeChannel, String hobby){
        this.hobby = hobby;
        this.youtubeChannel = youtubeChannel;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getHobby() {
        return hobby;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
