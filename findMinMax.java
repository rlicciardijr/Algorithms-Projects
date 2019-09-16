//HW 5 Ron Licciardi 
public class findMinMax {
	public static void main(String[] args) {
		int nums1[] = { 2, 1, -2, 3, 8 };
		int nums2[] = { 6, 2, -4 };
		int nums3[] = { 5 };
		int nums4[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22 };
		int nums5[] = { 6, 4 };
		int nums6[] = { 6, 6, 6 };
		int nums7[] = { -1, -3, -5, -7, -9, -11 };
		int result[] = new int[2];
		result = minMax(nums1, 0, 4);
		System.out.println("The numbers should be [-2,8] " + "   " +result[0] + " and " + result[1] );
		result = minMax(nums2, 0, 2);
		System.out.println("The numbers should be [-4,6] " + "   " +result[0] + " and " + result[1]);
		result =minMax(nums3, 0, 0);
		System.out.println("The numbers should be [5,5] " + "     " +result[0] + " and " + result[1]);
		result = minMax(nums4, 0, 11);
		System.out.println("The numbers should be [2,22] " + "    "+ result[0] + " and " + result[1]);
		result = minMax(nums5, 0, 2);
		System.out.println("The numbers should be [4,6] " + "     " + result[0] + " and " + result[1]);
		result = minMax(nums6, 0, 3);
		System.out.println("The numbers should be [6,6] " + "     " + result[0] + " and " + result[1]);
		result =  minMax(nums7, 0,6);
		System.out.println("The numbers should be [-11,-1]" + " " + result[0] + " and " + result[1]);

	}

	public static int[] minMax(int nums[], int begin, int end) {
		end = nums[0];
		begin = nums[0];
		int[] res = new int[2];

		for (int i =0; i < nums.length; i++) 
		{
			if (nums[i] == 0) {

				return res;
			}
			if (nums[i] >= end) {
				end = nums[i];
				res[1] = end;
			}
			if (nums[i] <= begin) {
				begin = nums[i];
				res[0] = begin;
			}
		}
		for (int i = 0; i < res.length; i++) {
		
		}
		return res;
	}
}
