/*
 * Apache Software License 2.0, (c) Copyright 2012, Evan Summers
 * 
 */
package crocserver.storage.adminuser;

import crocserver.storage.org.Org;
import java.util.Date;
import vellum.entity.AbstractIdEntity;
import vellum.security.KeyStores;

/**
 *
 * @author evan
 */
public class User extends AbstractIdEntity<String> {
    String userName;
    String displayName;
    AdminRole role;
    long orgId;
    Org org;
    boolean enabled = true;
    String email;
    Date inserted;
    Date updated;
    String locality;
    String region;
    String country;
    String createdBy;
    String secondedBy;
    String passwordHash;
    String passwordSalt;
    Date lastLogin;
    String subject;
    
    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }
    
    public User(String userName, String displayName, AdminRole role, boolean enabled) {
        this.userName = userName;
        this.displayName = displayName;
        this.role = role;
        this.enabled = enabled;
    }

    @Override
    public String getId() {
        return userName;
    }

    public void formatSubject() {
        subject = KeyStores.formatDname(email, displayName, userName, locality, region, country);
    }
    
    public Org getOrg() {
        return org;
    }
    
    public void setOrg(Org org) {
        this.org = org;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public long getOrgId() {
        return orgId;
    }
    
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public AdminRole getRole() {
        return role;
    }

    public void setRole(AdminRole role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getSecondedBy() {
        return secondedBy;
    }

    public void setSecondedBy(String secondedBy) {
        this.secondedBy = secondedBy;
    }

    public Date getInserted() {
        return inserted;
    }

    public void setInserted(Date inserted) {
        this.inserted = inserted;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
       
    @Override
    public String toString() {
        return getId().toString();
    }

    
}
