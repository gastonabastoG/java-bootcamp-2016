db.course.find().forEach(
function ( newTeacher ) {
newTeacher.assigned_teacher = db.teacher.find( { "id":newTeacher.assigned_teacher } ).toArray();
db.teacherReloaded.insert( newTeacher );
}
);

db.teacherReloaded.find()