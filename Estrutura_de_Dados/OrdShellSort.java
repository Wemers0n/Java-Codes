package Estrutura_de_Dados;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class OrdShellSort {

    public static void ShellSort(int[] arr){
        int sizeArr = arr.length;
        for (int gap = sizeArr / 2; gap > 0; gap /= 2){
            for (int i = gap; i < sizeArr; i++){
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap]  > temp){
                        arr[j] = arr[j - gap];
                        j -= gap;
                }
                arr[j] = temp;
            }
        }
    }

    public static void ShellSort(Stack<Integer> stack){
        int[] arr = new int[stack.size()];

        int i = 0;
        while (!stack.isEmpty()){
            arr[i++] = stack.pop();
        }
        ShellSort(arr);
        for(int valor : arr){
            stack.push(valor);
        }
    }

    public static void ShellSort(LinkedList<Integer> linkedList){
        int sizeLk = linkedList.size();
        for (int gap = sizeLk / 2; gap > 0; gap /= 2){
            for (int i = gap; i < sizeLk; i++){
                int temp = linkedList.get(i);
                int j = i;

                while (j >= gap && linkedList.get(j - gap) > temp){
                    linkedList.set(j, linkedList.get(j - gap));
                    j -= gap;
                }
                linkedList.set(j, temp);
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayDesordenado = {5, 17, 3, 12, 8, 19, 1, 14, 7, 10, 15, 6, 20, 2, 13, 18, 4, 9, 11, 16};
        int[] array1 = {4, 2, 7, 1};
        int[] array2 = {9, 5, 8, 3, 6, 2};
        int[] array3 = {11, 6, 9, 4, 1, 8, 7, 10, 3, 2};
        int[] array4 = {5, 8, 1, 4, 7, 2, 10, 3, 6, 9, 12, 11};

        System.out.println("\nArray Desordenado");

        System.out.print("Array 1: ");
        for (int arr : array1) {
            System.out.print(arr + " ");
        }

        System.out.print("\nArray 2: ");
        for (int arr : array2) {
            System.out.print(arr + " ");
        }

        System.out.print("\nArray 3: ");
        for (int arr : array3) {
            System.out.print(arr + " ");
        }

        System.out.print("\nArray 4: ");
        for (int arr : array4) {
            System.out.print(arr + " ");
        }

        System.out.print("\nArray Desordenado: ");
        for (int arr : arrayDesordenado) {
            System.out.print(arr + " ");
        }


        ShellSort(arrayDesordenado);
        ShellSort(array1);
        ShellSort(array2);
        ShellSort(array3);
        ShellSort(array4);

        System.out.println("\n\nArrays Ordenados");

        System.out.print("Array 1: ");
        for (int arr : array1) {
            System.out.print(arr + " ");
        }

        System.out.print("\nArray 2: ");
        for (int arr : array2) {
            System.out.print(arr + " ");
        }

        System.out.print("\nArray 3: ");
        for (int arr : array3) {
            System.out.print(arr + " ");
        }

        System.out.print("\nArray 4: ");
        for (int arr : array4) {
            System.out.print(arr + " ");
        }

        System.out.print("\nArray Desordenado: ");
        for (int arr : arrayDesordenado) {
            System.out.print(arr + " ");
        }

        // ----------------------------------------

        Stack<Integer> stackDesordenada = new Stack<>();

        // Adicionar elementos à pilha
        stackDesordenada.push(5);
        stackDesordenada.push(17);
        stackDesordenada.push(3);
        stackDesordenada.push(12);
        stackDesordenada.push(8);
        stackDesordenada.push(19);
        stackDesordenada.push(1);
        stackDesordenada.push(14);
        stackDesordenada.push(7);
        stackDesordenada.push(10);
        stackDesordenada.push(15);
        stackDesordenada.push(6);
        stackDesordenada.push(20);
        stackDesordenada.push(2);
        stackDesordenada.push(13);
        stackDesordenada.push(18);
        stackDesordenada.push(4);
        stackDesordenada.push(9);
        stackDesordenada.push(11);
        stackDesordenada.push(16);

        Stack<Integer> stackDesordenada2 = new Stack<>();

        // Adicionar elementos à pilha
        stackDesordenada2.push(5);
        stackDesordenada2.push(17);
        stackDesordenada2.push(3);
        stackDesordenada2.push(12);
        stackDesordenada2.push(8);
        stackDesordenada2.push(19);
        stackDesordenada2.push(1);
        stackDesordenada2.push(14);


        System.out.println("\n\nStack Desordenada");
        System.out.println(stackDesordenada);

        ShellSort(stackDesordenada2);

        System.out.println("\nStack Ordenada");
       for(Integer stack : stackDesordenada){
           System.out.print(stack + " ");
       }

        System.out.println("\n\nStack2 Desordenada");
        System.out.println(stackDesordenada2);

        ShellSort(stackDesordenada2);

        System.out.println("\nStack2 Ordenada");
        for(Integer stack : stackDesordenada2){
            System.out.print(stack + " ");
        }

       //--------------------------------------------------

        LinkedList<Integer> lkDesordenada = new LinkedList<>(List.of(5, 17, 3, 12, 8, 19, 1, 14, 7, 10, 15, 6, 20, 2, 13, 18, 4, 9, 11, 16));

        LinkedList<Integer> lkDesordenada2 = new LinkedList<>(List.of( 20, 2, 13, 18, 4, 9, 11, 16));

        System.out.println("\n\nLinkedList Desordenada");
        System.out.println(lkDesordenada);

        ShellSort(lkDesordenada);

        System.out.println("\nLinkedList Ordenada");
        System.out.println(lkDesordenada);

        System.out.println("\n\nLinkedList2 Desordenada");
        System.out.println(lkDesordenada2);

        ShellSort(lkDesordenada2);

        System.out.println("\nLinkedList2 Ordenada");
        System.out.println(lkDesordenada2);



    }
}
