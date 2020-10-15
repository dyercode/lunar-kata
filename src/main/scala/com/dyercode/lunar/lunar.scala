package com.dyercode

import scala.math.{max, min}

package object lunar {

  implicit class LunarAlgebra(val number: Int) extends AnyVal {
    def @+(addee: Int): Int = {
      val numberString: Seq[Int] = number.toString.map(_.asDigit)
      val addeeString: Seq[Int] = addee.toString.map(_.asDigit)

      numberString.reverse
        .zipAll(addeeString.reverse, 0, 0)
        .reverse
        .map { case (a, b) => max(a, b) }
        .mkString
        .toInt
    }

    def @*(multiple: Int): Int = {
      val numberDigits: Seq[Int] = number.toString.map(_.asDigit)
      val multipleDigits: Seq[Int] = multiple.toString.map(_.asDigit)

      val chart = numberDigits.map { a =>
        multipleDigits.map { b =>
          min(a, b)
        }
      }

      val withTenMultiple = chart.reverse.zipWithIndex

      val zeroed = withTenMultiple.map { case (row, tens) =>
        if (multiple > 0) {
          val zeroes: Seq[Int] = (1 to tens).map(_ => 0)
          row ++ zeroes
        } else {
          row
        }
      }

      val zeroedNumeric = zeroed.map(_.mkString.toInt)
      val result = zeroedNumeric.reduce(_ @+ _)

      result
    }
  }

}
