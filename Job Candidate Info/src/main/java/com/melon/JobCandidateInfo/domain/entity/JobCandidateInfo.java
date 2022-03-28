package com.melon.JobCandidateInfo.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "JobCandidateInfo")
public class JobCandidateInfo {

    private long id;
    private String email;
    private String phone;
    private String city;
    private String notes;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "email", nullable = false, unique = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "phone", nullable = false, unique = false)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "city", nullable = false, unique = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "notes", nullable = false, unique = false)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
