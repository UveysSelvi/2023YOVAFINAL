
public class TokatOylama {
	
	public static int partiAOy = 0;
    public static int partiBOy = 0;
    public static int partiCOy = 0;

    public static void partiOyArttir(String partiAdi) {
        if (partiAdi.equals("A")) {
            partiAOy++;
        } else if (partiAdi.equals("B")) {
            partiBOy++;
        } else if (partiAdi.equals("C")) {
            partiCOy++;
        }
    }
    
    public static void partiOyAzalt(String partiAdi) {
        if (partiAdi.equals("A")) {
            partiAOy--;
        } else if (partiAdi.equals("B")) {
            partiBOy--;
        } else if (partiAdi.equals("C")) {
            partiCOy--;
        }
    }
    
        public static String[] partiOyListele() {
            String[] dizi = new String[3];
            dizi[0] = "A partisi oy sayısı : "  + TokatOylama.partiAOy ;
            dizi[0] = "B partisi oy sayısı : "  + TokatOylama.partiBOy ;
            dizi[0] = "C partisi oy sayısı : "  + TokatOylama.partiCOy ;
            return dizi;
        }
    }


