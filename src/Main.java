public class Main {

    public static void main(String[] args) {

        Category category1 = new Category("C# + Angular",0);
        Category category2 = new Category("Java & React",0);

        Category[] categories = {category1, category2};
        System.out.println("Kurslar :");

        for (Category category : categories){
            System.out.println(category.CourseName);
        }

        System.out.println("----------------------");

        CategoryManager categoryManager = new CategoryManager();
        categoryManager.login(category2);

        System.out.println("----------------------");

        DayManager dayManager = new DayManager();
        dayManager.template();
        Days days = new Days("1.gün");
        System.out.println("");

        Content dayContent1 = new Content("Ders Programı");
        Content dayContent2 = new Content("Gün Sonu Kayıt");
        Content dayContent3 = new Content("Ödev 1");
        Content dayContent4 = new Content("Ödev 2");
        Content dayContent5 = new Content("Değerlendirme");

        Content [] dayContents = {dayContent1,dayContent2,dayContent3,dayContent4,dayContent5};

        for(Content dayContent : dayContents){
            System.out.println(dayContent.contentName);
        }

        System.out.println("----------------------");

        ContentManager contentManager = new ContentManager();
        contentManager.Selected(dayContent5);









    }
}
