# Tracking Microservice

This is a microservice developed using Spring Boot that tracks user and machine interactions on various platforms like mobile, web, desktop, and embedded devices. The microservice supports the creation of sessions for each user and machine interaction, with events being recorded and attached to each session.



## Installation

1. Clone this repository to your local machine using Git.
2. Navigate to the root directory of the project.
3. Build the project using the following command: 

```
./mvnw clean package
```

4. Start the microservice using the following command: 

```
java -jar target/tracking-microservice-0.0.1-SNAPSHOT.jar
```

## Usage

This microservice supports the following REST API endpoints:

### Start Session

```
POST /sessions
```

Creates a new session for the specified user or machine. The request body should contain the following JSON object:

```
{
  "userId": "asfla-asdf-asdfa",
  "machineId": "2343-asdf-fads",
  "startAt": "2022-05-09T10:15:30.00Z",
  "orgId": 11232
}
```

### End Session

```
PUT /sessions/{sessionId}
```

Ends the session with the specified ID. The request body should contain the following JSON object:

```
{
  "sessionId": "32342-234s-42343",
  "endAt": "2022-05-09T11:30:00.00Z"
}
```


### Add Events

```
POST /events
```

Adds a list of events to the session with the specified ID. The request body should contain the following JSON object:

```
[{
  "sessionId": "c28b425a-af8b-4eb7-9a74-6d9678395c6d",
  "eventAt": "2022-05-09T10:45:00.00Z",
  "eventType": "click",
  "payload": "{\"button\":\"click\"}"
},
{
  "sessionId": "c28b425a-af8b-4eb7-9a74-6d9678395c6d",
  "eventAt": "2022-05-09T10:45:00.00Z",
  "eventType": "click",
  "payload": "{\"button\":\"submit\"}"
}]
```

## Possible improvements

Change the post /events to:

```
POST /sessions/{sessionId}/events
```

Change the type of typeEvent into an Enumeration:

```
private EventType eventType;
```

Having sessionId as a Path variable, change the requestBody of PUT /sessions/{sessionId} and POST /sessions/{sessionId}/events

Add logs

Add tests

Add some validations