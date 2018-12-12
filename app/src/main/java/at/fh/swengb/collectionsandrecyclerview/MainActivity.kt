package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentlist = listOf<Student>(Student("Julia",3),
            Student("Michael",2), Student
        ("Markus",3)
        );

        lbl_name.text = studentlist[2].name

        val mutStudentList = mutableListOf<Student>(Student("Julia",3),
            Student("Michael",2), Student("Markus",3), Student("Lukas",3),
            Student("Tim",3))

        mutStudentList.add(Student("Peter",2))
        mutStudentList[3] = Student("Thomas",3)
        lbl_name.text = ""
        lbl_setStudent.text = ""
        for(student in mutStudentList)
            lbl_name.text = "${student.name}\n${lbl_name.text}"


        val test = mutStudentList.joinToString("\n",transform = {it.name})

        lbl_name.text = test

        val setStudent = setOf<Student>(Student("Julia",3),
            Student("Michael",2), Student("Markus",3), Student("Lukas",3),
            Student("Julia",3))

        lbl_setStudent.text =""

        for(student in setStudent) {
            if(student.name == "Julia")
                lbl_setStudent.text = student.name

        }

        val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
        val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
        val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

        /*
        val studentMap = mapOf<String, Student>("Student 1" to Student("Markus",3), "Student 2" to Student("Julia",3))

        for ((key,valu) in studentMap)
            lbl_setStudent.text = "Key: ${key} ; Value: ${valu.name} \n${lbl_setStudent.text}"
*/
    }
}
