# 🚗 Vehicle Insurance Management System

A **Full Stack Web Application** built using **Java, Spring Boot, MySQL** (Backend) and **HTML, CSS, JavaScript, Bootstrap** (Frontend). This system enables role-based access for **Admins and Users** to efficiently manage **Customers, Policies, and Claim Requests** through a clean and interactive user interface.

---

## 📌 Project Highlights

- **Full Stack Web Application** using Java Spring Boot (Backend) and HTML/CSS/JS (Frontend).
- **Role-Based Access:** Separate modules for Admin and Customer.
- **Customer Module:**
  - Customer Registration and Login.
  - Apply for Vehicle Insurance Policies.
  - Track Policy Application Status (Pending, Approved, Rejected).
  - Raise and Track Claim Requests.
  
- **Admin Module:**
  - View and Manage Customer Registrations.
  - Approve or Reject Policy Applications.
  - Handle Claim Requests (with reasons for rejection).
  - Create, Update, Delete, Search Policies.
  - View Claims and Policies Summary.

---

## 🛠️ Tech Stack

| Layer     | Technology               |
|-----------|---------------------------|
| Backend   | Java, Spring Boot, Spring MVC, JPA |
| Database  | MySQL                     |
| Frontend  | HTML, CSS, JavaScript, Bootstrap |
| Mail      | Spring Boot Mail (Gmail SMTP) |
| IDE       | Spring Tool Suite (STS)    |
| Build Tool| Maven                     |

---

## 📂 Project Structure

src/
├── main/
│ ├── java/com/vehicleinsurancesystem/
│ │ ├── Main Class with main() method
│ │ ├── Entity Classes (Customer, Policy, User, etc.)
│ │ ├── controller/ (All Controllers)
│ │ ├── service/ (All Services)
│ │ ├── repository/ (All Repositories)
│ │ └── exceptionhandling/ (Custom Exceptions)
│ └── resources/
│ ├── static/
│ │ ├── html/ (Frontend HTML Pages)
│ │ ├── css/ (CSS Files)
│ │ └── js/ (JavaScript Files)
│ └── application.properties (local only)
└── test/

yaml
Copy
Edit

---

## 🧑‍💻 How to Run the Project

1. **Clone the Repository:**
git clone https://github.com/BhoomikaEndirala/Vehicle-Insurance-System.git

Setup Database:

Create a database vehicleinsurancedb in MySQL.

Update your local application.properties (this file is ignored from Git for security):

spring.datasource.url=jdbc:mysql://localhost:3306/vehicleinsurancedb
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
spring.mail.username=YOUR_EMAIL
spring.mail.password=YOUR_GMAIL_APP_PASSWORD

Run the Application:

Open in Spring Tool Suite (STS).

Run as Spring Boot App.

Access the Application:

http://localhost:8080

🎯 Key Functionalities
🔑 Admin
Manage Policies (Add / Update / Delete / View / Search)

Approve / Reject Policies

Manage Claims (Approve / Reject with Remarks)

View all Customers and Applications

👤 Customer
Apply for Policies

View Application Status

Raise Claims

View Claim Status

🔮 Future Enhancements
PDF generation for insurance certificates.

JWT or OAuth-based Authentication.

Email notifications for all status updates.

Role-based dashboards for analytics.

✨ Best Practices Followed
Layered architecture: Controller → Service → Repository

Clean separation of concerns (MVC).

Validation on both frontend and backend.

.gitignore used for sensitive files (application.properties).

Proper error handling with custom exceptions.

🛑 Important
This project is developed for educational purposes only and not for real-world financial or insurance transactions.

