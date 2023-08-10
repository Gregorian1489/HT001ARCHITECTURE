package InMemoryModel;

import Seminar1.ModelElements.PoligonalModel;
import Seminar1.ModelElements.Scene;
import Seminar1.ModelElements.Flash;
import Seminar1.ModelElements.Camera;

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

    }

        public Scene GetScena(int ID) {
            
        }
    
        @Override
        public void NotifyChange(IModelChanger sender) {
        }
}

