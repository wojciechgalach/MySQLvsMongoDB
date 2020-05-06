package pl.com.nur.mysqlvsmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MockarooMongo {

    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;
    private String country;
    private int number;

    public MockarooMongo() {
    }

    public MockarooMongo(String first_name, String last_name, String email, String gender, String ip_address, String country, int number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
        this.country = country;
        this.number = number;
    }

    public MockarooMongo(Mockaroo mockaroo) {
        setFirst_name(mockaroo.getFirst_name());
        setLast_name(mockaroo.getLast_name());
        setEmail(mockaroo.getEmail());
        setGender(mockaroo.getGender());
        setIp_address(mockaroo.getIp_address());
        setCountry(mockaroo.getCountry());
        setNumber(mockaroo.getNumber());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MockarooMongo{" +
                "id='" + id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", country='" + country + '\'' +
                ", number=" + number +
                '}';
    }
}
