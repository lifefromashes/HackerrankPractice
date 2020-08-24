public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		Arrays.sort(array);
		List<Integer[]> triplets = new ArrayList<Integer[]>();
		for (int i = 0; i < array.length - 2; i++) {
			int left = i + 1;
			int right = array.length - 1;
			while (left < right) {
							int currSum = array[i] + array[left] + array[right];
				if(currSum == targetSum) {

				Integer [] newTriplet = {array[i], array[left], array[right]};
				
					triplets.add(newTriplet);
					left++;
					right--;
				} else if (currSum < targetSum) {
					left++;
				} else if (currSum > targetSum) {
					right--;
				}
			}
		}
		return triplets;
		
  }
}