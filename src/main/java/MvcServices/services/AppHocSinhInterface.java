package MvcServices.services;

import MvcServices.model.HocSinh;

public interface AppHocSinhInterface {
    public boolean addNew(HocSinh hocSinh);
    public boolean update(HocSinh hocSinh, int id);
    public boolean delete(int id);
    public boolean showEveryThing();
}
