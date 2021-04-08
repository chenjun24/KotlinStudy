package com.cj.kotlinstudy.java;

public interface CallAdapter<R, T>  {
    Type responseType();
    T adapt(Call<R> call);
}
