class Car constructor(cmodel: String, oprice: Int, cowner: String, mdrive: Int, cprice: Int) {
    var model: String
    var originalPrice: Int
    var owner: String
    var mileDrive: Int
    var currentPrice: Int

    init {
        this.model = cmodel
        this.originalPrice = oprice
        this.owner = cowner
        this.mileDrive = mdrive
        this.currentPrice = cprice
        println("Object has been created and init called")
        println("--------------------------------")
        println("Car's Model : $model")
        println("Car owner : $owner")
        println("Miles Drive : $mileDrive")
        println("Original Price : $originalPrice")
        println("Current Price : $currentPrice")
        println("--------------------------------\n")

    }

    fun getCarInformation() {
        println("Car's Model : $model")
    }

    fun carOwner() {
        println("Car owner : $owner")
    }

    fun mileDrove() {
        println("Miles Drive : $mileDrive")
    }

    fun getOriginalCarPrice() {
        println("Original Price : $originalPrice")
    }

    fun getCurrentCarPrice() {
        println("Current Price : $currentPrice")
    }

    fun displayCarInfo() {
        getCarInformation()
        carOwner()
        mileDrove()
        getOriginalCarPrice()
        getCurrentCarPrice()
    }


}

fun main() {
    println("Created car1 named object of class Car")
    var car1 = Car("BMW 5 Series ,2020", 300000, "Ayush", 4000, 2850000)

    println("Created car2 named object of class Car")
    var car2 = Car(" Mercedes Maybatch,2021", 50000, "harsh", 40000, 35000)



}
