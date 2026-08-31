package p013B3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: B3.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0085b {

    /* JADX INFO: renamed from: a */
    private final View f467a;

    /* JADX INFO: renamed from: b */
    private boolean f468b = false;

    /* JADX INFO: renamed from: c */
    private int f469c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C0085b(InterfaceC0084a interfaceC0084a) {
        this.f467a = (View) interfaceC0084a;
    }

    /* JADX INFO: renamed from: a */
    private void m292a() {
        ViewParent parent = this.f467a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m10481g(this.f467a);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m293b() {
        return this.f469c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m294c() {
        return this.f468b;
    }

    /* JADX INFO: renamed from: d */
    public void m295d(Bundle bundle) {
        this.f468b = bundle.getBoolean("expanded", false);
        this.f469c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f468b) {
            m292a();
        }
    }

    /* JADX INFO: renamed from: e */
    public Bundle m296e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f468b);
        bundle.putInt("expandedComponentIdHint", this.f469c);
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    public void m297f(int i7) {
        this.f469c = i7;
    }
}
