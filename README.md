# 🏥 Hospital Appointment System

## 📌 Overview
The Hospital Appointment System is a full-stack web application designed to simplify and digitize the process of booking medical appointments. It allows patients to easily schedule appointments and enables administrators to manage doctors efficiently.

---

## 🚀 Features
- 🔐 User & Admin Login System  
- 👨‍⚕️ Doctor Management (Add & View)  
- 📅 Appointment Booking  
- 📊 Real-time Data Storage using MySQL  
- 🌐 Responsive Web Interface  
- 🔄 REST API Integration  

---

## 🛠️ Tech Stack
- **Frontend:** HTML, CSS, JavaScript  
- **Backend:** Spring Boot (Java)  
- **Database:** MySQL  
- **API:** REST APIs  

---

## ⚙️ How It Works
1. User/Admin logs into the system  
2. Admin can add doctors with specialization  
3. Users can view doctors  
4. Users can book appointments  
5. Data is stored and managed in MySQL database  

---

## 🧪 API Endpoints

### 🔐 Authentication
- `POST /auth/register` → Register user  
- `POST /auth/login` → Login  

### 👨‍⚕️ Doctor
- `POST /doctor` → Add doctor  
- `GET /doctor` → Get all doctors  

### 📅 Appointment
- `POST /appointment` → Book appointment  
- `GET /appointment` → View appointments  

---

## 🗄️ Database
The system uses MySQL with the following tables:
- User  
- Doctor  
- Appointment  

---

