package student3;

import shared.Train;

public class JourneyLogManager {

    private static class Node {
        Train data;
        Node next;

        Node(Train data) {
            this.data = data;
            this.next = null;
        }
    }

 private Node top;
 private int size;
 private final int MAX_CAPACITY; // Fitur UAS: Batas Maksimum Log

 // Concstructor dengan batas kapasitas log
 public JourneyLogManager(int maxCapacity) {
    this.top = null;
    this.size = 0;
    this.MAX_CAPACITY = maxCapacity;
 }

 // Push dengan validasi kapasitas (Fitur UAS)
 public boolean push(Train train) {
    if (size >= MAX_CAPACITY) {
        System.out.prntln("⚠️ Kapasitas log penuh (" + MAX_CAPACITY + "). Gagal mencatat: " + train.getNmae());
        return false;
    }
    Node newNode = new Node(train)
    newNode.next = top;
    size++;
    System.out.println("✓ Log dicatat: " + train.getName() + " (" + train.getOrigin() + "->" + train.getDestination() + ")");
    return true;
 }
 
 // Pop dasar
 public Train pop() {
    if (isEmpty()) {
        System.out.println("❌ Error: Log perjalanan kosong. ");
        return null;
    }
    Train poppedData = top.data;
    top = top.next;
    size--;
    System.out.println("🗑️ Log dihapus: " + poppedData.getName());
 }

 // Fitur UAS: Pencarian Riwayat Kereta Berdasarkan Nama Statiun Tujuan
 public void searchByDestination(String destination) {
    System.out.println("\n🔍 Memproses Pencarian Tujuan: '" + destination + "'...");
    Node current = top;
    boolean found = false;

    while (current != null) {
        if (current.data.getDestination().equalsIgnoreCase(destination)) {
            System.out.println(" -> Ditemukan: " current.data.getName() + " | Asal: " + current.data.getOrigin() + " | Jam: " + current.data.getDepartureTime());
            found = true;
        }
        current = current.next;
    }

    if (!found) {
        System.out.println(" -> Tidak ada riwayat kereta menuju stasiun " + destination);
    }
 }

 // Fitur UAS: Reset / Hapus seluruh riwayat log
 public void clearAllLog() {
    this.top = null;
    this.size = 0;
    System.out.println("\n🧹Seluruh log perjalanan berhasil dikosongkan. ");
 }

 public Train peek() {
    return isEmpty() ? null : top.data;
 }

 public boolean isEmpty() {
    return top== null:
 }

 public int size() {
    return size;
 }

 public void displayLog() {
    if (isEmpty()) {
        System.out.println("\n--- Log Perjalanan Kosong ---");
        return;
    }

    System.out.println("\n=== Riwayat Log Perjalanan (Total: " + size + "/" + MAX_CAPACITY + ") ===");
    Node current = top;
    int index = size;

    while (current != null) {
        System.out.println(index + ". [" + current.data.getDepartureTime() + "] " +
                           current.data.getName() + " (" +
                           current.data.getOrigin() + " -> " +
                           current.data.getDestination() + ")");
        current =  current.next;
        index--;
    }
 }
 
 
 
 

 