import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Ex_01Test {


    @Test
    void getMes() {//teste quando o mês em português não existe
        Ex_01 mes = new Ex_01();
        String mesretornado = mes.getMes(13);
        System.out.println(mesretornado);
    }

    @Test
    void getMonth() { //teste quando o mês em inglês não existe
        Ex_01 mes = new Ex_01();
        String mesretornado = mes.getMonth(120);
        System.out.println(mesretornado);
    }

    @Test
    void getMesPorExtenso() {
        Ex_01 mes = new Ex_01();
        System.out.println("Português selecionado, mês em português");
        System.out.println("");
        System.out.println(mes.getMesPorExtenso(1,5));
        System.out.println();
        System.out.println("Inglês selecionado, mês em inglês");
        System.out.println(mes.getMesPorExtenso(2,7));
        System.out.println("");
    }
}
