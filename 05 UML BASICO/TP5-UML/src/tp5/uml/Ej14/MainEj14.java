package Ej14;

public class MainEj14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Promo institucional", 3);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto); // dependencia de creación
    }
}