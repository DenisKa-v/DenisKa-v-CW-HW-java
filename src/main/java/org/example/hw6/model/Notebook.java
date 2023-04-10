package org.example.hw6.model;

import lombok.Data;

@Data

public class Notebook {
    private Integer _ram;
    private Integer _hd;
    private String _os;
    private String _color;

    public Notebook(int ram, int hd, String os, String color) {
        _ram = ram;
        _hd = hd;
        _os = os;
        _color = color;
    }
}
