package cn.edu.bjtu.svnteen.nourriture.utils;

import android.support.v4.app.Fragment;
import cn.edu.bjtu.svnteen.nourriture.fragment.FragmentControl;
import cn.edu.bjtu.svnteen.nourriture.fragment.MyFirstFragment;

/**
 * @author Tans
 * 所有的fragment的跳转必须在此写方法
 */
public class JumperUtils {

	// eg: 跳转到第一个fragment
	public static void JumpToFirst() {
		Fragment topF = FragmentControl.getInstance().getTopFragment();
		if (topF != null && topF instanceof MyFirstFragment) {
			return;
		}
		if (FragmentControl.getInstance().getFragment(
				MyFirstFragment.class.getName()) != null) {
			FragmentControl.getInstance().naviFragment(
					MyFirstFragment.class.getName());
		} else {
			MyFirstFragment f = new MyFirstFragment();
			JumpToMain(f, MyFirstFragment.class.getName());
		}
	}

	// 基本方法
	public static void JumpToMain(final Fragment fragment, final String tag) {
		FragmentControl.getInstance().showMainFrag(fragment, tag);
	}
}
