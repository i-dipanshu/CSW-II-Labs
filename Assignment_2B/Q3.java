// Shortest remaining time next(SRTN) is a scheduling algorithm which
// serve first the process which having shortest remaining time among all
// the process. Write a java program which take N process burst time
// and print the scheduling sequence using SRTN.

package Assignment_2B;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();

        // Create an array of n processes
        Process[] processes = new Process[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the burst time of process " + (i + 1) + ": ");
            int burstTime = sc.nextInt();
            processes[i] = new Process(i + 1, burstTime);
        }

        sc.close();

        // Sort the processes by burst time
        Arrays.sort(processes, Comparator.comparingInt(p -> p.burstTime));

        // Create a priority queue to hold the processes with remaining time
        PriorityQueue<Process> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.remainingTime));

        int currentTime = 0;
        int completed = 0;
        int[] sequence = new int[n];
        int index = 0;

        while (completed < n) {
            // Add new processes that have arrived
            while (index < n && processes[index].burstTime <= currentTime) {
                queue.add(processes[index]);
                index++;
            }

            if (!queue.isEmpty()) {
                // Serve the process with the shortest remaining time
                Process p = queue.poll();
                sequence[completed] = p.pid;
                p.remainingTime--;
                if (p.remainingTime == 0) {
                    completed++;
                } else {
                    queue.add(p);
                }
            } else {
                // No process is currently available, so wait until the next process arrives
                currentTime = processes[index].burstTime;
            }
        }

        // Print the scheduling sequence
        System.out.print("Scheduling sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
        System.out.println();

    }
}

class Process {
    public int pid;
    public int burstTime;
    public int remainingTime;

    public Process(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}