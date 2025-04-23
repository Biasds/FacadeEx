public class Combo {
    private final ItemCombo burger;
    private final ItemCombo bebida;
    private final ItemCombo sobremesa;

    public Combo(ItemCombo burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public double getPrecoTotal() {
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }

    public void exibirItens() {
        System.out.println("Itens do Combo:");
        System.out.println("- " + burger);
        System.out.println("- " + bebida);
        System.out.println("- " + sobremesa);
    }
}
