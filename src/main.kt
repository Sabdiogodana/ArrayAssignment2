fun main(){
var result = productArray(arrayOf(32,15,4,))
    println(result)
   var length= takeVowels(arrayOf('a','b','c','d','f','e','i','o','u'))
    println(length)
    var m =mixedArray(arrayOf(60,44.2,12,15.5,"Milk",true,'w'))
    println(m)

}
fun productArray(nums:Array<Int>):Int{
    var product =1
    nums.forEach{ num ->
        product *=num

    }
    return (product)
}

fun takeVowels(irabu:Array<Char>):Int{
    var vowel=0
    irabu.forEach { name->
        if (name== 'a' || name== 'e' || name == 'i'|| name == 'o'|| name=='u') {
            vowel++


        }

        }
    return vowel

    }
fun mixedArray(mix:Array<Any>):Double{
  var y =0.0
  mix.forEach{ d ->
      if(d is Double){
          y+=d

  }

}
 return y
   }