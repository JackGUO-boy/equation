package com.company;

import com.company.Formula_shape.Multiply_shape;
import com.company.Line.Arrow_line;
import com.company.Line.Double_arrow_line;
import com.company.Line.line;

import javax.sound.sampled.Line;
import java.util.Scanner;

public  class UI extends Instantiation{
    int No;
    Menu menu1=new Menu();


    public void output_menu(){
        menu1.First_level_menu();
        switch (input_num()){
            case 1:
                menu1.Line_meau();
                No= input_num();
                switch (No){
                    case 1:   straight_line.Draw();break;
                    case 2:  broken_line.Draw();break;
                    case 3: arrow_line.Draw();break;
                    case 4:curve_line.Draw();break;
                    case 5:  double_arrow_line.Draw();break;
                    case 6:  freeform_line.Draw();break;
                    case 7: free_curve_line.Draw();break;
                }
                break;
            case 2:
                 menu1.Rectangle_menu();
                No= input_num();
                switch (No){
                    case 1:  rectangle.Draw();break;
                    case 2: corner_cut_ectangle.Draw();break;
                    case 3: corner_double_cut_rectangle.Draw();break;
                    case 4:  diagonal_cut_rectangle.Draw();break;
                    case 5: rounded_rectangle.Draw();break;
                    case 6: single_rounded_rectangle.Draw();break;
                }
                break;
            case 3:
                menu1.Arrow_mueu();
                No= input_num();
                switch (No){
                    case 1:  cross_arrow.Draw();break;
                    case 2:  dovetail_arrow.Draw();break;
                    case 3:  down_arrow.Draw();break;
                    case 4:  left_arc_arrow.Draw();break;
                    case 5: left_arrow.Draw();break;
                    case 6:  right_arc_arrow.Draw();break;
                    case 7:  right_arrow.Draw();break;
                    case 8:  right_left_arrow.Draw();break;
                    case 9:  rounded_right_arrow.Draw();break;
                    case 10:  up_arrow.Draw();break;
                    case 11:  up_down_arrow.Draw();break;
                    case 12:  virtual_tail_arrow.Draw();break;
                }
                break;
            case 4:
                menu1.Formual_menu();
                No= input_num();
                switch (No){
                    case 1:  add_shape.Draw();break;
                    case 2:  subtract_shape.Draw();break;
                    case 3: multiply_shape.Draw();break;
                    case 4:  divide_shape.Draw();break;
                }
                break;
            case 5:
                menu1.Flow_menu();
                No= input_num();
                switch (No){
                    case 1:  flow_data.Draw();break;
                    case 2:  flow_decision.Draw();break;
                    case 3:  flow_disk.Draw();break;
                    case 4:  flow_display.Draw();break;
                    case 5: flow_document.Draw();break;
                    case 6:  flow_merge.Draw();break;
                    case 7:  flow_multiple_documents.Draw();break;
                    case 8:  flow_predefined_process.Draw();break;
                    case 9:  flow_process.Draw();break;
                    case 10: flow_sort.Draw();break;
                    case 11: flow_termination.Draw();break;
                    case 12:  internal_storage.Draw();break;
                    case 13:optional_process.Draw();break;
                }
                break;
            case 6:
                menu1.StarFlage_menu();
                No= input_num();
                switch (No){
                    case 1: anterior_convex_band.Draw();break;
                    case 2: cross_shape_star.Draw();break;
                    case 3: dodecagonal_shape.Draw();break;
                    case 4: double_waveform.Draw();break;
                    case 5: explosive_shape.Draw();break;
                    case 6: heptagonal_shape.Draw();break;
                    case 7: hexagon_shape.Draw();break;
                    case 8: octagon_shape.Draw();break;
                    case 9: pentagonal_shape.Draw();break;
                    case 10: transverse_roll.Draw();break;
                    case 11: upconvex_band.Draw();break;
                    case 12: vertical_scroll.Draw();break;
                    case 13: wave_form.Draw();break;
                }
                break;
            case 7:
                menu1.Tagging_munu();
                No= input_num();
                switch (No){
                    case 1: cloud_annotation.Draw();break;
                    case 2: ellipse_dimension.Draw();break;
                    case 3: line_dimension.Draw();break;
                    case 4: rectangular_dimension.Draw();break;
                    case 5: rounded_rectangle_dimension.Draw();break;
                }
                break;
            case 8:
                menu1.Basic_menu();
                No=input_num();
                switch (No){
                    case 1: cake_shape.Draw();break;
                    case 2: concentric_circle.Draw();break;
                    case 3: cross_shape.Draw();break;
                    case 4: cube.Draw();break;
                    case 5: cylinder.Draw();break;
                    case 6: diamond.Draw();break;
                    case 7: dodecagon.Draw();break;
                    case 8: ellipse.Draw();break;
                    case 9: heart_shaped.Draw();break;
                    case 10: hexagon.Draw();break;
                    case 11: lightning_shape.Draw();break;
                    case 12: moon_shape.Draw();break;
                    case 13: parallelogram.Draw();break;
                    case 14: regular_pentagon.Draw();break;
                    case 15: right_triangle.Draw();break;
                    case 16: smiling_face.Draw();break;
                    case 17: text_box.Draw();break;
                    case 18: trapezoid.Draw();break;
                    case 19: triangle.Draw();break;
                    case 20: vertical_text_box.Draw();break;
                }
                break;
        }
    }

public int input_num(){
    Scanner input=new Scanner(System.in);//创建一个键盘扫描对象
    int contents=input.nextInt();
    return contents;
}
public void input_coordinate(){
    System.out.println("请输入起点坐标:如100 100");
    Scanner input_x=new Scanner(System.in);//创建一个键盘扫描对象
    int coordinate_x=input_x.nextInt();

    System.out.println("请输入终点坐标:如200 200");
    Scanner input_y=new Scanner(System.in);//创建一个键盘扫描对象
    int coordinate_y=input_y.nextInt();

}
}
