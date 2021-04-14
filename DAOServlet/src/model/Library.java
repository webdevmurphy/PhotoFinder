
package model;

import entities.Photo;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.JsonbBuilder;

public class Library {

    private List<Photo> photos;

    public Library() {
        photos = new ArrayList<>();
    }

    public void add(Photo d) {
        photos.add(d);
    }

    public String toString() {
        return JsonbBuilder.create().toJson(photos);
    }
}
