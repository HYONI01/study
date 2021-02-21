package exercise

import practice.Cons
import practice.FpList
import practice.Nil

fun main(args: Array<String>) {
    val intlist = Cons(1,
        Cons(2, Cons(3, Cons(4, Cons(5, Nil)))))

    require(intlist.take(0) == Nil)
    require(intlist.take(3) == Cons(1, Cons(2, Cons(3, Nil))))
    require(intlist.take(6) == Cons(1,
        Cons(2, Cons(3, Cons(4, Cons(5, Nil))))))

    require(intlist.take(0, Nil) == Nil)
    require(intlist.take(3, Nil) == Cons(1,
        Cons(2, Cons(3, Nil))))
    require(intlist.take(6, Nil) == Cons(1,
        Cons(2, Cons(3, Cons(4, Cons(5, Nil))))))

}

fun <T> FpList<T>.take(n: Int): FpList<T> = TODO()

tailrec fun <T> FpList<T>.take(n: Int, acc: FpList<T>): FpList<T> = TODO()