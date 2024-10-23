package com.divs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MergeOverlappingIntervals {
	
	
//	public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
//        int n = arr.length; // size of the array
//        //sort the given intervals:
//        Arrays.sort(arr, new Comparator<int[]>() {
//            public int compare(int[] a, int[] b) {
//                return a[0] - b[0];
//            }
//        });
//
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) { // select an interval:
//            int start = arr[i][0];
//            int end = arr[i][1];
//
//            //Skip all the merged intervals:
//            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
//                continue;
//            }
//
//            //check the rest of the intervals:
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j][0] <= end) {
//                    end = Math.max(end, arr[j][1]);
//                } else {
//                    break;
//                }
//            }
//            ans.add(Arrays.asList(start, end));
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
////        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
//        int[][] arr = {{1, 3}, {2,6}, {8,4}, {9,11},{8,10},{2,4},{15,18},{16,17},{19,16}};
//        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
//        System.out.print("The merged intervals are: \n");
//        for (List<Integer> it : ans) {
//            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
//        }
//        System.out.println();
//    }

//}

	public static void main(String[] args) {
//		 int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
		 int[][] arr = {{1, 3}, {2,6}, {8,4}, {9,11},{8,10},{2,4},{15,18},{16,17},{19,16}};
//		 bruteForceApproach(arr);
		 optimalApproach(arr);
		 

	}

	private static void optimalApproach(int[][] arr) {
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		for(int i=0;i<arr.length;i++) {
			if(list.isEmpty() || arr[i][0]>list.get(list.size()-1).get(1)) {
				list.add(Arrays.asList(arr[i][0],arr[i][1]));
			}else {
				list.get(list.size()-1).set(1, Math.max(arr[i][1],list.get(list.size()-1).get(1)));
			}
		}
		Iterator<List<Integer>> itr = list.iterator();
		for(List<Integer> ll:list) {
			System.out.println(ll);
		}
		
		
	}

	private static void bruteForceApproach(int[][] arr) {
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		for(int i=0;i<arr.length;i++) {
			int start=arr[i][0];
			int end=arr[i][1];
			
			if(!list.isEmpty() && end<=list.get(list.size()-1).get(1)) {
				continue;
			}
			for(int j=i+1;i<arr.length;j++) {
				if(arr[j][0]<=end) {
					end=Math.max(arr[j][1], end);
				}else {
					break;
				}
			}
			list.add(Arrays.asList(start,end));
		}
		
		Iterator<List<Integer>> itr = list.iterator();
		for(List<Integer> ll:list) {
			System.out.println(ll);
		}
		
		
	}

	
}
