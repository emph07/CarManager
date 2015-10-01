# CarManager

Enables managing of information relevant  for a driver about his car like:
- history of service
- costs of service.


# DB

CREATE USER CAR_ADMIN IDENTIFIED BY secret;
GRANT connect,resource TO CAR_ADMIN;
GRANT select on dual TO CAR_ADMIN;
