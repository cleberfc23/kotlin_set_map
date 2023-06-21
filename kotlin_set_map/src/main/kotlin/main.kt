fun main() {
    val banco = BancoDeNomes()
    banco.salva("Clebine")


}

class BancoDeNomes {
    companion object {
        private val dados = mutableListOf<String>()
    }

    val nome: Collection<String> get() = dados

    fun salva(nome: String) {
        dados.add(nome)
    }


}