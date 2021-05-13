package exercicio2

class Fatura (var itemFaturado:String = "ITEM SEM NOME",
              var descricaoItem:String = "ITEM SEM DESCRICAO",
              var qtdeComprada:Int = 0,
              var precoUnitario:Float = 0.0F
              ){

    fun getTotalFatura():Double{
        return (this.qtdeComprada * this.precoUnitario).toDouble()
    }
}