db.student_course.find().forEach(
function ( approvedStudent ) {
approvedStudent.id_student = db.student.find( { "id":approvedStudent.id_student } ).toArray();
approvedStudent.id_course = db.course.find( { "id":approvedStudent.id_course } ).toArray();
approvedStudent.student_notes = db.student_notes.find( { "id":approvedStudent.student_notes } ).toArray();
db.studentReloaded.insert(approvedStudent);
}
);

db.studentReloaded.find()