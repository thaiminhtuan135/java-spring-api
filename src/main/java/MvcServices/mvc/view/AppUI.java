package MvcServices.mvc.view;

import MvcServices.base.InputHelper;
import MvcServices.mvc.lib.inputHelper;
import MvcServices.mvc.model.*;
import MvcServices.mvc.service.CatServiceImpl;

import java.util.Scanner;

public class AppUI {
    private final CatServiceImpl catServiceImpl;
    private Scanner sc = new Scanner(System.in);

    public AppUI() {
        catServiceImpl = new CatServiceImpl();
        menu();
    }

    public void menuAddTypeCat() {
        System.out.println("--------");
        System.out.println("1. Thêm mèo lông dài");
        System.out.println("2. Thêm mèo lông ngắn");
        System.out.println("3. Thêm mèo ba tư");
        System.out.println("4. Thêm mèo nga");
        System.out.println("--------");
    }

    public void controllerAddTypeCat(int request) {
        switch (request) {
            case 1:
                catServiceImpl.addCat(new MeoLongDai());
                break;
            case 2:
                catServiceImpl.addCat(new MeoLongNgan());
                break;
            case 3:
                catServiceImpl.addCat(new MeoBatu());
                break;
            case 4:
                catServiceImpl.addCat(new MeoNga());
                break;
        }
    }

    public void menuSound() {
        System.out.println("1. Tiếng kêu mèo lông dài");
        System.out.println("2. Tiếng kêu mèo lông ngắn");
        System.out.println("3. Tiếng kêu mèo lông ba tư");
        System.out.println("4. Tiếng kêu mèo lông nga");
    }

    public void controllerSound(int request) {
        switch (request) {
            case 1:
                System.out.println(MeoLongDai.keu);
                break;
            case 2:
                System.out.println(MeoLongNgan.keu);
                break;
            case 3:
                System.out.println(MeoBatu.keu);
                break;
            case 4:
                System.out.println(MeoNga.keu);
                break;
        }
    }

    public void menu() {
        System.out.println("1. Thêm mới mèo");
        System.out.println("2. Sửa thông tin mèo theo id");
        System.out.println("3. Xóa theo id");
        System.out.println("4. In toàn bộ mèo");
        System.out.println("5. Thay đổi tiếng kêu của mèo");
        System.out.println("6. Hiển thị tiếng kêu từng loại mèo");
        System.out.println("7. Thoát chương trình");
        System.out.println("-----------------");
        int request = inputHelper.intHelper("Nhập lựa chọn", "Chỉ nhập 1-6", 1, 6);
//        sc.nextLine();
        controller(request);
    }

    private void controller(int request) {
        switch (request) {
            case 1:
                menuAddTypeCat();
                System.out.println("Bạn muốn thêm loại mèo nào");
                controllerAddTypeCat(sc.nextInt());
                break;
            case 2:
                int size = catServiceImpl.sizeList();
                if (size == 0) {
                    System.out.println("Không có mèo để sửa");
                    break;
                }
                System.out.println("Nhập id để sửa");
                catServiceImpl.updateCat(sc.nextInt());
                sc.nextLine();
                break;
            case 3:
                int s = catServiceImpl.sizeList();
                if (s == 0) {
                    System.out.println("Không có mèo để xóa");
                    break;
                }
                System.out.println("Nhập id cần xóa");
                catServiceImpl.deleteCatById(sc.nextInt());
                break;
            case 4:
                catServiceImpl.getAllCats();
                break;
            case 5:
                System.out.println("Nhập id để thay đổi tiếng kêu");
                catServiceImpl.updateCatSound(sc.nextInt());
                sc.nextLine();
                break;
            case 6:
                menuSound();
                System.out.println("bạn muốn xem tiếng kêu loại mèo nào");
                controllerSound(inputHelper.intHelper("Nhập tiếng kêu loại mèo muốn xem","nhập 1-4",1,4));
                break;
            case 7:
                System.exit(0);
        }
        menu();
    }

}
