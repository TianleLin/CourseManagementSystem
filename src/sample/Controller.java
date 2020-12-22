package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private Student newStudent;
    private Teacher newTeacher;
    private Course newCourse;
    private Schedule newSchedule;
    private Electivecourse newElectivecourse;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    private ArrayList<Course> courseList = new ArrayList<>();
    private ArrayList<Schedule> scheduleList = new ArrayList<>();
    private ArrayList<Electivecourse> electivecourseList = new ArrayList<>();


    private final ObservableList<StudentProperty> studentPropertyObservableList = FXCollections.observableArrayList();
    private final ObservableList<TeacherProperty> teacherPropertyObservableList = FXCollections.observableArrayList();
    private final ObservableList<CourseProperty> coursePropertyObservableList = FXCollections.observableArrayList();
    private final ObservableList<ScheduleProperty> schedulePropertyObservableList = FXCollections.observableArrayList();
    private final ObservableList<ElectivecourseProperty> electivecoursePropertyObservableList = FXCollections.observableArrayList();
    private final ObservableList<SearchProperty> searchPropertyObservableList = FXCollections.observableArrayList();


    @FXML
    private JFXButton studentButton;

    @FXML
    private JFXButton teacherButton;

    @FXML
    private JFXButton courseButton;

    @FXML
    private JFXButton scheduleButton;

    @FXML
    private JFXButton electivecourseButton;

    @FXML
    private JFXButton searchButton;

    @FXML
    private FontAwesomeIconView closeButton;


    @FXML
    private JFXTextField addText;

    @FXML
    private JFXButton addButton;

    @FXML
    private Text textStatus;

    @FXML
    private GridPane searchPane;

    @FXML
    private TableView<SearchProperty> searchTable;

    @FXML
    private GridPane electivecoursePane;

    @FXML
    private TableView<ElectivecourseProperty> electivecourseTable;

    @FXML
    private GridPane schedulePane;

    @FXML
    private TableView<ScheduleProperty> scheduleTable;

    @FXML
    private GridPane coursePane;

    @FXML
    private TableView<CourseProperty> courseTable;

    @FXML
    private GridPane teacherPane;

    @FXML
    private TableView<TeacherProperty> teacherTable;

    @FXML
    private GridPane studentPane;

    @FXML
    private TableView<StudentProperty> studentTable;

    @FXML
    private TableColumn<StudentProperty, String> studentColumnID;

    @FXML
    private TableColumn<StudentProperty, String> studentColumnName;

    @FXML
    private TableColumn<StudentProperty, String> studentColumnSex;

    @FXML
    private TableColumn<StudentProperty, Integer> studentColumnAge;

    @FXML
    private TableColumn<StudentProperty, String> studentColumnMajor;

    @FXML
    private TableColumn<SearchProperty,String> searchCoulumStudent;

    @FXML
    private TableColumn<SearchProperty, String> searchCoulumCourse;

    @FXML
    private TableColumn<SearchProperty, String> searchCoulumTeacher;

    @FXML
    private TableColumn<SearchProperty,String> searchCoulumClassroom;

    @FXML
    private TableColumn<ElectivecourseProperty, String> electiveColumnID;

    @FXML
    private TableColumn<ElectivecourseProperty, String> electiveColumnSid;

    @FXML
    private TableColumn<ElectivecourseProperty, String> electiveColumnClassid;


    @FXML
    private TableColumn<Schedule, String> scheduleColumClassid;

    @FXML
    private TableColumn<Schedule, String> scheduleColumCid;

    @FXML
    private TableColumn<Schedule, String> scheduleColumTid;

    @FXML
    private TableColumn<Schedule, String> scheduleColumClassroom;

    @FXML
    private TableColumn<Course,String> courseCoulumID;

    @FXML
    private TableColumn<Course,String> courseCoulumName;

    @FXML
    private TableColumn<Course,Integer> courseCoulumHour;

    @FXML
    private TableColumn<Teacher,String> teacherColumnID;

    @FXML
    private TableColumn<Teacher,String> teacherColumnName;

    @FXML
    private TableColumn<Teacher,String> teacherColumnSex;

    @FXML
    private TableColumn<Teacher,Integer> teacherColumnAge;

    @FXML
    private TableColumn<Teacher,String> teacherColumnTitle;

    @FXML
    private  JFXButton welcomeTitle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTable();
    }
    public void handleClicks(MouseEvent mouseEvent) {
        if (mouseEvent.getSource()==studentButton)
        {
            textStatus.setText("Students");
            studentPane.toFront();
            addButton.setText("Add");
            addText.setPromptText("sid/name/sex/age/major");
        }
        else
        if (mouseEvent.getSource()==teacherButton)
        {
            textStatus.setText("Teachers");
            teacherPane.toFront();
            addButton.setText("Add");
            addText.setPromptText("tid/name/sex/age/title");
        }
        else
        if (mouseEvent.getSource()==courseButton)
        {
            textStatus.setText("Courses");
            coursePane.toFront();
            addButton.setText("Add");
            addText.setPromptText("cid/cname/chour");
        }
        else
        if (mouseEvent.getSource()==scheduleButton)
        {
            textStatus.setText("Schedules");
            schedulePane.toFront();
            addButton.setText("Add");
            addText.setPromptText("classid/cid/tid/classroom");
        }
        else
        if (mouseEvent.getSource()==electivecourseButton)
        {
            textStatus.setText("Elective");
            electivecoursePane.toFront();
            addButton.setText("Add");
            addText.setPromptText("elid/sid/classid");
        }
        else
        if (mouseEvent.getSource()==searchButton)
        {
            textStatus.setText("Search");
            searchPane.toFront();
            addButton.setText("Search");
            addText.setPromptText("sid");
        }
    }


    public void closeClick(MouseEvent mouseEvent) {
        if (mouseEvent.getSource()==closeButton)
            System.exit(0);
    }


    public void addClicks(MouseEvent mouseEvent) throws IOException {
        // 添加学生
        //banner文字为Students时，修改student table
        if (textStatus.getText().equals("Students")) {
            //从文件中读入数据
            addStudent();
        }
        //下同
        if (textStatus.getText().equals("Teachers")) {
            addTeacher();
        }
        if (textStatus.getText().equals("Courses"))
        {
            addCourse();
        }
        if (textStatus.getText().equals("Schedules"))
        {
            addSchedule();
        }
        if (textStatus.getText().equals("Elective"))
        {
            addElectivecourse();
        }
        if (textStatus.getText().equals("Search"))
        {
            search();
        }
    }
    //初始化表（启动时直接读入并在table中显示数据
    public void initTable()
    {
        try {
            welcomeTitle.setText("Welcome, "+Main.accountName);
            if (Main.accountType.equals("Teacher"))
            {
                searchButton.setDisable(true);
                studentButton.setDisable(true);
                teacherButton.setDisable(true);
                electivecourseButton.setDisable(true);
            }
            if (Main.accountType.equals("Student"))
            {
                teacherButton.setDisable(true);
                studentButton.setDisable(true);
                electivecourseButton.setDisable(true);
                scheduleButton.setDisable(true);
                courseButton.setDisable(true);
            }
            MyFile studentFile = new MyFile("Student.ser");
            MyFile teacherFile = new MyFile("Teacher.ser");
            MyFile courseFile = new MyFile("Course.ser");
            MyFile scheduleFile = new MyFile("Schedule.ser");
            MyFile electivecourseFile = new MyFile("Electivecourse.ser");
            studentList = studentFile.read();
            electivecourseList = electivecourseFile.read();
            scheduleList = scheduleFile.read();
            teacherList = teacherFile.read();
            courseList = courseFile.read();
            //遍历student，挨个赋值并建立可见对象数组
            for(Student student:studentList)
            {
                studentPropertyObservableList.add(new StudentProperty(
                        student.getSid(),
                        student.getName(),
                        student.getSex(),
                        student.getAge(),
                        student.getMajor()
                ));
            }
            studentColumnID.setCellValueFactory(new PropertyValueFactory<>("sid"));
            studentColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
            studentColumnSex.setCellValueFactory(new PropertyValueFactory<>("sex"));
            studentColumnMajor.setCellValueFactory(new PropertyValueFactory<>("major"));
            studentColumnAge.setCellValueFactory(new PropertyValueFactory<>("age"));
            studentTable.setItems(studentPropertyObservableList);
            for (Teacher teacher:teacherList)
            {
                teacherPropertyObservableList.add(new TeacherProperty(
                        teacher.getTid(),
                        teacher.getName(),
                        teacher.getSex(),
                        teacher.getAge(),
                        teacher.getTitle()
                ));
            }
            teacherColumnID.setCellValueFactory(new PropertyValueFactory<>("tid"));
            teacherColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
            teacherColumnSex.setCellValueFactory(new PropertyValueFactory<>("sex"));
            teacherColumnAge.setCellValueFactory(new PropertyValueFactory<>("age"));
            teacherColumnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
            teacherTable.setItems(teacherPropertyObservableList);
            for(Course course:courseList)
            {
                coursePropertyObservableList.add(new CourseProperty(
                        course.getCid(),
                        course.getCname(),
                        course.getChour()

                ));
            }
            courseCoulumID.setCellValueFactory(new PropertyValueFactory<>("cid"));
            courseCoulumName.setCellValueFactory(new PropertyValueFactory<>("cname"));
            courseCoulumHour.setCellValueFactory(new PropertyValueFactory<>("chour"));
            courseTable.setItems(coursePropertyObservableList);
            for(Schedule schedule:scheduleList)
            {
                schedulePropertyObservableList.add(new ScheduleProperty(
                        schedule.getClassid(),
                        schedule.getCid(),
                        schedule.getTid(),
                        schedule.getClassroom()

                ));
            }
            scheduleColumClassid.setCellValueFactory(new PropertyValueFactory<>("classid"));
            scheduleColumCid.setCellValueFactory(new PropertyValueFactory<>("cid"));
            scheduleColumTid.setCellValueFactory(new PropertyValueFactory<>("tid"));
            scheduleColumClassroom.setCellValueFactory(new PropertyValueFactory<>("classroom"));
            scheduleTable.setItems(schedulePropertyObservableList);
            for(Electivecourse electivecourse:electivecourseList)
            {
                electivecoursePropertyObservableList.add(new ElectivecourseProperty(
                        electivecourse.getElid(),
                        electivecourse.getSid(),
                        electivecourse.getClassid()

                ));
            }
            electiveColumnID.setCellValueFactory(new PropertyValueFactory<>("elid"));
            electiveColumnSid.setCellValueFactory(new PropertyValueFactory<>("sid"));
            electiveColumnClassid.setCellValueFactory(new PropertyValueFactory<>("classid"));
            electivecourseTable.setItems(electivecoursePropertyObservableList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addStudent() throws IOException {
        MyFile studentFile = new MyFile("Student.ser");
        String info = addText.getText();//读入数据
        if (!info.isEmpty()) {
            String[] infos = info.trim().split("/");//根据格式分割
            //用分割后的数据new studentproperty类
            studentPropertyObservableList.add(new StudentProperty(
                    infos[0],
                    infos[1],
                    infos[2],
                    Integer.parseInt(infos[3]),
                    infos[4]
            ));
            //new student类
            newStudent = new Student(infos[0], infos[1], infos[2], Integer.parseInt(infos[3]), infos[4]);//依次存入student类
            studentList.add(newStudent); //将新对象存入对象数组中
            studentFile.write(studentList);
            //分别新建table的column
            studentColumnID.setCellValueFactory(new PropertyValueFactory<>("sid"));
            studentColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
            studentColumnSex.setCellValueFactory(new PropertyValueFactory<>("sex"));
            studentColumnMajor.setCellValueFactory(new PropertyValueFactory<>("major"));
            studentColumnAge.setCellValueFactory(new PropertyValueFactory<>("age"));
            //将可见对象数组置入table
            studentTable.setItems(studentPropertyObservableList);
            //清除输入栏
            addText.clear();
        }
    }
    public void addTeacher() throws IOException {
        MyFile teacherFile = new MyFile("Teacher.ser");
        String info = addText.getText();//读入数据
        if (!info.isEmpty()) {
            String[] infos = info.trim().split("/");//根据格式分割
            teacherPropertyObservableList.add(new TeacherProperty(
                    infos[0],
                    infos[1],
                    infos[2],
                    Integer.parseInt(infos[3]),
                    infos[4]
            ));
            newTeacher = new Teacher(infos[0], infos[1], infos[2], Integer.parseInt(infos[3]), infos[4]);//依次存入student类
            teacherList.add(newTeacher); //将新对象存入对象数组中
            teacherFile.write(teacherList);
            teacherColumnID.setCellValueFactory(new PropertyValueFactory<>("tid"));
            teacherColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
            teacherColumnSex.setCellValueFactory(new PropertyValueFactory<>("sex"));
            teacherColumnAge.setCellValueFactory(new PropertyValueFactory<>("age"));
            teacherColumnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
            teacherTable.setItems(teacherPropertyObservableList);
            addText.clear();
        }
    }

    public void addCourse() throws IOException{
        MyFile courseFile = new MyFile("Course.ser");
        String info = addText.getText();//读入数据
        if (!info.isEmpty()) {
            String[] infos = info.trim().split("/");//根据格式分割
            coursePropertyObservableList.add(new CourseProperty(
                    infos[0],
                    infos[1],
                    Integer.parseInt(infos[2])
            ));
            newCourse = new Course(infos[0], infos[1], Integer.parseInt(infos[2]));//依次存入student类
            courseList.add(newCourse); //将新对象存入对象数组中
            courseFile.write(courseList);
            courseCoulumID.setCellValueFactory(new PropertyValueFactory<>("cid"));
            courseCoulumName.setCellValueFactory(new PropertyValueFactory<>("cname"));
            courseCoulumHour.setCellValueFactory(new PropertyValueFactory<>("chour"));
            courseTable.setItems(coursePropertyObservableList);
            addText.clear();
        }
    }

    public void addSchedule() throws IOException{
        MyFile scheduleFile = new MyFile("Schedule.ser");
        String info = addText.getText();//读入数据
        if (!info.isEmpty()) {
            String[] infos = info.trim().split("/");//根据格式分割
            schedulePropertyObservableList.add(new ScheduleProperty(
                    infos[0],
                    infos[1],
                    infos[2],
                    infos[3]
            ));
            newSchedule = new Schedule(infos[0], infos[1], infos[2], infos[3]);//依次存入student类
            scheduleList.add(newSchedule); //将新对象存入对象数组中
            scheduleFile.write(scheduleList);
            scheduleColumCid.setCellValueFactory(new PropertyValueFactory<>("cid"));
            scheduleColumTid.setCellValueFactory(new PropertyValueFactory<>("tid"));
            scheduleColumClassid.setCellValueFactory(new PropertyValueFactory<>("classid"));
            scheduleColumClassroom.setCellValueFactory(new PropertyValueFactory<>("classroom"));
            scheduleTable.setItems(schedulePropertyObservableList);
            addText.clear();
        }
    }
    public void addElectivecourse() throws IOException{
        MyFile electivecourseFile = new MyFile("Electivecourse.ser");
        String info = addText.getText();//读入数据
        if (!info.isEmpty()) {
            String[] infos = info.trim().split("/");//根据格式分割
            electivecoursePropertyObservableList.add(new ElectivecourseProperty(
                    infos[0],
                    infos[1],
                    infos[2]
            ));
            newElectivecourse = new Electivecourse(infos[0], infos[1], infos[2]);//依次存入student类
            electivecourseList.add(newElectivecourse); //将新对象存入对象数组中
            electivecourseFile.write(electivecourseList);
            electiveColumnID.setCellValueFactory(new PropertyValueFactory<>("elid"));
            electiveColumnSid.setCellValueFactory(new PropertyValueFactory<>("sid"));
            electiveColumnClassid.setCellValueFactory(new PropertyValueFactory<>("classid"));
            electivecourseTable.setItems(electivecoursePropertyObservableList);
            addText.clear();
        }
    }

    public void search() throws IOException{
        String inputSid = addText.getText();//读入数据
        if (!inputSid.isEmpty()) {
            MyFile studentFile = new MyFile("Student.ser");
            MyFile teacherFile = new MyFile("Teacher.ser");
            MyFile courseFile = new MyFile("Course.ser");
            MyFile scheduleFile = new MyFile("Schedule.ser");
            MyFile electivecourseFile = new MyFile("Electivecourse.ser");
            //查找用的临时空间
            String classid;
            String tid;
            String classroom;
            String cid;
            String cname;
            String tname;
            String sname;
            //查找标记
            boolean studentFlag = true;
            boolean teacherFlag = true;
            boolean courseFlag = true;
            boolean scheduleFlag = true;
            boolean electivecourseFlag = true;
            //分别将序列读入进对象数组
            studentList = studentFile.read();
            electivecourseList = electivecourseFile.read();
            scheduleList = scheduleFile.read();
            teacherList = teacherFile.read();
            courseList = courseFile.read();
            SearchProperty searchProperty = new SearchProperty("", "", "", "");
            //遍历各个对象数组，依据对象数组之间的共同数据获得联系，sid找到老师、课程、教室。查找路径如下图
        /*
        student:
=====================================
(1) sid     name    sex     age major
=====================================
teacher:
=====================================
(4)tid (4->)name    sex     age title
=====================================
course:
=====================================
(4) cid (4->) cname            chour
=====================================
schedule:
=====================================
(3) classid (3->)cid  (3->)tid  (3->)classroom
=====================================
electivecourse:
=====================================
elid   (2) sid       (2->)  classid
=====================================
        */
            for (Student student : studentList) {
                if (inputSid.equals(student.getSid())) { //匹配字符串
                    sname = student.getName(); //得到学生姓名
                    studentFlag = false; //标记已经找到， 下同
                    searchProperty.setStudent(sname);
                    for (Electivecourse electivecourse : electivecourseList) {
                        if (inputSid.equals(electivecourse.getSid())) {
                            electivecourseFlag = false;
                            classid = electivecourse.getClassid();

                            for (Schedule schedule : scheduleList) {
                                if (classid.equals(schedule.getClassid())) {
                                    scheduleFlag = false;
                                    cid = schedule.getCid();
                                    tid = schedule.getTid();
                                    classroom = schedule.getClassroom();
                                    searchProperty.setClassroom(classroom);
                                    for (Teacher teacher : teacherList) {
                                        if (tid.equals(teacher.getTid())) {
                                            teacherFlag = false;
                                            tname = teacher.getName();
                                            searchProperty.setTeacher(tname);
                                        }
                                    }
                                    for (Course course : courseList) {
                                        if (cid.equals(course.getCid())) {
                                            courseFlag = false;
                                            cname = course.getCname();
                                            searchProperty.setCourse(cname);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (studentFlag) {
                searchProperty.setStudent("N/A");
            }
            if (courseFlag) {
                searchProperty.setCourse("N/A");
            }
            if (teacherFlag) {
                searchProperty.setTeacher("N/A");
            }
            if (electivecourseFlag) {
                searchProperty.setClassroom("N/A");
            }
            searchPropertyObservableList.add(searchProperty);
            searchCoulumStudent.setCellValueFactory(new PropertyValueFactory<>("student"));
            searchCoulumCourse.setCellValueFactory(new PropertyValueFactory<>("course"));
            searchCoulumTeacher.setCellValueFactory(new PropertyValueFactory<>("teacher"));
            searchCoulumClassroom.setCellValueFactory(new PropertyValueFactory<>("classroom"));
            searchTable.setItems(searchPropertyObservableList);
            addText.clear();
        }
    }
}
