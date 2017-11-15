package com.example.android_razrab.javadocexperiments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

 /** My main class
  * @author Poull*/
public class MainActivity extends AppCompatActivity {

     /** Just a field for demo { @value describing value of variable }*/
  public String stringField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // a
    void firstMethod (){

    }

    /* b */
    void secondMethod(){

    }

    /** some comment
     * @deprecated
     * @exception "exceeptt"
     * @since 2.1
     * @param param just income parameter
     * @return param + "abc"
     *  commentt { @literal @since 2.1 } afteer
     * @see SecondClass#meth()
     * */
    String thirdMethod (String param){

   return param + "abc";
    }

}
