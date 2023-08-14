package InMemoryModel;

import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Flash;
import ModelElements.Camera;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangeObserver> ChangeObservers;

    public ModelStore(List<IModelChangeObserver> changeObservers) throws Exception {

        this.ChangeObservers = changeObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel());
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene());

    }

        public Scene GetScena(int ID) {
            for (int i = 0; i < Scenes.size(); i++){
                if(Scenes.get(i).id == id)
                    return Scenes.get(i);
            } 
            return null;
        }
    
        @Override
        public void NotifyChange(IModelChanger sender) {
        }
}

