package p256h0;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC2599q;
import androidx.fragment.app.AbstractC2606x;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.lifecycle.AbstractC2650l;
import androidx.viewpager.widget.AbstractC2869a;

/* JADX INFO: renamed from: h0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5547r extends AbstractC2869a {

    /* JADX INFO: renamed from: c */
    private final AbstractC2599q f21378c;

    /* JADX INFO: renamed from: d */
    private final int f21379d;

    /* JADX INFO: renamed from: e */
    private AbstractC2606x f21380e;

    /* JADX INFO: renamed from: f */
    private AbstractComponentCallbacksC2591i f21381f;

    /* JADX INFO: renamed from: g */
    private boolean f21382g;

    public AbstractC5547r(AbstractC2599q abstractC2599q) {
        this(abstractC2599q, 0);
    }

    /* JADX INFO: renamed from: s */
    private static String m24931s(int i7, long j7) {
        return "android:switcher:" + i7 + ":" + j7;
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: a */
    public void mo683a(ViewGroup viewGroup, int i7, Object obj) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) obj;
        if (this.f21380e == null) {
            this.f21380e = this.f21378c.m12391n();
        }
        this.f21380e.mo12020k(abstractComponentCallbacksC2591i);
        if (abstractComponentCallbacksC2591i.equals(this.f21381f)) {
            this.f21381f = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: b */
    public void mo14319b(ViewGroup viewGroup) {
        AbstractC2606x abstractC2606x = this.f21380e;
        if (abstractC2606x != null) {
            if (!this.f21382g) {
                try {
                    this.f21382g = true;
                    abstractC2606x.mo12019j();
                    this.f21382g = false;
                } catch (Throwable th) {
                    this.f21382g = false;
                    throw th;
                }
            }
            this.f21380e = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: g */
    public Object mo686g(ViewGroup viewGroup, int i7) {
        if (this.f21380e == null) {
            this.f21380e = this.f21378c.m12391n();
        }
        long jM24932r = m24932r(i7);
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12379h0 = this.f21378c.m12379h0(m24931s(viewGroup.getId(), jM24932r));
        if (abstractComponentCallbacksC2591iM12379h0 != null) {
            this.f21380e.m12509f(abstractComponentCallbacksC2591iM12379h0);
        } else {
            abstractComponentCallbacksC2591iM12379h0 = mo687q(i7);
            this.f21380e.m12505b(viewGroup.getId(), abstractComponentCallbacksC2591iM12379h0, m24931s(viewGroup.getId(), jM24932r));
        }
        if (abstractComponentCallbacksC2591iM12379h0 != this.f21381f) {
            abstractComponentCallbacksC2591iM12379h0.m12125H1(false);
            if (this.f21379d == 1) {
                this.f21380e.mo12024r(abstractComponentCallbacksC2591iM12379h0, AbstractC2650l.b.STARTED);
                return abstractComponentCallbacksC2591iM12379h0;
            }
            abstractComponentCallbacksC2591iM12379h0.mo678N1(false);
        }
        return abstractComponentCallbacksC2591iM12379h0;
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: h */
    public boolean mo14322h(View view, Object obj) {
        return ((AbstractComponentCallbacksC2591i) obj).m12161b0() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: k */
    public void mo14325k(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: l */
    public Parcelable mo14326l() {
        return null;
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: m */
    public void mo14327m(ViewGroup viewGroup, int i7, Object obj) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) obj;
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f21381f;
        if (abstractComponentCallbacksC2591i != abstractComponentCallbacksC2591i2) {
            if (abstractComponentCallbacksC2591i2 != null) {
                abstractComponentCallbacksC2591i2.m12125H1(false);
                if (this.f21379d == 1) {
                    if (this.f21380e == null) {
                        this.f21380e = this.f21378c.m12391n();
                    }
                    this.f21380e.mo12024r(this.f21381f, AbstractC2650l.b.STARTED);
                } else {
                    this.f21381f.mo678N1(false);
                }
            }
            abstractComponentCallbacksC2591i.m12125H1(true);
            if (this.f21379d == 1) {
                if (this.f21380e == null) {
                    this.f21380e = this.f21378c.m12391n();
                }
                this.f21380e.mo12024r(abstractComponentCallbacksC2591i, AbstractC2650l.b.RESUMED);
            } else {
                abstractComponentCallbacksC2591i.mo678N1(true);
            }
            this.f21381f = abstractComponentCallbacksC2591i;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: o */
    public void mo14329o(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    /* JADX INFO: renamed from: q */
    public abstract AbstractComponentCallbacksC2591i mo687q(int i7);

    /* JADX INFO: renamed from: r */
    public long m24932r(int i7) {
        return i7;
    }

    public AbstractC5547r(AbstractC2599q abstractC2599q, int i7) {
        this.f21380e = null;
        this.f21381f = null;
        this.f21378c = abstractC2599q;
        this.f21379d = i7;
    }
}
