package p333q3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: q3.g */
/* JADX INFO: loaded from: classes2.dex */
public class C6832g {

    /* JADX INFO: renamed from: a */
    private long f27416a;

    /* JADX INFO: renamed from: b */
    private long f27417b;

    /* JADX INFO: renamed from: c */
    private TimeInterpolator f27418c;

    /* JADX INFO: renamed from: d */
    private int f27419d;

    /* JADX INFO: renamed from: e */
    private int f27420e;

    public C6832g(long j7, long j8) {
        this.f27418c = null;
        this.f27419d = 0;
        this.f27420e = 1;
        this.f27416a = j7;
        this.f27417b = j8;
    }

    /* JADX INFO: renamed from: b */
    static C6832g m29863b(ValueAnimator valueAnimator) {
        C6832g c6832g = new C6832g(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        c6832g.f27419d = valueAnimator.getRepeatCount();
        c6832g.f27420e = valueAnimator.getRepeatMode();
        return c6832g;
    }

    /* JADX INFO: renamed from: a */
    public void m29864a(Animator animator) {
        animator.setStartDelay(m29865c());
        animator.setDuration(m29866d());
        animator.setInterpolator(m29867e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m29868f());
            valueAnimator.setRepeatMode(m29869g());
        }
    }

    /* JADX INFO: renamed from: c */
    public long m29865c() {
        return this.f27416a;
    }

    /* JADX INFO: renamed from: d */
    public long m29866d() {
        return this.f27417b;
    }

    /* JADX INFO: renamed from: e */
    public TimeInterpolator m29867e() {
        TimeInterpolator timeInterpolator = this.f27418c;
        return timeInterpolator != null ? timeInterpolator : AbstractC6826a.f27405b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6832g)) {
            return false;
        }
        C6832g c6832g = (C6832g) obj;
        if (m29865c() == c6832g.m29865c() && m29866d() == c6832g.m29866d() && m29868f() == c6832g.m29868f() && m29869g() == c6832g.m29869g()) {
            return m29867e().getClass().equals(c6832g.m29867e().getClass());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m29868f() {
        return this.f27419d;
    }

    /* JADX INFO: renamed from: g */
    public int m29869g() {
        return this.f27420e;
    }

    public int hashCode() {
        return (((((((((int) (m29865c() ^ (m29865c() >>> 32))) * 31) + ((int) (m29866d() ^ (m29866d() >>> 32)))) * 31) + m29867e().getClass().hashCode()) * 31) + m29868f()) * 31) + m29869g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m29865c() + " duration: " + m29866d() + " interpolator: " + m29867e().getClass() + " repeatCount: " + m29868f() + " repeatMode: " + m29869g() + "}\n";
    }

    public C6832g(long j7, long j8, TimeInterpolator timeInterpolator) {
        this.f27419d = 0;
        this.f27420e = 1;
        this.f27416a = j7;
        this.f27417b = j8;
        this.f27418c = timeInterpolator;
    }
}
