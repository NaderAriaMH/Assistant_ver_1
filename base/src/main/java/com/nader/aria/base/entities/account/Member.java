package com.nader.aria.base.entities.account;

import com.nader.aria.base.entities.abstracts.BaseEntityImpl;

import javax.persistence.*;

@Entity
@Table(name="MEMBERS")
@DiscriminatorValue("MEMBER")
public class Member extends BaseEntityImpl {

    private static final long serialVersionUID = 1L;

    @Lob
    @Column(name="IMAGE"  )
    private byte[] image;

    public byte[] getImage() { return image; }
    public void setImage(byte[] image) { this.image = image; }

}
