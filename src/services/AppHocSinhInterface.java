package services;

import model.HocSinh;

public interface AppHocSinhInterface {
    public boolean addNew(HocSinh input);
    public boolean remakeHocSinh(HocSinh dataNew, int id);
    public boolean deleteHocSinh(int id);
    public boolean showEverything();
}
