//Ron Licciardi Homework #4 find the median without sorting
public class medianAlgo {
	public static void main(String[] args) {

		int nums1[] = { 2, 1, 3, -2, 8 };
		int nums2[] = { -4, 6, 2 };
		int nums3[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22 };
		int nums4[] = { 4, 2, 48, 1, 50 };
		int nums5[] = { 6, 6, 6 };

		System.out.println("median is " + median(nums1) + " should be 2");
		System.out.println("median is " + median(nums2) + " should be 2");
		System.out.println("median is " + median(nums3) + " should be 12");
		System.out.println("median is " + median(nums4) + " should be 4");
		System.out.println("median is " + median(nums5) + " should be 6");

	}

	public static int median(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			int count = 0;
			for (int j = 0; j < nums.length; j++) {

				if (nums[j] < nums[i]) { // compare the elements of array
					count = count + 1;

				}

			}
			if (count == nums.length / 2) {// divide count by length /2
				return nums[i];				// return median
			}
		}
		return nums[0];
	}
}
