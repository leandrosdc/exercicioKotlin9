package exercicio2

fun main(){
    var teste = Fatura("Leite","Longa Vida",5,2.70F)
    println("Item ${teste.itemFaturado} comprado no valor total de R$" + teste.getTotalFatura())
}