package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.view.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2266b {

    /* JADX INFO: renamed from: a */
    private Object f7502a;

    /* JADX INFO: renamed from: b */
    private boolean f7503b;

    /* JADX INFO: renamed from: androidx.appcompat.view.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo9251a(AbstractC2266b abstractC2266b);

        /* JADX INFO: renamed from: b */
        boolean mo9252b(AbstractC2266b abstractC2266b, Menu menu);

        /* JADX INFO: renamed from: c */
        boolean mo9253c(AbstractC2266b abstractC2266b, Menu menu);

        /* JADX INFO: renamed from: d */
        boolean mo9254d(AbstractC2266b abstractC2266b, MenuItem menuItem);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo9352c();

    /* JADX INFO: renamed from: d */
    public abstract View mo9353d();

    /* JADX INFO: renamed from: e */
    public abstract Menu mo9354e();

    /* JADX INFO: renamed from: f */
    public abstract MenuInflater mo9355f();

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo9356g();

    /* JADX INFO: renamed from: h */
    public Object m9373h() {
        return this.f7502a;
    }

    /* JADX INFO: renamed from: i */
    public abstract CharSequence mo9357i();

    /* JADX INFO: renamed from: j */
    public boolean m9374j() {
        return this.f7503b;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo9358k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo9359l();

    /* JADX INFO: renamed from: m */
    public abstract void mo9360m(View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo9361n(int i7);

    /* JADX INFO: renamed from: o */
    public abstract void mo9362o(CharSequence charSequence);

    /* JADX INFO: renamed from: p */
    public void m9375p(Object obj) {
        this.f7502a = obj;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo9363q(int i7);

    /* JADX INFO: renamed from: r */
    public abstract void mo9364r(CharSequence charSequence);

    /* JADX INFO: renamed from: s */
    public void mo9365s(boolean z7) {
        this.f7503b = z7;
    }
}
