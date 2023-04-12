package MvcServices.services;

import MvcServices.model.HocSinh;

import java.util.ArrayList;
import java.util.List;

public class AppService implements AppHocSinhInterface{

    private List<HocSinh> db;

    public AppService() {
        db = new ArrayList<>();
    }

    @Override
    public boolean addNew(HocSinh hocSinh) {
        return false;
    }

    @Override
    public boolean update(HocSinh hocSinh, int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean showEveryThing() {
        return false;
    }
}
