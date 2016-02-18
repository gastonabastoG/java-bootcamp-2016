db.teacherReloaded.find(
    { "assigned_teacher.last_name":"Perez", "assigned_teacher.first_name":"Jose" },
    { name:1 }
    ).sort( { name: 1 } )