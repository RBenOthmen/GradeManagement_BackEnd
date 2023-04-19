package com.example.grademanagement_hamzarami.models;

import jakarta.persistence.*;

@Entity
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private int web;
    private int AI;
    private int Data_mining;
    private int python;
    private int document_management;
    private int dev_ops;


    public Subjects() {}

    public Subjects(int web, int AI, int data_mining, int python, int document_management, int dev_ops) {
        this.web = web;
        this.AI = AI;
        Data_mining = data_mining;
        this.python = python;
        this.document_management = document_management;
        this.dev_ops = dev_ops;
    }


    public Long getId() {
        return id;
    }

    public int getWeb() {
        return web;
    }

    public void setWeb(int web) {
        this.web = web;
    }

    public int getAI() {
        return AI;
    }

    public void setAI(int AI) {
        this.AI = AI;
    }

    public int getData_mining() {
        return Data_mining;
    }

    public void setData_mining(int data_mining) {
        Data_mining = data_mining;
    }

    public int getPython() {
        return python;
    }

    public void setPython(int python) {
        this.python = python;
    }

    public int getDocument_management() {
        return document_management;
    }

    public void setDocument_management(int document_management) {
        this.document_management = document_management;
    }

    public int getDev_ops() {
        return dev_ops;
    }

    public void setDev_ops(int dev_ops) {
        this.dev_ops = dev_ops;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", web=" + web +
                ", AI=" + AI +
                ", Data_mining=" + Data_mining +
                ", python=" + python +
                ", document_management=" + document_management +
                ", dev_ops=" + dev_ops +
                '}';
    }
}
