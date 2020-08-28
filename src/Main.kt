class Main {
    companion object {
        var name = ""
        var playerInput = 0
        var playerScore = 0
        var computerScore = 0
        var nearestPointPlayer = 0
        var nearestPointComputer = 0


        @JvmStatic
        fun main(args: Array<String>) {

            println("Masukkan nama pemain")
            name = readLine().toString()

            for (i in 1..3) {
                println("round $i")
                var guestRandom = (0..9).random()
                var randomComp = (0..9).random()

                nearestPointPlayer = 0
                nearestPointComputer = 0
                println("input number 0 - 9 : ")
                playerInput = readLine()!!.toInt()

                println("============")
                println("Guest Number is $guestRandom")
                println("Computer input is $randomComp")
                println("============")

                logic(playerInput, guestRandom, randomComp)
                println("============")

                scoreCondition(nearestPointPlayer, nearestPointComputer)
            }

            winningCondition(playerScore, computerScore)
        }

        private fun logic(playerInput: Int, guestRandom: Int, randomComp: Int) {
            if (playerInput < guestRandom) {
                for (i in playerInput..guestRandom.minus(1)) {
                    nearestPointPlayer++
                }
                println("jarak angka player $nearestPointPlayer")
            } else if (playerInput > guestRandom) {
                for (i in guestRandom..playerInput) {
                    nearestPointPlayer++
                }
                println("jarak angka player $nearestPointPlayer")
            }

            if (randomComp < guestRandom) {
                for (i in randomComp..guestRandom) {
                    nearestPointComputer++
                }
                println("jarak angka computer $nearestPointComputer")

            } else if (randomComp > guestRandom) {
                for (i in guestRandom..randomComp) {
                    nearestPointComputer++
                }
                println("jarak angka computer $nearestPointComputer")
            }
        }

        private fun scoreCondition(nearestPointPlayer: Int, nearestPointComputer: Int) {
            if (nearestPointPlayer == nearestPointComputer){
                println("Draw")
            }
            else if (nearestPointPlayer > nearestPointComputer){
                computerScore++
                println("Computer score $computerScore")
            }

            else if (nearestPointPlayer < nearestPointComputer){
                playerScore++
                println("player score $playerScore")
            }
        }

        private fun winningCondition(playerScore: Int, computerScore: Int) {
            println("============")
            println("Winner is ")
            if (playerScore > computerScore){
                println(name)
            }else if (playerScore < computerScore){
                println("Computer")
            }
        }
        
    }
}

