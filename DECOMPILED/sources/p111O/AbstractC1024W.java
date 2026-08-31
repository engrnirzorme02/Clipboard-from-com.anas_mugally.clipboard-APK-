package p111O;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: O.W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1024W {

    /* JADX INFO: renamed from: a */
    private static Map f3798a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: O.W$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static float m4415a(VelocityTracker velocityTracker, int i7) {
            return velocityTracker.getAxisVelocity(i7);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4410a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f3798a.containsKey(velocityTracker)) {
                f3798a.put(velocityTracker, new C1026X());
            }
            ((C1026X) f3798a.get(velocityTracker)).m4420a(motionEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4411b(VelocityTracker velocityTracker, int i7) {
        m4412c(velocityTracker, i7, Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static void m4412c(VelocityTracker velocityTracker, int i7, float f7) {
        velocityTracker.computeCurrentVelocity(i7, f7);
        C1026X c1026xM4414e = m4414e(velocityTracker);
        if (c1026xM4414e != null) {
            c1026xM4414e.m4421c(i7, f7);
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m4413d(VelocityTracker velocityTracker, int i7) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m4415a(velocityTracker, i7);
        }
        if (i7 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i7 == 1) {
            return velocityTracker.getYVelocity();
        }
        C1026X c1026xM4414e = m4414e(velocityTracker);
        if (c1026xM4414e != null) {
            return c1026xM4414e.m4422d(i7);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: e */
    private static C1026X m4414e(VelocityTracker velocityTracker) {
        return (C1026X) f3798a.get(velocityTracker);
    }
}
