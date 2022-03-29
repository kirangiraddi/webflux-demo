package com.example.webfluxdemo.model;

import java.util.ArrayList;

public class Contained{
    public String resourceType;
    public String id;
    public ClinicalStatus clinicalStatus;
    public VerificationStatus verificationStatus;
    public Code code;
    public Subject subject;
    public ArrayList<Participant> participant;
    public String lifecycleStatus;
    public Description description;
}
