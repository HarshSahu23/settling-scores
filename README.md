# Settling Scores

A REST API project that processes and returns formatted data based on input requests.

## Objective

Build and deploy a REST API with one endpoint that accepts both GET and POST methods.

## Features

- POST method endpoint that processes JSON input and returns formatted data
- GET method endpoint that returns a hardcoded operation code
- Deployed on a cloud platform for easy access

## API Endpoints

### POST /bfhl

Accepts a JSON request and returns the following:

1. Status
2. User ID
3. College Email ID
4. College Roll Number
5. Array for numbers
6. Array for alphabets
7. Array with the highest lowercase alphabet

#### Example Request

```
POST https://your-api-url.com/bfhl
```

(Include a sample JSON request here)

#### Example Response

```json
{
  "is_success": true,
  "user_id": "john_doe_17091999",
  "email": "john@college.edu",
  "roll_number": "ABCD123",
  "numbers": ["1", "2", "3"],
  "alphabets": ["a", "b", "c"],
  "highest_alphabet": ["c"]
}
```

### GET /bfhl

Returns a hardcoded operation code.

#### Example Request

```
GET https://your-api-url.com/bfhl
```

#### Example Response

```json
{
  "operation_code": 1
}
```

## Installation and Setup
## Setup, Install, and Execute Instructions

### Prerequisites

- Java JDK 11 or later
- Maven 3.6 or later
- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Setup

1. Clone the repository:
   ```
   git clone https://github.com/HarshSahu23/settling-scores.git
   cd settling-scores
   ```

2. Open the project in your IDE

### Install Dependencies

Maven will handle the dependency installation. Run the following command in the project root directory:

```
mvn clean install
```

### Configure Application

1. Open `src/main/resources/application.properties`
2. Modify any necessary configurations (e.g., server port, database settings)

### Execute

#### Run using Maven

From the project root directory, run:

```
mvn spring-boot:run
```

#### Run using IDE

1. Locate the main class (usually annotated with `@SpringBootApplication`)
2. Right-click and select "Run" or "Debug"

### Access the Application

Once running, the API will be available at:

```
http://localhost:8080
```

(Note: The port may be different if you modified it in the application.properties)

### Testing

To run the tests, execute:

```
mvn test
```

### Building for Production

To create a production-ready JAR file, run:

```
mvn package
```

The JAR will be created in the `target` directory.

## Deployment

This API hasn't been deployed yet. But feel free to quickly run the project with a few commands. Apologies for any inconvenience.

## Technologies Used

- Java : SpringBoot

