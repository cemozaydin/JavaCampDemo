import java.util.List;

public class CategoryManager {
    void CategoryAdd(Category category){
        System.out.println(category.id + " id'li " + category.categoryName + " kategorisi eklenmiştir.");
    }

    void CategoryList(List<Category> categories){
        System.out.println("----- Kategoriler ----- ");
        categories.forEach(c-> System.out.println("Kategori Adı : " + c.categoryName));
    }
}
