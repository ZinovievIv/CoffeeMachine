import java.util.*
import java.util.Scanner


class CoffeeMachine {
    private var scanner = Scanner(System.`in`)

    var water: Int? = 0
    var milk: Int? = 0
    var beans: Int? = 0

    var massage : String = " "


    fun start() {
        println("Кофемашина готова к работе")
        while (true) {
            println("Введите команду")
            var inputCommand = (scanner.nextLine()).lowercase()

            when (inputCommand) {
                "выключить" -> {
                    println("До свидания!")
                    break
                }
                "наполнить" -> {
                    water = 2000
                    milk = 1000
                    beans = 500
                    println("Ингридиенты пополнены")
                }
                "статус" -> println("Ингридиентов осталось: ${water} мл воды\n${milk} мл молока\n${beans} гр кофе")
                "кофе" -> {
                    println("Введите название напитка или назад для возврата в главное меню")
                    var inputCommand2 = (scanner.nextLine()).lowercase()
                    coffee(inputCommand2)
                }
                }
            }
        }



    fun coffee(i: String) {
        when (i) {
            "Эспрессо" -> {
                if ((checkCoffee(0, 60, 10)) == true) {
                    water = this.water!!.minus(60)
                    beans = this.beans!!.minus(10)
                    println("Эспрессо готов")
                } else {
                    println(massage)
                }
            }


            "Американо" -> {
                if (checkCoffee(0, 120, 10) == true) {
                    water = this.water!!.minus(120)
                    beans = this.beans!!.minus(10)
                    println("Американо готов")
                } else {
                    println(massage)
                }
            }

            "Капучино" -> {
                if (checkCoffee(60, 120,20) == true) {
                    water = this.water!!.minus(120)
                    beans = this.beans!!.minus(20)
                    milk = this.milk!!.minus(60)
                    println("Капучино готов")
                } else {
                    println(massage)
                }
            }

            "Латте" -> {
                if (checkCoffee(120, 240, 20) == true) {
                    water = this.water!!.minus(240)
                    beans = this.beans!!.minus(20)
                    milk = this.milk!!.minus(120)
                    println("Латте готов")
                } else {
                    println(massage)
                }
            }

            "назад" -> {
                start()
            }
            else -> {
                println("Рецепт не найден")
                var inputCommand3 = (scanner.nextLine()).lowercase()
                coffee(inputCommand3)
            }

        }
    }


    fun checkCoffee(milk: Int, water: Int, beans: Int): Any {
        if (milk > this.milk!!) {
            massage = "Недостаточно молока"
            return massage
        } else
        if (water > this.water!!) {
            massage = "Недостаточно воды"
            return massage
        } else
        if (beans > this.beans!!) {
            massage = "Недостаточно зерен"
            return massage
        }
        return true
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