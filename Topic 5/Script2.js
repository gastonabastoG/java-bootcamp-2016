db.studentReloaded.find(
    { "id_course.name":"math", "student_notes.final_note" : { $gte: 4 } },
    { "id_student.last_name":1, "id_student.first_name":1, "id_course.name":1, "student_notes.final_note":1 }
)