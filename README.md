# Spring Boot RabbitMQ Example

## 📌 Project Overview
This is a simple Spring Boot application that demonstrates how to integrate RabbitMQ for message queuing. It includes a producer (to send messages) and a consumer (to receive messages) using RabbitMQ.

## 🛠️ Technologies Used
- **Java** (Spring Boot)
- **RabbitMQ** (Message Broker)
- **Docker** (To run RabbitMQ locally)
- **Spring AMQP** (RabbitMQ integration for Spring)
- **Maven** (Dependency management)

## 🚀 Getting Started

### **1. Prerequisites**
Ensure you have the following installed:
- **Java 17 or later**
- **Maven**
- **Docker** (to run RabbitMQ locally)
- **Git** (for version control)

### **2. Running RabbitMQ Using Docker**
If you don’t have RabbitMQ installed, you can use Docker to run it:
```sh
# Pull and run RabbitMQ with the management UI
 docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```
- **5672** → Used for communication between applications.
- **15672** → RabbitMQ management UI (Access via browser: `http://localhost:15672`)
  
#### **Login Credentials for RabbitMQ UI:**
- **Username:** guest
- **Password:** guest

### **3. Clone the Repository**
```sh
git clone https://github.com/SachinPulse-bit/rabbit-spring-mq.git
cd rabbit-spring-mq
```

### **4. Build & Run the Application**
```sh
mvn clean install
mvn spring-boot:run
```

## 📡 How It Works
### **Message Flow:**
1. **Producer (MessagePublisher)** sends a message.
2. **RabbitMQ Exchange** routes the message to the appropriate queue.
3. **Queue (Configured in application.properties)** stores the message.
4. **Consumer (MessageListener)** receives and processes the message.

### **Configuration in `application.properties`**
```properties
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
```

## 🔗 API Endpoints
| Method | Endpoint | Description |
|--------|-------------|-------------------------------|
| POST | `/publish` | Sends a message to RabbitMQ |
| GET | `/consume` | Simulates message consumption |

## 📖 Notes for Future Reference
- **Queues, Routing Keys, and Exchanges can be changed** in the configuration.
- To check pending messages in RabbitMQ:
  - Open `http://localhost:15672` → **Queues** tab → Select the queue.
- If you don’t start the consumer service, messages remain in the queue until consumed.
- Use `docker ps` to check if RabbitMQ is running.
- If RabbitMQ stops unexpectedly, restart it with:
  ```sh
  docker start rabbitmq
  ```

## 📝 Contributing & Learning
This project is meant to help beginners understand **RabbitMQ with Spring Boot**. Feel free to contribute and suggest improvements!

## 📜 License
This project is open-source and free to use.


