package p333q3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* JADX INFO: renamed from: q3.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6827b {
    /* JADX INFO: renamed from: a */
    public static void m29846a(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Animator animator = (Animator) list.get(i7);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
