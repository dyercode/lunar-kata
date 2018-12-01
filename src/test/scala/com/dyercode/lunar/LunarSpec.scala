package com.dyercode.lunar

import org.scalatest.FunSpec

class LunarSpec extends FunSpec {
  describe("Carrying is hard") {
    describe("doing math on la luna we need to simplify it") {
      it("so adding results in the higher digit") {
        assert(7 @+ 8 === 8)
      }

      it("adding the same number results in the same digit") {
        assert(1 @+ 1 === 1)
      }

      it("double digit math is similarly simple") {
        assert(58 @+ 19 === 59)
      }

      it("differing number of digits add properly") {
        assert(1258 @+ 19 === 1259)
      }

      it("in multiplication we take the smaller of the two") {
        assert(3 @* 8 === 3)
      }

      it("what about multiplication") {
        assert(17 @* 24 === 124)
      }
    }
  }
}
