package com.cerengumus.reverselist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arr1 =  arrayListOf<Int>()
        arr1.reversed()
        var arr = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
        //arr = reverseFunc(args = arr,1)
        println("List : " + arr)
        arr.reversed()
        println("List Default Index Reversed: " + arr)
        arr = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
        arr.reversed(2)
        println("List 2.Index Reversed: " + arr)
        arr = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
        arr.reversed(10)
        println("List 10.Index Reversed: " + arr)

    }
    /*reversed extension funstion*/
    fun MutableList<Int>.reversed(index :Int = 0): MutableList<Int> {

        try {
            /*controls array is nul whether or not*/
            if (this == null);

        } catch (exception: ArrayIndexOutOfBoundsException) {
            println("Index Out Of Bounds")
        }finally {

            var low = index
            var high = this.size - 1
            while (low < high)
            {
                /*swapping */
                var temp2 = this[low]
                this[low] = this[high]
                this[high] = temp2
                low++
                high--
            }

        }
        return this
    }
    /*compare extension reversed function*/
    /*fun reverseFunc(args: ArrayList<Int>, index: Int): ArrayList<Int>{
        var temp = 0
        try {
            println("Index Not Out Of Bounds")
            var someValue = args[index]
            temp = 1
        } catch (exception: ArrayIndexOutOfBoundsException) {
            println("Index Out Of Bounds")
        }finally {
           if (temp == 1) {
               var low = index
               var high = args.size - 1
               while (low < high)
               {
                   var temp2 = args[low]
                   args[low] = args[high]
                   args[high] = temp2
                   low++
                   high--
               }
           }
        }
        return args
    }*/

}