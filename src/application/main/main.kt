package application.main

import application.main.providers.IdentityProvider

fun main(args: Array<String>) {

    val provider = IdentityProvider()

    val userInput = args.toString().split(" ").toList()

    for (i in userInput) {

        println("in loop")
        if (args.contains("-login") && args.contains("-pass")) {
            println("in if")

            val user = provider.identityProvide(
                args[args.indexOf("-login") + 1],
                args[args.indexOf("-pass") + 1]
            )

            println(user)
//            application.main.doLogin(args[args.indexOf("-login") + 1])
        }

//        if (args.contains("-pass")) {
//            application.main.doPass(args[args.indexOf("-pass") + 1])
//        }
//
//        if (args.contains("-res")) {
//            application.main.doRes(args[args.indexOf("-res") + 1])
//        }
//
//        if (args.contains("-role")) {
//            application.main.doRole(args[args.indexOf("-role") + 1])
//        }
//
//        if (args.contains("-ds")) {
//            application.main.doDs(args[args.indexOf("-ds") + 1])
//        }
//
//        if (args.contains("-de")) {
//            application.main.doDe(args[args.indexOf("-de") + 1])
//        }
//
//        if (args.contains("-val")) {
//            application.main.doVal(args[args.indexOf("-val") + 1])
//        }
//
//        if (args.contains("-h")) {
//            application.main.showFaq()
//        }
    }

    println("success")

//    val ress = listOf("A.B.C.DD", "A.BB", "CC.EDF.WASD", "A.B.C.D.E")
//    val res = "A.B.C.D.E"
//
//    println(AuthorityProvider.isChild(res, ress))
}

fun showFaq() {
    println(
        "\n-login ' Ввести логин '" +
                "\n-pass ' Ввести пароль '" +
                "\n-res ' Cтрока из букв по уровням, резделенными точками '" +
                "\n-role ' Роль (Read, Write, Execute '" +
                "\n-ds ' Строка даты ГГГГ.ММ.ДД '" +
                "\n-de ' Строка даты ГГГГ.ММ.ДД '" +
                "\n-val ' Число (целое) '" +
                "\n-h ' Справка '"
    )
}

fun doLogin(i: Any) {
    println(i)
}

fun doPass(i: Any) {
    println(i)
}

fun doRes(i: Any) {
    println(i)
}

fun doRole(i: Any) {
    println(i)
}

fun doDs(i: Any) {
    println(i)
}

fun doDe(i: Any) {
    println(i)
}

fun doVal(i: Any) {
    println(i)
}