
public class findMinMaxRecurse {
	
	    // Divide & Conquer solution to find minimum and maximum number in an array
	    public static int[] minMax(int[] nums, int begin, int end)
	    {
	        // if array contains only one element
	    	int min = nums[0];
	    	int max = nums[0]; 
	    	
	    	int res[] = new int[2];
	        if (begin == end)            // common comparison
	        {
	            if (max < nums[begin]) {    // comparison 1
	                max = nums[begin];
	            }

	            if (min > nums[end]) {   // comparison 2
	                min = nums[end];
	            }

	            return res;
	        }

	        // if array contains only two elements

	        if (end - begin == 1)            // common comparison
	        {
	            if (nums[begin] < nums[end])       // comparison 1
	            {
	                if (min > nums[begin]) {    // comparison 2
	                    min = nums[begin];
	                    res[0]= min;
	                }

	                if (max < nums[end]) {   // comparison 3
	                    max = nums[end];
	                    res[1]= max;
	                }
	            }
	            else {
	                if (min > nums[end]) {   // comparison 2
	                    min = nums[end];
	                    res[0]=min;
	                }
	                
	                if (max < nums[begin]) {    // comparison 3
	                    max = nums[begin];
	                    res[1]= max;
	                }
	            }
	            
	            return res;
	        }

	        // find mid element
	        int mid = (begin + end) / 2;

	        // recurse for left sub-array
	        minMax(nums, begin, mid);

	        return minMax(nums, mid + 1, end);
	    }

	    public void main(String[] args)
	    {
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
			result =minMax(nums3, 5, 5);
			System.out.println("The numbers should be [5,5] " + "     " +result[0] + " and " + result[1]);
			result = minMax(nums4, 2, 20);
			System.out.println("The numbers should be [2,22] " + "    "+ result[0] + " and " + result[1]);
			result = minMax(nums5, 4, 6);
			System.out.println("The numbers should be [4,6] " + "     " + result[0] + " and " + result[1]);
			result = minMax(nums6, 6, 6);
			System.out.println("The numbers should be [6,6] " + "     " + result[0] + " and " + result[1]);
			result =  minMax(nums7, 0,5);
			System.out.println("The numbers should be [-11,-1]" + " " + result[0] + " and " + result[1]);

	    }
	}

