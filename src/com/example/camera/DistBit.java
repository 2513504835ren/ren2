package com.example.camera;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;

public class DistBit {
	    // 获取指定Activity的截屏，保存到png文件  
	
	private static float X;
	private static float Y;
  
    static Bitmap takeScreenShot(Activity activity,Bitmap bm) {  
  
        Log.i("TAG","tackScreenShot"); 
        
        X = activity.getResources().getDisplayMetrics().widthPixels;
		Y = activity.getResources().getDisplayMetrics().heightPixels;
  
        // 获取状况栏高度  
		float left = (X/25);
		float top = (Y/8);
		float right = (24*X/25);
		float bottom = ((Y/8)+(Y/12));
		float Y1 = bm.getHeight();
		float X1 = bm.getWidth();
		
		//Bitmap b = Bitmap.createBitmap(b1, 0, 25, 320, 455); 
		
        Bitmap b = Bitmap.createBitmap(bm,(int)(left/X*X1), (int)(top/Y*Y1), 
        		(int)((right-left)/X*X1), (int)((bottom-top)/Y*Y1));  
        return b;  
    }  
  
    // 保存到sdcard
    
//    private static void savePic(Bitmap b, String strFileName) {  
//  
//        FileOutputStream fos = null;  
//        try {  
//            fos = new FileOutputStream(strFileName);  
//            if (null != fos) {  
//                b.compress(Bitmap.CompressFormat.PNG, 90, fos);  
//                fos.flush();  
//                fos.close();  
//                Log.i("TAG","save pic");  
//            }  
//        } catch (FileNotFoundException e) {  
//            e.printStackTrace();  
//        } catch (IOException e) {  
//            e.printStackTrace();  
//        }  
//    }  
  
  
    public static Bitmap shoot(Activity a,String b,Bitmap bm) {  
        //ScreenShot.savePic(ScreenShot.takeScreenShot(a), "sdcard/xx.png");  
        Log.i("TAG","shot");  
        Bitmap bitmap = DistBit.takeScreenShot(a,bm);  
        //savePic(bm, b);
		return bitmap;  
    }  
} 
