fun main(args: Array<String>) {
    for(i in 1..25){
        print(passwordGenerator())
    }
}

public fun passwordGenerator(): Char {
    var characterArray = arrayOf('0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','A',
        'B','C','D','E','F')

    var generatedCharacter = characterArray[21]

    for(i in characterArray){
        generatedCharacter = characterArray.random()
    }
    return generatedCharacter
}
