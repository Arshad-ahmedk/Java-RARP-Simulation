# RARP Simulation

This project simulates the Reverse Address Resolution Protocol (RARP) using Java. It includes a simple network simulation where devices can request their IP address from a RARP server using their MAC address.

## Project Structure

rarp_simulation/  
├── src/  
│ ├── Device.java  
│ ├── RarpServer.java  
│ └── RarpSimulation.java  
└── README.md  



## How to Run

1. Navigate to the `src` directory.
2. Compile the Java files:
3. Run the simulation:

cd src  
javac Device.java RarpServer.java RarpSimulation.java  
java RarpSimulation  

## Description

- `Device.java`: Contains the `Device` class.
- `RarpServer.java`: Contains the `RarpServer` class.
- `RarpSimulation.java`: Contains the simulation logic where devices request their IP addresses from the RARP server.

## Example Output

Device(MAC: 00:1A:2B:3C:4D:5E, IP: 192.168.0.2)  
Device(MAC: 00:1A:2B:3C:4D:5F, IP: 192.168.0.3)  








