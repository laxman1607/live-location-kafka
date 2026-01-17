# Live Location Tracking System using Apache Kafka

## 📌 Overview
This project implements a real-time live location tracking system using Apache Kafka and Spring Boot.  
It follows a producer–consumer architecture where location data (latitude and longitude) is streamed in real time through Kafka topics.

---

## 🏗 System Architecture

Client (Postman / API)
        ↓
Spring Boot Producer
        ↓
Apache Kafka (Topic: live-location)
        ↓
Spring Boot Consumer

---

## 🛠 Technology Stack
- Java 17
- Spring Boot
- Apache Kafka
- Gradle
- REST APIs
- Postman (testing)

---

## 📡 Kafka Details
- **Topic Name:** `live-location`
- **Message Format:** Plain text (Latitude, Longitude)
- **Consumer Group:** `location-group`

---

## ⚙️ Producer Service
- Exposes a REST endpoint to receive live location data
- Publishes location messages to Kafka topic

### Endpoint
GET /location/send?lat={latitude}&lon={longitude}

shell
Copy code

### Example
GET /location/send?lat=12.9716&lon=77.5946

yaml
Copy code

---

## 📥 Consumer Service
- Listens to the Kafka topic `live-location`
- Consumes and logs real-time location updates

### Sample Output
LIVE LOCATION RECEIVED -> Lat:12.9716 Lon:77.5946

yaml
Copy code

---

## ▶️ How to Run the Project

### 1. Start Apache Kafka
Ensure Kafka broker is running on:
localhost:9092

markdown
Copy code

### 2. Run Producer Application
- Navigate to the Producer project
- Run the Spring Boot application

### 3. Run Consumer Application
- Navigate to the Consumer project
- Run the Spring Boot application

### 4. Test Using Postman
Send location updates via:
GET http://localhost:8080/location/send?lat=12.97&lon=77.59

yaml
Copy code

---

## ✅ Features
- Real-time location streaming
- Kafka-based asynchronous communication
- Producer–consumer decoupling
- Scalable and fault-tolerant design

---

## 🎯 Use Cases
- Live tracking systems
- Ride-sharing applications
- Logistics & delivery tracking
- IoT-based location monitoring

---

## 📌 Future Enhancements
- JSON-based message format
- WebSocket-based live dashboard
- GPS device integration
- Multi-consumer scaling

---

## 👤 Author
**Laxman Yabaji**

---

## 📄 License
This project is for learning and demonstration purposes.
