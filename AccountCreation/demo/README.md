## API Endpoints

### Create Account

- **URL:** `/api/v1/account`
- **Method:** `POST`
- **Request Body:**
    ```json
    {
        "customerName": "Test",
        "customerMobile": "09081234567",
        "customerEmail": "test12345@gmail.com",
        "address1": "test",
        "address2": "test",
        "accountType": "S"
    }
    ```
- **Response:**
    - Success: `201 CREATED`
        ```json
        {
            "customerNumber": 12345678,
            "transactionStatusCode": 201,
            "transactionStatusDescription": "Customer account created"
        }
        ```
    - Failure: `400 BAD REQUEST`
        ```json
        {
            "transactionStatusCode": 400,
            "transactionStatusDescription": "Email is required field"
        }
        ```