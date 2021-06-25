package com.example.ec.domain;

public enum Region {
    Central_Coast("Central Coast"), Northern_California("Northern California"), Southern_California("Southern California"), Varies("Varies");
    
    private String label;

    private Region(String label) {
        this.label = label;
    }

    public static Region findByLable(String byLabel) {
        for (Region r : Region.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Region{" +
                "label='" + label + '\'' +
                '}';
    }
    
}
