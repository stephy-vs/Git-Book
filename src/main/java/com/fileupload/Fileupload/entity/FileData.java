package com.fileupload.Fileupload.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "filetable")
@Builder
public class FileData {
    //primaryKey
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //user name
    @Column(name = "name")
    private String name;

    //user type
    @Column(name = "type")
    private String type;

    //profile photo
    @Lob
    @Column(name = "imagedata",length = 10000)
    private byte[] imagedata;

    //userId foreign key
    @ManyToOne
    @JoinColumn(name = "uId")
    private UsersModel usersModel;

}
