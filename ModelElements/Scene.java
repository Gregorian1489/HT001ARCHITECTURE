import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;

        if (models.size() > 0){
        this.Models = models;
        } else throw new Exception("Должна быть хотя бы одна модель");

        this.Flashes = flashes;

        if (cameras.size() > 0){
        this.cameras = cameras;
        } else throw new Exception("Должны быть хотя бы одна камера");
    }
    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
}
