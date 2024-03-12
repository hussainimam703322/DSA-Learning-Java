package DeepConcepts;

enum Status {
    Running, success, failed, pending;
}

public class enumkeyword {
    public static void main(String[] args) {
        Status a = Status.Running;
        System.out.println(a);
        System.out.println(a.getClass().getSuperclass());

        Status[] ss = Status.values();
        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal()); // ordinal is used to get the index number
        }

        // if-else with enum
        Status c = Status.failed;
        if (c == Status.Running) {
            System.out.println("Keep going");
        } else if (c == Status.success) {
            System.out.println("almost done");
        } else if (c == Status.pending) {
            System.out.println("please wait");
        } else if (c == Status.failed) {
            System.out.println("website cannot be reached");
        } else {
            System.out.println("please reload");
        }

        // switch with enum
        Status d = Status.success;
        switch (d) {
            case Running:
                System.out.println("Keep going");
                break;
            case pending:
                System.out.println("please wait");
                break;
            case success:
                System.out.println("almost done");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
