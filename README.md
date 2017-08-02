
> **why?** calculate sum is used as a quick start template for [vangav backend](https://github.com/vangav/vos_backend) to help new users get to speed within the first 10 minutes; this template covers all the core basics to develop a fully functional backend service without a database

# calculate sum

+ calculate sum service is generated using [vangav backend](https://github.com/vangav/vos_backend)

## prerequisites

+ [vangav backend tutorials](https://github.com/vangav/vos_backend)

## functionality

+ this services takes two floating point numbers as a request and returns the summation of those numbers as a response

## overview

+ this service is based on vangav backend's [calculate sum template](https://github.com/vangav/vos_backend/tree/master/vangav_backend_templates/vos_calculate_sum)
+ this service has the 90+% of the vangav backend's generated code + the 10-% of the logic code needed to complete the service

## features

| controller | feature |
| ---------- | ------- |
| [calculate sum](https://github.com/vangav/vos_calculate_sum/tree/master/app/com/vangav/vos_calculate_sum/controllers/calculate_sum) | adds up two floating point numbers |

## api

### [calculate sum](https://github.com/vangav/vos_calculate_sum/tree/master/app/com/vangav/vos_calculate_sum/controllers/calculate_sum)

#### request

```json
  "type": "GET",
  "request_params": [
    {
      "name": "a",
      "type": "FLOAT",
      "is_array": false,
      "optionality": "MANDATORY"
    },
    {
      "name": "b",
      "type": "FLOAT",
      "is_array": false,
      "optionality": "MANDATORY"
    }
  ]
```

#### response

```json
  "response_type": "JSON",
  "response_params": [
    {
      "name": "c",
      "type": "double",
      "is_array": false
    }
  ]
```

#### example

+ request
`http://localhost:9000/calculate_sum?a=1.2&b=2.3`
+ response
```json
  {
    "c" : 3.5
  }
```





