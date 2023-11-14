/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.system.level1;

/**
 *
 * @author sandeep
 */
public class Helpers {
    public static boolean isNumber(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
