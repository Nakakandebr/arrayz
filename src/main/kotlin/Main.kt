
fun main(){
    get("Bridget","Angel","Tasha","Josephine")
    cities()
    numbers()
    println(getNames("Racheal","Rebecca","Bridget"))
}
//1. Create a function that takes in 4 strings and creates an array out of them then
//prints out the array (2 points)
fun get(num1:String,num2:String,num3:String,num4:String){
    var name= arrayOf(num1,num2,num3,num4)
    println(name.contentToString())

}
//2. Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case. (2 points)
fun cities(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities.map { it.capitalize() })
    println(cities.map {it.capitalize() }.sorted())

}
//3. Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order (2
fun numbers(){
    var numbers = arrayOf(32,17,4,213,78,90,43,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
//4. Create a function that takes in 3 names and returns a string array containing
//all 3 names. (2 points)
fun getNames(name1:String,name2:String,nam3:String):String{
    var nameArray= arrayOf(name1,name2,nam3)
    return (nameArray.contentToString())

}




