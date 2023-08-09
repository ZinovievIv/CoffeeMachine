import java.util.*
import java.util.Scanner


class CoffeeMachine {
    private var scanner = Scanner(System.`in`)

    var water : Int? =null
    var milk : Int? = null
    var beans : Int? = null

    fun start() {
        println("Кофемашина готова к работе")
        while (true) {
            println("Введите команду")
            var inputCommand = scanner.nextLine()
            when (inputCommand) {
                "выключить" -> {
                    println("До свидания!")
                    break
                }

                "наполнить" -> {
                    water = 2000
                    milk = 1000
                    beans = 1000
                    println("Ингридиенты пополнены")
                }
                "статус" -> println("Ингридиентов осталось: ${water} мл воды\n${milk} мл молока\n${beans} гр кофе")
                "кофе" -> {
                    println("Введите название напитка или назад для возврата в главное меню")
                    inputCommand
                    when (inputCommand) {
                        "назад" -> {
                            start()
                        }
                        "Экспрессо" -> {
                            if (water != null) {
                                water = water.minus(60)
                            } else {
                                println("Недостаточно воды")
                            }

                        }

                        else -> {
                            "Рецепт не найден!"
                        }

                    }
                }
            }
        }
    }

    fun checkResourses(water : Int, milk : Int, beans: Int) : Boolean {


        fun testWater(water: Int): Boolean {
            if (water < this.water!!) {
                return false
            }
            return false
        }

        fun  testMilk(milk: Int) : Boolean {
            if (milk < this.milk!!) {
                return false
            }
            return false
        }

        fun  testbeans(milk: Int) : Boolean {
            if (beans < this.beans!!) {
                return false
            }
            return false
        }



    }

}

    class Recepts(name: String, water : Int, beans : Int) {
        var name : String = name
        var water : Int = water
        var beans : Int = beans
        constructor(name: String, water: Int, beans: Int, milk: Int) : this(name, water, beans){
            var milk : Int = milk
        }
    }


// Начните написание программы с публичной функции start().
    // В этот раз мы не даём вам конкретных указаний, как должна быть написана программа.
    // У вас есть полная свобода действией, главное, что бы программа соответствовала ТЗ.
    // Удачи!



fun main() {
    var capuchino = Recepts("Капучино", 3000, 50, 1000)
    println(capuchino.water)
}