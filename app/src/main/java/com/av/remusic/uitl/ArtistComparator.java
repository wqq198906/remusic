package com.av.remusic.uitl;

import android.util.Log;

import com.av.remusic.info.ArtistInfo;

import java.util.Comparator;

public class ArtistComparator implements Comparator<ArtistInfo> {

    @Override
    public int compare(ArtistInfo a1, ArtistInfo a2) {
        String py1 = a1.artist_sort;
        String py2 = a2.artist_sort;
        Log.e("compare", "py1 =  " + py1 + "   py2  = " + py2);
        // 判断是否为空""  
        if (isEmpty(py1) && isEmpty(py2))
            return 0;
        if (isEmpty(py1))
            return -1;
        if (isEmpty(py2))
            return 1;
        return py1.compareTo(py2);
    }

    private boolean isEmpty(String str) {
        return "".equals(str.trim());
    }
}  