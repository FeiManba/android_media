package com.mrzang.medialibrary.loader;

import android.content.Context;

/**
 * @author mr.zang
 * date 2019-12-15
 * desc: 创建MediaLoader 类
 */
public class MediaLoader {

    private static MediaLoader instance;
    private Context context;

    private MediaLoader(Context context) {
        this.context = context;
    }

    public static MediaLoader getInstance(Context context) {
        if (instance == null) {
            synchronized (MediaLoader.class) {
                instance = new MediaLoader(context);
            }
        }
        return instance;
    }

}
