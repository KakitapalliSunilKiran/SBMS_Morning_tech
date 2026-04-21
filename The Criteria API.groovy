The Criteria API (CriteriaBuilder) in Spring Data JPA is used for type-safe, dynamic queries—much more powerful than the Example API when you need conditions like AND, OR, ranges, joins, etc.

Let’s go step by step with a clean real-world example.

🔹 1. Entity
@Entity
public class Student {

    @Id
    private Integer id;

    private String name;
    private String clgName;
    private int marks;

    // getters & setters
}
🔹 2. Custom Repository (Required for Criteria API)
public interface StudentCustomRepository {
    List<Student> searchStudents(String name, String clgName, Integer minMarks);
}
🔹 3. Implementation using CriteriaBuilder
@Repository
public class StudentCustomRepositoryImpl implements StudentCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> searchStudents(String name, String clgName, Integer minMarks) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);

        Root<Student> root = cq.from(Student.class);

        List<Predicate> predicates = new ArrayList<>();

        // Dynamic conditions
        if (name != null) {
            predicates.add(cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%"));
        }

        if (clgName != null) {
            predicates.add(cb.equal(root.get("clgName"), clgName));
        }

        if (minMarks != null) {
            predicates.add(cb.greaterThanOrEqualTo(root.get("marks"), minMarks));
        }

        cq.where(cb.and(predicates.toArray(new Predicate[0])));

        return entityManager.createQuery(cq).getResultList();
    }
}
🔹 4. Main Repository
public interface StudentRepository extends 
        JpaRepository<Student, Integer>, 
        StudentCustomRepository {
}
🔹 5. Service Layer
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> search(String name, String clgName, Integer marks) {
        return studentRepository.searchStudents(name, clgName, marks);
    }
}
🔹 6. Controller
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/search")
    public List<Student> search(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String clgName,
            @RequestParam(required = false) Integer marks) {

        return service.search(name, clgName, marks);
    }
}
🔹 Example API Calls
GET /students/search?name=sun

👉 finds students with name like "sun"

GET /students/search?clgName=JNTU&marks=80

👉 students from JNTU with marks ≥ 80

🔹 Important Concepts
✅ CriteriaBuilder

Used to create conditions (like, equal, greaterThan, etc.)

✅ CriteriaQuery

Represents the query

✅ Root

Represents the table (Student)

✅ Predicate

Represents conditions (WHERE clause)

🔹 OR Condition Example
cq.where(cb.or(
    cb.equal(root.get("clgName"), "JNTU"),
    cb.greaterThan(root.get("marks"), 90)
));
🔹 When to Use Criteria API

Use it when:

Dynamic filters (optional params) ✅
Complex conditions (AND/OR) ✅
Joins & subqueries ✅
Production-level search APIs ✅
🔹 When NOT to Use
Simple queries → use JpaRepository methods
Medium complexity → use @Query

If you want next level: I can show
👉 
Criteria API with JOIN (Student + Course)
👉 OR 
convert this into Specification API (cleaner approach used in real projects)