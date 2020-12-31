package com.nader.aria.base.entities.abstracts;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntityImpl implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Override
    public Long getId(){ return id; }

    @Override
    public void setId(Long id){ this.id = id; }

    @Override
    public Long getVersion(){ return version; }

    @Override
    public void setVersion(Long version){ this.version = version; }

    @Override
    public String toString(){
        return this.getClass().getCanonicalName()+" id = " + this.getId() + " Ver = "+this.getVersion();
    }
}
