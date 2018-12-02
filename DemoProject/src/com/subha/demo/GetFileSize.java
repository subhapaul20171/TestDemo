package com.subha.demo;

import java.io.File;

public class GetFileSize {
	
	private static File file = null;

    public  static String getFileSize(File file)
    {
        if (file.length() <= 1000000)
        {
            return getFileSizeInKb();
        }
        else {

            return getFileSizeInMb();
        }
    }

    public static String getFileSizeInKb(){

        return (double)file.length()/1024 + "kb";
    }

    public static String getFileSizeInMb(){

        return (double)file.length()/ (1024 * 1024) + "mb";
    }
}
