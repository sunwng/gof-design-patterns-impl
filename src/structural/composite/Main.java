package structural.composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.printList();
        System.out.println();

        System.out.println("Making user entries");
        Directory na = new Directory("na");
        Directory sun = new Directory("sun");
        Directory woong = new Directory("woong");
        usrdir.add(na);
        usrdir.add(sun);
        usrdir.add(woong);
        sun.add(new File("diary.html", 100));
        sun.add(new File("Composite.java", 200));
        woong.add(new File("memo.tex", 300));
        na.add(new File("game.doc", 400));
        na.add(new File("junk.mail", 500));

        rootdir.printList();
    }

}
