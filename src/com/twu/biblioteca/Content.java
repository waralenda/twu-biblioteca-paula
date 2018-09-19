package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Content {
    protected List<Rentable> availableContent;
    protected List<Rentable> unavailableContent;


    public Content(List<Rentable> contents) {
        this.availableContent= contents;
        this.unavailableContent = new ArrayList<Rentable>();
    }


    public List<Rentable> getContents() {
        List<Rentable> contents = new ArrayList<Rentable>();
        contents.addAll(this.availableContent);
        contents.addAll(this.unavailableContent);
        return contents;
    }

    public List<Rentable> getAvailableContent() {
        return this.availableContent;
    }

    public List<Rentable> getUnavailableContent() {
        return this.unavailableContent;
    }

    boolean checkoutItem(Rentable r){
        if (this.getAvailableContent().contains(r)) {
            this.availableContent.remove(r);
            this.unavailableContent.add(r);
            return true;
        }
        else {
            return false;
        }
    }

    boolean returnItem(Rentable r){
        if (this.getUnavailableContent().contains(r)) {
            this.unavailableContent.remove(r);
            this.availableContent.add(r);
            return true;
        }
        else {
            return false;
        }
    }


}
