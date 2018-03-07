package ru.suleymanovtat.baseadapterapplication.model;

/**
 * Created by suleymanovtat on 06.03.2018.
 */

public class Contact {
    private String name;
    private String phone;
    private String title;
    private boolean isHeader;

    public Contact(String name, String phone, String title, boolean isHeader) {
        this.name = name;
        this.phone = phone;
        this.title = title;
        this.isHeader = isHeader;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getTitle() {
        return title;
    }

    public boolean isHeader() {
        return isHeader;
    }
}