package com.cj.testservice;

import android.util.Log;
import android.view.animation.Interpolator;

public class InterpolationDemo implements Interpolator {
    @Override
    public float getInterpolation(float input) {
        Log.d("junchen", "getInterpolation: input--"+input);
        if (input > 0 && input < 0.5){
            return input /10;
        }else{
            return input * input;
        }
//        return 1;
    }
}
