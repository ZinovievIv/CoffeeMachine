import java.util.*
import java.util.Scanner


class CoffeeMachine {
    private var scanner = Scanner(System.`in`)

    var water: Int? = null
    var milk: Int? = null
    var beans: Int? = null

    fun start() {
        println("Кофемашина готова к работе")
        while (true) {
            println("Введите команду")
            var inputCommand = scanner.nextLine()
            when (inputCommand) {
                "выключить" -> {
                    println("До свидания!")
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
                    var inputCommand2 = scanner.nextLine()
                    coffee(inputCommand2)
                }
            }
        }
    }



    fun coffee(i: String) {
        when (i) {
            "Эспрессо" -> {
                if ((checkCoffee(0, 60, 10))) {
                    water = this.water!!.minus(60)
                    beans = this.beans!!.minus(10)
                    println("Эспрессо готов")
                }
            }


            "Американо" -> {
                if (checkCoffee(0, 120, 10)) {
                    water = this.water!!.minus(120)
                    beans = this.beans!!.minus(10)
                    println("Американо готов")
                }
            }

            "Капучино" -> {
                if (checkCoffee(60, 120,20)) {
                    water = this.water!!.minus(120)
                    beans = this.beans!!.minus(20)
                    milk = this.milk!!.minus(60)
                    println("Капучино готов")
                }
            }

            "Латте" -> {
                if (checkCoffee(120,240,20))
                water = this.water!!.minus(240)
                beans = this.beans!!.minus(20)
                milk = this.milk!!.minus(120)
            }

            "назад" -> {
                start()
            }
            else -> {
                println("Рецепт не найден")
            }

        }
    }


    fun checkCoffee(milk: Int, water: Int, beans: Int): Boolean {
        if (milk > this.milk!!) {
            println("Недостаточно молока")
            return false
        } else
        if (water > this.water!!) {
            println("Недостаточно воды")
            return false
        } else
        if (beans > this.beans!!) {
            println("Недостаточно кофе")
            return false
        } else return true
    }
}

// Начните написание программы с публичной функции start().
    // В этот раз мы не даём вам конкретных указаний, как должна быть написана программа.
    // У вас есть полная свобода действией, главное, что бы программа соответствовала ТЗ.
    // Удачи!

fun main() {
   var test = CoffeeMachine()
    test.start()

}