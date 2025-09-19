# Transportation System Class Hierarchy

## Class Hierarchy Diagram

```
                    TRANSPORTATION
                    ├── ENGINE
                    ├── WHEELS
                    ├── STEERING_WHEEL
                    ├── CAPACITY
                    └── SPEED
                            │
                    ┌───────┼───────┐
                    │       │       │
            AIR_TRANSPORT   LAND_TRANSPORT   WATER_TRANSPORT
            ├── FUEL_TYPE  ├── NUMBER_OF_WHEELS  ├── DISPLACEMENT
            └── WINGSPAN   ├── ENGINE           └── MAX_RANGE
                    │       └── FUEL_TYPE
                    │               │
                    │       ┌───────┼───────┐
                    │       │       │       │
                    │   TRUCK    SUV   TRICYCLE  MOTORCYCLE  KARITON
                    │   ├── LOAD   ├── BRAND  ├── SIDECAR  ├── ENGINE  ├── PULLED_BY
                    │   ├── BRAND  ├── MODEL  ├── COLOR    ├── BRAND   └── MATERIAL
                    │   └── MODEL  └── FOUR_WHEEL_DRIVE  ├── ENGINE   ├── COLOR
                    │
            ┌───────┼───────┐
            │       │       │
        AIRPLANE  HELICOPTER  DRONE
        ├── AIRLINE  ├── ROTOR_PROP  ├── BATTERY_LIFE
        ├── NUM_ENGINES  ├── BLADE_LENGTH  ├── MAX_ALTITUDE
        └── FLIGHT_RANGE  ├── MAX_SPEED    └── CAMERA_TYPE
```

## Subclasses for Water Transport:
- **YACHT**: CREW_SIZE, SAIL, LUXURY_LEVEL
- **SUBMARINE**: MAX_DEPTH, CREW_SIZE, NUCLEAR_POWER
