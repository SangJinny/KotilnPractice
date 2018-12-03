package ex_diamond_problem

interface Parent{fun follow():Unit}

interface Mother:Parent {
    override fun follow() {
        println("follow his mother")
    }
}

interface Father:Parent {
    override fun follow() {
        println("follow his father")
    }
}

