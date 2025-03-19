package Task16;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    String aadharNo;
    String mobileNo;
    String address;
    int priority;

    public Patient(String name, String aadharNo, String mobileNo, String address, int priority) {
        this.name = name;
        this.aadharNo = aadharNo;
        this.mobileNo = mobileNo;
        this.address = address;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', Aadhaar No.='" + aadharNo + "', Mobile No.='" + mobileNo +
                "', Address='" + address + "', Priority=" + priority + "}";
    }
}

public class HospitalQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        queue.add(new Patient("Pradeep", "123456789012", "9876543210", "pune, India", 2));
        queue.add(new Patient("Sachin", "987654321098", "8765432109", "indore, India", 1));
        queue.add(new Patient("Shailendra", "567890123456", "7654321098", "hyd, India", 3));

        System.out.println("Processing Patients in Order of Urgency:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
