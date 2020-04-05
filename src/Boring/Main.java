package Boring;

public class Main {
    @Override
    protected void finalize(){
        System.out.println("finalize method called");
    }
    public static void main(String[] args) {
        /*ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());

        }

        System.out.println("\nSorted by name");

        NameCompare nameCompare = new NameCompare();
        Collections.sort(list,nameCompare);

        for (Movie movie:list){
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie movie: list)
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName()+" ");


         */
        Parent obj1 = new Parent();
        obj1.show();

        Parent obj2 = new Child();

        obj2.show();

        Object obj = new String("GeeksForGeeks");

        Class c = obj.getClass();

        System.out.println("Class of Object obj is : "+c.getName());

        Main ma = new Main();

        System.out.println(ma.hashCode());

        ma = null;

        System.gc();

        System.out.println("end");
    }

}
