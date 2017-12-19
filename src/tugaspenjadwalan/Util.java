/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspenjadwalan;

import java.util.Date;

/**
 *
 * @author iqbal
 */
public class Util {
    public static boolean dateRanger(Date start, Date end) {
        Date startTemp = new Date(start.getYear(), start.getMonth(), start.getDay());
        Date endTemp = new Date(end.getYear(), end.getMonth(), end.getDay());
        return startTemp.getTime() <= endTemp.getTime();
    }
}
