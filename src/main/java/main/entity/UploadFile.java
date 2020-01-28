package main.entity;

import javax.persistence.*;
import java.util.Date;


/**
 * Project DataParser
 * Created by End on янв., 2020
 */
@Entity
@Table(name = "upload_file")
public class UploadFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    long id;

    @Column(name = "filename")
    String filename;

    @Column(name = "data")
    byte[] data;

    @Column(name = "date")
    Date date;

    public UploadFile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
