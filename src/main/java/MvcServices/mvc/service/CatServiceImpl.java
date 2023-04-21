package MvcServices.mvc.service;

import MvcServices.base.Base;
import MvcServices.mvc.model.Cat;
import MvcServices.mvc.model.MeoBatu;
import MvcServices.mvc.model.MeoLongDai;

import java.util.*;
import java.util.function.Function;

public class CatServiceImpl implements CatService {

    private List<Cat> list;

    public CatServiceImpl() {
        list = new ArrayList<>();
    }

    @Override
    public boolean addCat(Cat cat) {

        if (Base.addItem(list, cat, Cat::getId)) {
            System.out.println("thêm thành công");
        } else {
            System.out.println("Thêm thất bại , id đã tồn tại");
        }
        return true;
    }

    @Override
    public void deleteCatById(int id) {
        if (Base.deleteById(list, id, Cat::getId)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }

    @Override
    public void getAllCats() {
        Base.printAll(list, cat -> System.out.println(cat.toString()));
    }

    @Override
    public MeoLongDai getCatById(int id) {
        return null;
    }

    @Override
    public void updateCatSound(int id) {
        Optional<Cat> cat = list.stream().filter(c -> c.getId() == id).findFirst();
        if (cat.isEmpty()) {
            System.out.println("Không tìm thấy mèo có id = " + id);
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiếng kêu");
        String newSound = scanner.nextLine();

        cat.get().setSound(newSound);
        System.out.println("Cập nhật tiếng kêu thành công");
//        list.stream().filter(cat -> cat.getId() == id).findFirst().ifPresent(cat -> cat.setSound(newSound));

    }

    @Override
    public boolean updateCat(int id) {
        Scanner sc = new Scanner(System.in);

        Cat cat = Base.getById(list, id, Cat::getId);
        if (cat != null) {
            System.out.println("Nhập tên");
            cat.setName(sc.nextLine());
            System.out.println("Nhập tuổi");
            cat.setAge(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập giới tính");
            cat.setGender(sc.nextLine());
            System.out.println("Sửa thành công");
            return true;
        }
        System.out.println("Không tìm thấy mèo có id là " + id);
        return false;
    }

    @Override
    public int sizeList() {
        return list.size();
    }

    @Override
    public <T extends Cat> void getsound(Function<T, String> sound) {
        Base.getSound(sound);
    }
}
