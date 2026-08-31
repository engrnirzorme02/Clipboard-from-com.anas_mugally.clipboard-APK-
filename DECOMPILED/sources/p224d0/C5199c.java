package p224d0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.C2400k;
import java.util.ArrayList;

/* JADX INFO: renamed from: d0.c */
/* JADX INFO: loaded from: classes.dex */
public class C5199c {

    /* JADX INFO: renamed from: j */
    private static final ThreadLocal f19843j = new ThreadLocal();

    /* JADX INFO: renamed from: e */
    private InterfaceC5206j f19848e;

    /* JADX INFO: renamed from: i */
    public e f19852i;

    /* JADX INFO: renamed from: a */
    private final C2400k f19844a = new C2400k();

    /* JADX INFO: renamed from: b */
    final ArrayList f19845b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final b f19846c = new b();

    /* JADX INFO: renamed from: d */
    private final Runnable f19847d = new Runnable() { // from class: d0.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f19842a.f19846c.m24030a();
        }
    };

    /* JADX INFO: renamed from: f */
    long f19849f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f19850g = false;

    /* JADX INFO: renamed from: h */
    public float f19851h = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0.c$b */
    class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: a */
        public void m24030a() {
            C5199c.this.f19849f = SystemClock.uptimeMillis();
            C5199c c5199c = C5199c.this;
            c5199c.m24026f(c5199c.f19849f);
            if (C5199c.this.f19845b.size() > 0) {
                C5199c.this.f19848e.mo24036a(C5199c.this.f19847d);
            }
        }
    }

    /* JADX INFO: renamed from: d0.c$c */
    interface c {
        /* JADX INFO: renamed from: a */
        boolean mo24031a(long j7);
    }

    /* JADX INFO: renamed from: d0.c$d */
    public class d implements e {

        /* JADX INFO: renamed from: a */
        ValueAnimator.DurationScaleChangeListener f19854a;

        public d() {
        }

        @Override // p224d0.C5199c.e
        /* JADX INFO: renamed from: a */
        public boolean mo24033a() {
            if (this.f19854a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: d0.f
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f7) {
                    C5199c.this.f19851h = f7;
                }
            };
            this.f19854a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }

        @Override // p224d0.C5199c.e
        /* JADX INFO: renamed from: b */
        public boolean mo24034b() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f19854a);
            this.f19854a = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    /* JADX INFO: renamed from: d0.c$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo24033a();

        /* JADX INFO: renamed from: b */
        boolean mo24034b();
    }

    /* JADX INFO: renamed from: d0.c$f */
    static final class f implements InterfaceC5206j {

        /* JADX INFO: renamed from: a */
        private final Choreographer f19856a = Choreographer.getInstance();

        /* JADX INFO: renamed from: b */
        private final Looper f19857b = Looper.myLooper();

        f() {
        }

        @Override // p224d0.InterfaceC5206j
        /* JADX INFO: renamed from: a */
        public void mo24036a(final Runnable runnable) {
            this.f19856a.postFrameCallback(new Choreographer.FrameCallback() { // from class: d0.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    runnable.run();
                }
            });
        }

        @Override // p224d0.InterfaceC5206j
        /* JADX INFO: renamed from: b */
        public boolean mo24037b() {
            return Thread.currentThread() == this.f19857b.getThread();
        }
    }

    public C5199c(InterfaceC5206j interfaceC5206j) {
        this.f19848e = interfaceC5206j;
    }

    /* JADX INFO: renamed from: e */
    private void m24022e() {
        if (this.f19850g) {
            for (int size = this.f19845b.size() - 1; size >= 0; size--) {
                if (this.f19845b.get(size) == null) {
                    this.f19845b.remove(size);
                }
            }
            if (this.f19845b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f19852i.mo24034b();
            }
            this.f19850g = false;
        }
    }

    /* JADX INFO: renamed from: h */
    static C5199c m24023h() {
        ThreadLocal threadLocal = f19843j;
        if (threadLocal.get() == null) {
            threadLocal.set(new C5199c(new f()));
        }
        return (C5199c) threadLocal.get();
    }

    /* JADX INFO: renamed from: i */
    private boolean m24024i(c cVar, long j7) {
        Long l7 = (Long) this.f19844a.get(cVar);
        if (l7 == null) {
            return true;
        }
        if (l7.longValue() >= j7) {
            return false;
        }
        this.f19844a.remove(cVar);
        return true;
    }

    /* JADX INFO: renamed from: d */
    void m24025d(c cVar, long j7) {
        if (this.f19845b.size() == 0) {
            this.f19848e.mo24036a(this.f19847d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f19851h = ValueAnimator.getDurationScale();
                if (this.f19852i == null) {
                    this.f19852i = new d();
                }
                this.f19852i.mo24033a();
            }
        }
        if (!this.f19845b.contains(cVar)) {
            this.f19845b.add(cVar);
        }
        if (j7 > 0) {
            this.f19844a.put(cVar, Long.valueOf(SystemClock.uptimeMillis() + j7));
        }
    }

    /* JADX INFO: renamed from: f */
    void m24026f(long j7) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i7 = 0; i7 < this.f19845b.size(); i7++) {
            c cVar = (c) this.f19845b.get(i7);
            if (cVar != null && m24024i(cVar, jUptimeMillis)) {
                cVar.mo24031a(j7);
            }
        }
        m24022e();
    }

    /* JADX INFO: renamed from: g */
    public float m24027g() {
        return this.f19851h;
    }

    /* JADX INFO: renamed from: j */
    boolean m24028j() {
        return this.f19848e.mo24037b();
    }

    /* JADX INFO: renamed from: k */
    void m24029k(c cVar) {
        this.f19844a.remove(cVar);
        int iIndexOf = this.f19845b.indexOf(cVar);
        if (iIndexOf >= 0) {
            this.f19845b.set(iIndexOf, null);
            this.f19850g = true;
        }
    }
}
