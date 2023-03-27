/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BALANGANANI
 */
public class TextUtils {
    
    /**
     * Checks if a string is empty.
     * 
     * @param text The string to check.
     * @return true if string is empty, false otherwise.
     */
    public static boolean isEmpty(String text) {
        return text == null || text.trim().length() == 0;
    }
}
