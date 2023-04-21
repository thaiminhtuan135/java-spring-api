package MvcServices.mvc.service;

import MvcServices.mvc.model.Cat;
import MvcServices.mvc.model.MeoLongDai;

import java.util.List;
import java.util.function.Function;

public interface CatService {
    public boolean addCat(Cat cat);
    public void deleteCatById(int id);
    public void getAllCats();
    Cat getCatById(int id);
    public void updateCatSound(int id);

    public boolean updateCat(int id);

    public int sizeList();

    public <T extends Cat> void getsound(Function<T, String> getSound);
}
