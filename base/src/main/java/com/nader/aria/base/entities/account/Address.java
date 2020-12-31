package com.nader.aria.base.entities.account;

import com.nader.aria.base.entities.abstracts.BaseEntityImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESSES")
public class Address extends BaseEntityImpl {
    private static final long serialVersionUID = 1L;

    @Column(name="COUNTRY"  )
    private String country;

    @Column(name="CITY"  )
    private String city;

    @Column(name="LINE"  )
    private String line;

    @Column(name="ALLEY"  )
    private String alley;

    @Column(name="FULL_ADDRESS" )
    private String fullAddress;

    @Column(name="NO")
    private String no;

    public  String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getLine() { return line; }
    public void setLine(String line) { this.line = line; }

    public String getAlley() { return alley; }
    public void setAlley(String alley) { this.alley = alley; }

    public String getFullAddress() { return fullAddress; }
    public void setFullAddress( String fullAddress) { this.fullAddress = fullAddress; }

    public String getNo() { return no; }
    public void setNo(String no) { this.no = no; }

}
