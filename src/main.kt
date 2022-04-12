fun main(){
    var numbers= arrayOf(21,32,8,1,92,25)
    //multiplying indexes//
    println(numbers[3]*numbers[4])
    //adding indexes//
    println(numbers[2]+numbers[4])
    //dividing indexes//
    println(numbers[4]/numbers[2])
    //subtracting indexes//
    println(numbers[5]-numbers[1])
    //getting the index position of a value//
    println(numbers.indexOf(32))
    //sorting arrays//
    var num= arrayOf(21,32,8,1,92,25)
    var sortednums=num.sortedArray()
    println(sortednums.contentToString())
    var names= arrayOf("Judith","lydia","leocadia","molvin")
    println(names.get(2))
    println(names.contentToString())
    names.set(2,"handel")
    println(names.contentToString())




}