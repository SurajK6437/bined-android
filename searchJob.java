import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Job{
	public Integer st;
	public Integer ed;
	public Integer cost;
	
	public Job() {
		super();
	}

	public Job(Integer st, Integer ed, Integer cost) {
		super();
		this.st = st;
		this.ed = ed;
		this.cost = cost;
	}
}
class Pair{
	public Integer first;
	public Integer second;
	public Pair() {
		super();
	}
	public Pair(Integer first, Integer second) {
		super();
		this.first = first;
		this.second = second;
	}
}
class SortingJobs implements Comparator{

	@Override
	public int compare(Job o1, Job o2) {
		if(o1.eddp[i-1]) {
				dp[i]=curr;
				numOfJobs[i]=num;
			}else {
				dp[i]=dp[i-1];
				numOfJobs[i]=numOfJobs[i-1];
			}
		}
		return new Pair(numOfJobs[n-1],dp[n-1]);
	}
	private static int searchJob(Job[] arr, int st, int ed, int key) {
		int ans=-1;
		while(st<=ed) {
			int mid=(st+ed)/2;
			if(arr[mid].ed<=key) {
				ans=mid;
				st=mid+1;
			}else {
				ed=mid-1;
			}
		}
		return ans;
	}
	private static int getTime(String st) {
		int hr = (st.charAt(0)-'0')*10 + (st.charAt(1)-'0');
		int min = (st.charAt(2)-'0')*10 + (st.charAt(3)-'0');
		return hr*60 + min;
	}
}
