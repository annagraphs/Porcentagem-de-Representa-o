public class faturamentoPorEstado {
    public static void main(String[] args) { // valores separados por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double etc = 19849.53;

        double somaFaturamento = sp + rj + mg + es + etc; // soma dos valores

        System.out.printf("Porcentagem representada por Sao Paulo: %.2f%%%n", (sp / somaFaturamento) * 100);
        System.out.printf("Porcentagem representada pelo Rio de Janeiro: %.2f%%%n", (rj / somaFaturamento) * 100);
        System.out.printf("Porcentagem representada por Minas Gerais: %.2f%%%n", (mg / somaFaturamento) * 100);
        System.out.printf("Porcentagem representada pelo Espirito Santo: %.2f%%%n", (es / somaFaturamento) * 100);
        System.out.printf("Porcentagem representada por outros estados: %.2f%%%n", (etc / somaFaturamento) * 100);

    }
}
