package exercicio3

class Estoque(var nomeEstoque:String = "Estoque sem nome",
              var qtdeAtual:Int,
              var qtdeMinima:Int
              ) {

    fun mudarNome(nomeEstoque:String){
        this.nomeEstoque = nomeEstoque
    }

    fun mudarQtdMinima(qtdeMinima: Int){
        this.qtdeMinima = qtdeMinima
    }

    fun repor(qtde:Int){
        this.qtdeAtual += qtde
    }

    fun darBaixa(qtde:Int){
        this.qtdeAtual -= qtde
    }

    fun precisaRepor():Boolean{
        return this.qtdeAtual <= this.qtdeMinima
    }

    fun mostra():String{
        return "${this.nomeEstoque}, ${this.qtdeAtual}, ${this.qtdeMinima}"
    }
}