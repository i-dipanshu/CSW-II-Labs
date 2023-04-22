// Write a program to create a class named it as Address, having member
// variable plot no, at, post and required member function. Create a
// tree map having key as name of a person and value as address. Insert
// required key and value in the created tree map and display it


package Assignment_2B;

import java.util.TreeMap;

public class Q2 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();
        addressMap.put("Sam", new Address("12A", "Main Street", "London"));
        addressMap.put("Michael", new Address("4B", "Park Road", "Mumbai"));
        addressMap.put("David", new Address("10C", "Garden Lane", "Bangalore"));
        addressMap.put("John", new Address("7D", "Green Avenue", "Chennai"));

        // Display the TreeMap
        for (String name : addressMap.keySet()) {
            System.out.println(name + " -> " + addressMap.get(name));
        }
    }
}

class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotNo='" + plotNo + '\'' +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}



