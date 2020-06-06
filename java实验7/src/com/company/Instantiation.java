package com.company;

import com.company.Arrow_Summary.*;
import com.company.Basic_shape.*;
import com.company.Flow_chart.*;
import com.company.Formula_shape.Add_shape;
import com.company.Formula_shape.Divide_shape;
import com.company.Formula_shape.Multiply_shape;
import com.company.Formula_shape.Subtract_shape;
import com.company.Line.*;
import com.company.Rectangle.*;
import com.company.Stars_and_flags.*;
import com.company.Tagging_shape.*;

public class Instantiation {
//线条
    Straight_line straight_line=new Straight_line();
    Arrow_line arrow_line=new Arrow_line();
    Broken_line broken_line=new Broken_line();
    Curve_line curve_line=new Curve_line();
    Double_arrow_line double_arrow_line=new Double_arrow_line();
    Free_curve_line free_curve_line=new Free_curve_line();
    Freeform_line freeform_line=new Freeform_line();
//箭头
   Cross_arrow cross_arrow=new Cross_arrow();
   Dovetail_arrow dovetail_arrow=new Dovetail_arrow();
   Down_arrow down_arrow=new Down_arrow();
   Left_arc_arrow left_arc_arrow=new Left_arc_arrow();
   Left_arrow left_arrow=new Left_arrow();
   Right_arc_arrow right_arc_arrow=new Right_arc_arrow();
   Right_arrow right_arrow=new Right_arrow();
   Right_Left_arrow right_left_arrow=new Right_Left_arrow();
   Rounded_right_arrow rounded_right_arrow=new Rounded_right_arrow();
   Up_arrow up_arrow=new Up_arrow();
   Up_Down_arrow up_down_arrow=new Up_Down_arrow();
   Virtual_tail_arrow virtual_tail_arrow=new Virtual_tail_arrow();
//基本图形
   Cake_shape cake_shape=new Cake_shape();
   Concentric_circle concentric_circle=new Concentric_circle();
   Cross_shape cross_shape=new Cross_shape();
   Cube cube=new Cube();
   Cylinder cylinder=new Cylinder();
   Diamond diamond=new Diamond();
   Dodecagon dodecagon=new Dodecagon();
   Ellipse ellipse=new Ellipse();
   Heart_shaped heart_shaped=new Heart_shaped();
   Hexagon hexagon=new Hexagon();
   Lightning_shape lightning_shape=new Lightning_shape();
   Moon_shape moon_shape=new Moon_shape();
   Parallelogram parallelogram=new Parallelogram();
   Regular_pentagon regular_pentagon=new Regular_pentagon();
   Right_triangle right_triangle=new Right_triangle();
   Smiling_face smiling_face=new Smiling_face();
   Text_box text_box=new Text_box();
   Trapezoid trapezoid=new Trapezoid();
   Triangle triangle=new Triangle();
   Vertical_text_box vertical_text_box=new Vertical_text_box();
//流程图
   Flow_data flow_data=new Flow_data();
   Flow_decision flow_decision=new Flow_decision();
   Flow_disk flow_disk=new Flow_disk();
   Flow_display flow_display=new Flow_display();
   Flow_document flow_document=new Flow_document();
   Flow_merge flow_merge=new Flow_merge();
   Flow_Multiple_documents flow_multiple_documents=new Flow_Multiple_documents();
   Flow_Predefined_process flow_predefined_process=new Flow_Predefined_process();
   Flow_process flow_process=new Flow_process();
   Flow_sort flow_sort=new Flow_sort();
   Flow_termination flow_termination=new Flow_termination();
   Internal_storage internal_storage=new Internal_storage();
   Optional_process optional_process=new Optional_process();
//运算
   Add_shape add_shape=new Add_shape();
   Divide_shape divide_shape=new Divide_shape();
   Multiply_shape multiply_shape=new Multiply_shape();
   Subtract_shape subtract_shape=new Subtract_shape();
//矩形
   Corner_cut_ectangle corner_cut_ectangle=new Corner_cut_ectangle();
   Corner_double_cut_rectangle corner_double_cut_rectangle=new Corner_double_cut_rectangle();
   Diagonal_cut_rectangle diagonal_cut_rectangle=new Diagonal_cut_rectangle();
   Rectangle rectangle=new Rectangle();
   Rounded_rectangle rounded_rectangle=new Rounded_rectangle();
   Single_rounded_rectangle single_rounded_rectangle=new Single_rounded_rectangle();
//标注
   Cloud_annotation cloud_annotation=new Cloud_annotation();
   Ellipse_dimension ellipse_dimension=new Ellipse_dimension();
   Line_dimension line_dimension=new Line_dimension();
   Rectangular_dimension rectangular_dimension=new Rectangular_dimension();
   Rounded_rectangle_dimension rounded_rectangle_dimension=new Rounded_rectangle_dimension();

//star
   Anterior_convex_band anterior_convex_band=new Anterior_convex_band();
  Cross_shape_star cross_shape_star=new Cross_shape_star();
  Dodecagonal_shape dodecagonal_shape=new Dodecagonal_shape();
  Double_waveform double_waveform=new Double_waveform();
  Explosive_shape explosive_shape=new Explosive_shape();
  Heptagonal_shape heptagonal_shape=new Heptagonal_shape();
  Hexagon_shape hexagon_shape=new Hexagon_shape();
  Octagon_shape octagon_shape=new Octagon_shape();
  Pentagonal_shape pentagonal_shape=new Pentagonal_shape();
  Transverse_roll transverse_roll=new Transverse_roll();
  Upconvex_band upconvex_band=new Upconvex_band();
  Vertical_scroll vertical_scroll=new Vertical_scroll();
  Wave_form wave_form=new Wave_form();
}
