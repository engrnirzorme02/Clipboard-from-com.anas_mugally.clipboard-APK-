package p111O;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;

/* JADX INFO: renamed from: O.o */
/* JADX INFO: loaded from: classes.dex */
public class C1064o {

    /* JADX INFO: renamed from: a */
    private final Context f3901a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1066p f3902b;

    /* JADX INFO: renamed from: c */
    private final b f3903c;

    /* JADX INFO: renamed from: d */
    private final a f3904d;

    /* JADX INFO: renamed from: e */
    private VelocityTracker f3905e;

    /* JADX INFO: renamed from: f */
    private float f3906f;

    /* JADX INFO: renamed from: g */
    private int f3907g;

    /* JADX INFO: renamed from: h */
    private int f3908h;

    /* JADX INFO: renamed from: i */
    private int f3909i;

    /* JADX INFO: renamed from: j */
    private final int[] f3910j;

    /* JADX INFO: renamed from: O.o$a */
    interface a {
        /* JADX INFO: renamed from: a */
        float mo4707a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7);
    }

    /* JADX INFO: renamed from: O.o$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo4701a(Context context, int[] iArr, MotionEvent motionEvent, int i7);
    }

    public C1064o(Context context, InterfaceC1066p interfaceC1066p) {
        this(context, interfaceC1066p, new b() { // from class: O.m
            @Override // p111O.C1064o.b
            /* JADX INFO: renamed from: a */
            public final void mo4701a(Context context2, int[] iArr, MotionEvent motionEvent, int i7) {
                C1064o.m4746c(context2, iArr, motionEvent, i7);
            }
        }, new a() { // from class: O.n
            @Override // p111O.C1064o.a
            /* JADX INFO: renamed from: a */
            public final float mo4707a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7) {
                return C1064o.m4749f(velocityTracker, motionEvent, i7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m4746c(Context context, int[] iArr, MotionEvent motionEvent, int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC1039c0.m4627g(context, viewConfiguration, motionEvent.getDeviceId(), i7, motionEvent.getSource());
        iArr[1] = AbstractC1039c0.m4626f(context, viewConfiguration, motionEvent.getDeviceId(), i7, motionEvent.getSource());
    }

    /* JADX INFO: renamed from: d */
    private boolean m4747d(MotionEvent motionEvent, int i7) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f3908h == source && this.f3909i == deviceId && this.f3907g == i7) {
            return false;
        }
        this.f3903c.mo4701a(this.f3901a, this.f3910j, motionEvent, i7);
        this.f3908h = source;
        this.f3909i = deviceId;
        this.f3907g = i7;
        return true;
    }

    /* JADX INFO: renamed from: e */
    private float m4748e(MotionEvent motionEvent, int i7) {
        if (this.f3905e == null) {
            this.f3905e = VelocityTracker.obtain();
        }
        return this.f3904d.mo4707a(this.f3905e, motionEvent, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static float m4749f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7) {
        AbstractC1024W.m4410a(velocityTracker, motionEvent);
        AbstractC1024W.m4411b(velocityTracker, zzbbn.zzq.zzf);
        return AbstractC1024W.m4413d(velocityTracker, i7);
    }

    /* JADX INFO: renamed from: g */
    public void m4750g(MotionEvent motionEvent, int i7) {
        boolean zM4747d = m4747d(motionEvent, i7);
        if (this.f3910j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f3905e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3905e = null;
                return;
            }
            return;
        }
        float fM4748e = m4748e(motionEvent, i7) * this.f3902b.mo4753b();
        float fSignum = Math.signum(fM4748e);
        if (zM4747d || (fSignum != Math.signum(this.f3906f) && fSignum != 0.0f)) {
            this.f3902b.mo4754c();
        }
        float fAbs = Math.abs(fM4748e);
        int[] iArr = this.f3910j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i8 = iArr[1];
        float fMax = Math.max(-i8, Math.min(fM4748e, i8));
        this.f3906f = this.f3902b.mo4752a(fMax) ? fMax : 0.0f;
    }

    C1064o(Context context, InterfaceC1066p interfaceC1066p, b bVar, a aVar) {
        this.f3907g = -1;
        this.f3908h = -1;
        this.f3909i = -1;
        this.f3910j = new int[]{C3553a.e.API_PRIORITY_OTHER, 0};
        this.f3901a = context;
        this.f3902b = interfaceC1066p;
        this.f3903c = bVar;
        this.f3904d = aVar;
    }
}
