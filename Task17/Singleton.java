package Task17;

// Enum for UserRole
enum UserRole {
    ADMIN("Full access granted."),
    USER("Limited access granted."),
    GUEST("Read-only access granted.");

    private final String accessLevel;

    UserRole(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public void printAccessLevel() {
        System.out.println(accessLevel);
    }
}

// Enum for Days of the week
enum Day {
    MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false),
    SATURDAY(true), SUNDAY(true);

    private final boolean isWeekend;

    Day(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

// Enum for StatusCode
enum StatusCode {
    SUCCESS("Operation completed successfully"),
    ERROR("An error occurred"),
    PENDING("Operation is pending");

    private final String message;

    StatusCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

// Main class to test enums
public class Singleton {
    public static void main(String[] args) {
        // UserRole Enum Test
        UserRole role = UserRole.ADMIN;
        role.printAccessLevel();

        // Day Enum Test
        Day today = Day.SATURDAY;
        System.out.println(today + " is weekend: " + today.isWeekend());

        // StatusCode Enum Test
        StatusCode status = StatusCode.SUCCESS;
        System.out.println("Status: " + status + " - " + status.getMessage());
    }
}
