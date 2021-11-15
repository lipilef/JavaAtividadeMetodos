public class Ex_01 {
    public  static String mes [] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    public  static String month [] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

   public static String getMes(int m){
       m = m - 1;
       if (m >= 0 && m < 12){
           return mes[m];
       } else{
           return "Mês inválido";
       }
   }
   public static String getMonth(int m){
        m = m - 1;
        if (m >= 0 && m < 12){
            return month[m];
        } else{
            return "Invalid Value";
        }
   }

    public static String getMesPorExtenso(int i, int m) {
        if (i == 1) return getMes(m);
        if (i == 2) return getMonth(m);
        return "Idioma Não Suportado";
    }

}
