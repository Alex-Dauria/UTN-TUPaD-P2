package Ej14;

public class MainEj14 {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("MiProyecto", 10);
        EditorVideo e = new EditorVideo();
        e.exportar("MP4", p);
    }
}