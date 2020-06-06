package com.company.Line;

import com.company.Ishape;

import javax.sound.sampled.Line;

public class line implements Ishape {
    public Arrow_line arrow_line_son;
    public line() {
        super();
    }

    @Override
    public void Draw() {

    }

    @Override
    public void setCoordinate(int x, int y) {

    }
    public void  Draw1(Arrow_line arrow_line_son) {
        this.arrow_line_son=arrow_line_son;

    }
}
