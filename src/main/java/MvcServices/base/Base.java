package MvcServices.base;

import MvcServices.mvc.model.Cat;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class Base {

    public static <T> void printAll(List<T> list, Consumer<T> printer) {
        if (list.isEmpty()) {
            System.out.println("không có dữ liệu");
        }
        list.forEach(printer);
    }

    public static <T> boolean addItem(List<T> list, T t, Function<T, Integer> getId) {
        Optional<T> item = list
                .stream()
                .filter(i -> getId.apply(i) == getId.apply(t))
                .findFirst();
        if (item.isPresent()) {
            return false;
        }
        list.add(t);

        return true;
    }

    public static <T> boolean deleteById(List<T> list, int id, Function<T, Integer> getId) {
        Optional<T> item = list
                .stream()
                .filter(i -> getId.apply(i) == id)
                .findFirst();
        if (item.isPresent()) {
            list.remove(item.get());
            return true;
        }

        return false;
    }

    public static <T> T getById(List<T> list, int id, Function<T, Integer> getId) {
        Optional<T> item = list
                .stream().filter(i -> getId.apply(i) == id)
                .findFirst();
        if (item.isPresent()) {
            return item.get();
        }
        return null;
    }


    public static <T extends Cat> String getSound(Function<T, String> sound) {
        T cat = null;
        return sound.apply(cat);
    }
}
