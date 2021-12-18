package com.pb.shapovalova.hw11.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Person implements Serializable {

    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    private Integer id;
    private String fio;
    private Date birthday;
    private String address;
    private List<String> phones;
    private Date modificationDate;

    public Person(String fio, Date birthday, String address, List<String> phones, Date modificationDate) {
        this.id = idGenerator.incrementAndGet();
        this.fio = fio;
        this.birthday = birthday;
        this.address = address;
        this.phones = phones;
        this.modificationDate = modificationDate;
    }

    public Integer getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id)
                && fio.equals(person.fio)
                && birthday.equals(person.birthday)
                && address.equals(person.address)
                && phones.equals(person.phones)
                && modificationDate.equals(person.modificationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, birthday, address, phones, modificationDate);
    }

    @Override
    public java.lang.String toString() {
        return "Person{" +
                "id=" + id +
                ", fio=" + fio +
                ", birthday=" + birthday +
                ", address=" + address +
                ", phones=" + phones +
                ", modificationDate=" + modificationDate +
                '}';
    }
}
