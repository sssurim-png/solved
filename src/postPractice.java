import javax.imageio.stream.IIOByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class postPractice {
    public static void main(String[] args) {
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();
        while (true) {
            System.out.println("서비스 번호를 선택하세요");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if (number == 1) {
                System.out.println("회원가입서비스입니다.");
                System.out.print("이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.print("이메일을 입력해주세요");
                String email = sc.nextLine();
                System.out.print("비밀번호을 입력해주세요");
                String password = sc.nextLine();
                Author author = new Author(name, email, password);
                authorList.add(author);

            } else if (number == 2) {
                System.out.println("회원목록조회서비스입니다.");
                for (Author a : authorList) {
                    System.out.println("id: " + a.getId() + "이름: " + a.getName());
                }
            } else if (number == 3) {
                System.out.println("회원상세조회입니다.");
                System.out.print("회원ID를 입력해주세요");
                long id = Long.parseLong(sc.nextLine());
                Author author = null;
                for (Author a : authorList) {
                    if (a.getId() == id) {
                        author = a;
                        break;
                    }
                }
                System.out.println("id" + author.getId() + "작성글수" + author.getPostList().size());

            } else if (number == 4) {
                System.out.println("게시글작성서비스입니다.");
                System.out.print("제목을 입력해주세요");
                String title = sc.nextLine();
                System.out.print("내용을 입력해주세요");
                String contents = sc.nextLine();
                System.out.print("회원EMAIL을 입력해주세요");
                String email = sc.nextLine();

                Author author = null;
                for (Author a : authorList) {
                    if (a.getEmail().equals(email)) {
                        author = a;
                        break;
                    }
                }

                Post post = new Post(title, contents, author);
                postList.add(post);
                author.getPostList().add(post);


            }else if (number==5) {
                System.out.println("게시글목록조회서비스입니다.");
                for(Post p : postList){
                    System.out.println("id: "+p.getId()+"제목: "+p.getTitle());
                }
            }else if (number==6) {
                System.out.println("게시글상세조회입니다.");
                System.out.print("게시글ID를 입력해주세요");
                long id =Long.parseLong(sc.nextLine());
                Post post =null;
                for(Post p : postList){
                    if(post.getId()==id){
                        post=p;
                        break;
                    }
                }
                System.out.println(post.toString());
            }
        }
    }
}

class Author{
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Post> postList;
    private static long staticId;

    public Author(String name, String email, String password) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.postList =new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPostList() {
        return postList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", postList=" + postList +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}




class Post {
    private Long id;
    private String title;
    private String contents;
    private Author author;
    private static long staticId;

    public Post(String title, String contents, Author author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", author=" + author.getEmail() +
                '}';
    }
}


