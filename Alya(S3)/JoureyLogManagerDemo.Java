package student3;

import shared.Train;

public class JourneyLogManagerDemo {
    public static void main(String[] args) {
        // Inisialisasi Stack dengan kapasitas maksimal 3 data (Fitur UAS)
        JourneyLogManager logManager = new JourneyLogManager(3);

        System.out.println("--- 1. PENGUJIAN PUSH DATA ---");
        logManager.push(new Train("T001", "Argo Bromo", "Jakarta", "Surabaya", "07:00"));
        logManager.push(new Train("T002", "Gajayana", "Jakarta", "Malang", "08:30"));
        logManager.push(new Train("T003", "Taksaka", "Yogyakarta", "Jakarta", "06:00"));

        // Uji coba melebih batas kapasitas
        logManager.push(new Train("T004", "Lodaya", "Bandung", "Solo", "10:00"));

        // Tampilkan seluruh log
        logManager.displayLog();

        System.out.println("\n--- 2. PENGUJIAN FITUR SEARCH (UAS) ---");
        logManager.searchByDestination("Jakarta");
        logManager.searchByDestination("Bandung");

        System.out.println("\n--- 3. PENGUJIAN POP DATA ---");
        logManager.pop();
        logManager.displayLog();

        System.out.println("\n--- 4. PENGUJIAN CLEAR ALL LOG (UAS) ---");
        logManager.clearAllLog();
        logManager.displayLog();
    }
}