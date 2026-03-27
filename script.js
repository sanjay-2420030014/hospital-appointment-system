const base = "http://localhost:8080";

// TEMP USER ID (for demo)
let currentUserId = 1;

// LOGIN
async function login() {
    let res = await fetch(base + "/auth/login", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            username: document.getElementById("username").value,
            password: document.getElementById("password").value
        })
    });

    let data = await res.text();

    if (data.includes("ADMIN")) {
        window.location = "admin.html";
    } else if (data.includes("USER")) {
        window.location = "user.html";
    } else {
        alert("Invalid Login");
    }
}

// ADD DOCTOR
async function addDoctor() {
    await fetch(base + "/doctor", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            name: document.getElementById("dname").value,
            specialization: document.getElementById("dspec").value
        })
    });

    alert("Doctor Added!");
    loadDoctors();
}

// LOAD DOCTORS
async function loadDoctors() {
    let res = await fetch(base + "/doctor");
    let data = await res.json();

    let list = document.getElementById("doctorList");

    if (list) {
        list.innerHTML = "";

        data.forEach(d => {
            let li = document.createElement("li");
            li.innerHTML = `<b>${d.name}</b> - ${d.specialization} (ID: ${d.id})`;
            list.appendChild(li);
        });
    }
}

// BOOK APPOINTMENT
async function book() {
    await fetch(base + "/appointment", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            userId: currentUserId,
            doctorId: document.getElementById("did").value,
            date: document.getElementById("date").value
        })
    });

    alert("Appointment Booked Successfully!");
}

// LOAD APPOINTMENTS (ADMIN)
async function loadAppointments() {
    let res = await fetch(base + "/appointment");
    let data = await res.json();

    let list = document.getElementById("appointments");

    if (list) {
        list.innerHTML = "";

        data.forEach(a => {
            let li = document.createElement("li");
            li.innerHTML = `User ${a.userId} → Doctor ${a.doctorId} on ${a.date}`;
            list.appendChild(li);
        });
    }
}

// AUTO LOAD
loadDoctors();
loadAppointments();